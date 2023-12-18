#include<stdio.h>
#include<stdlib.h>
int main(){
long n,k,i,j,res,count=0,max;
char ch;
scanf("%d%ch%d",&n,&ch,&k);
if(n>k)
max=n;
else
max=k;
for(i=1;i<=max;i++){
for(j=1;j<=max;j++){
res=i*j;
if(res<=n)
count++;
}
}
printf("%d",count);
}