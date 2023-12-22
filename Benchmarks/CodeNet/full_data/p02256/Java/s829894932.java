#include <stdio.h>

int main(){
  int a,b,rem,tmp;
  scanf("%d %d",&a,&b);
  if(a<b){
    tmp = a;
    a = b;
    b = tmp;
  }
  while(rem!=0){
    rem = a%b;
    a = b;
    b = rem;
  }
  printf("%d",a);
}

