#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main(void){
    long N,border;
    double probability=1,allP=0;
    scanf("%ld %ld",&N,&border);
    long i,j;
    //printf("N:%ld\n",N);
    double a=N;
    //printf("a:%f\n",a);
    for(i=1;i<=N;i++){
        if(border<=i){
            allP+=(1/a)*(N+1-i);
            break;
        }
        j=i;
        probability=1/a;
        //printf("(%lf)",probability);
        while(j<border){
            j=j<<1;
            //printf("%ld:",j);
            probability/=2;
        }
        //printf("(%lf)",probability);
        allP+=probability;
        //printf("\n");
    }
    printf("%lf",allP);
    return 0;
}