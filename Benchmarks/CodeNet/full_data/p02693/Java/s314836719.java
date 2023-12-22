#include<stdio.h>

int main(){
  int k=0;
  int a=0;
  int b=0;
  int ans=1;
  scanf("%d",&k);
  scanf("%d %d",&a,&b);
  while(a!=b){
    ans=a%k;
    a++;
    if(ans==0){
      printf("OK");
      return 0;
    }
  }
  printf("NG");
  return 0;
}