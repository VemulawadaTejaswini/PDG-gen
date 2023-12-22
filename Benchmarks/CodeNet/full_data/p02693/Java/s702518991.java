#include<stdio.h>

int main(void){
    int K, A, B;

    scanf("%d", &K);
    scanf("%d", &A);
    scanf("%d", &B);

    for(int i = 0; K <= B; i++){
        K = K * i;
        if(K >= A && K <= B){
            printf("OK");
            break;
        }
    }

    if(K > B){
        printf("NG");
    }

    return 0;
}