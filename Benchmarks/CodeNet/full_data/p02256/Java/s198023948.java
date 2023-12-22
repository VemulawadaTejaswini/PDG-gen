#include <stdio.h>

int main(){
  int x, y;
  int r;
  scanf("%d%d",&x,&y);
  while(0!=y){
    r=x%y;
    x=y;
    y=r;
  }
  printf("%d\n",x);
  return 0;
}

