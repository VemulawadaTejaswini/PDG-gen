#include "stdio.h"

int main(){
    int A,B,K,i=0;
    scanf("%d%d%d",&A,&B,&K);
    for(i=0;i<K;i++){
        printf("%d\n",A);
        A++;
    }
    for(i=0;i<K;i++){
        printf("%d\n",B);
        B--;
    }
    return 0;
}