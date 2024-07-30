package com.ssg.bidssgket.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "Bidssgket API 명세서",
                description = "Bidssgket API 명세서",
                version = "v1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi chatOpenApi() {

        // "/api/**" 경로에 매칭되는 API를 그룹화하여 문서화한다.
        String[] paths = {"/**"};

        return GroupedOpenApi.builder()
                .group("Bidssgket API") // 그룹 이름을 설정한다.
                .pathsToMatch(paths) // 그룹에 속하는 경로 패턴을 지정한다.
                .build();
    }


}
