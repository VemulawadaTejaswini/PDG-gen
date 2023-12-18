#include<stdio.h>

int main()
{
    int a,b,c;
    scanf("%d%d%d",&a,&b,&c);
    if((a>=-100 && a<=100) && (b>=-100 && b<=100) && (c>=-100 && c<=100)){
        if(c>=a && c<=b){
            printf("Yes\n");
        }
        else{
            printf("No\n");
        }
    }
    return 0;
}
