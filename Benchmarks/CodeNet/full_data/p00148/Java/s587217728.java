#include <stdio.h>

int main(int argc,char* argv[]){
  
  int num;

  while(scanf("%d",&num) != EOF){
    int d = num % 39;
    if(d == 0){
      d = 39;
    }
    
    printf("3C%02d\n",d);
  }
  
  return 0;
  
}