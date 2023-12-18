#include<stdio.h>
#include<ctype.h>
int main(void){
  int n,k;
  scanf("%d %d",&n,&k);
  char str[n+1];
  scanf("%s",str);
  tolower(str[k-1]);
  printf("%s\n",str);
  return 0;
}