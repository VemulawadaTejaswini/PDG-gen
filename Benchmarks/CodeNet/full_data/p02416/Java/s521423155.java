#include <stdio.h>
int main(void){
  int num,a;
  while(1){
      scanf("%d", &num);
      if(num==0)
      break;
      else{
      int sum = 0;
      while(num>0){
          a = num % 10;
          sum = sum + a;
          num = num / 10;
      }
       printf("%d\n", sum);

  }}
  return 0;

}
