#include<stdio.h>

int Main(void){
    int S, W;

    scanf("%d", &S);
    scanf("%d", &W);

    if(S <= W){
        printf("unsafe");
    }else{
        printf("safe");
    }

    return 0;
}