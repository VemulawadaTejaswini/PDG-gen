#include<stdio.h>

int main(void){
  long int a,b,k,r,ab;

  while(scanf("%ld %ld",&a,&b)!=EOF){
    if(a<b){//a>b
      k=a;
      a=b;
      b=k;
    }
    //最小公倍数＊最大公約数＝a＊b
    ab=a*b;
    while((r=a%b)!=0){
      a=b;
      b=r;
    }
    printf("%ld %ld\n",b,ab/b);  
  }
  return 0;
}

