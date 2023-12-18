#include<stdio.h>
void main(){
	int n;
    scanf("%d",&n);
    int flag = 0,rem = 0;
    while(n!=0){
    rem = n%10;
    if(rem == 7){
    printf("YES");
    flag = 1;
    }
    n /=10;
    }
    if(flag == 0){
    printf("NO");
    }
    }
    