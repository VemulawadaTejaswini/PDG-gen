#include<stdio.h>

int main(void){
  long int a,b,k,r,ab;

  while(scanf("%ld %ld",&a,&b)!=EOF){
    if(a<b){
      k=a;
      a=b;
      b=k;
    }
    ab=a*b;
    while((r=a%b)!=0){
      a=b;
      b=r;
    }
    printf("%ld %ld\n",b,ab/b);  
  }
  return 0;
}

