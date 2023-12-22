#include <stdio.h>
#include<math.h>
#include <stdlib.h>
int main(){
  int *n;
  int a,size,i,c;
  int count = 0;
  scanf("%d",&size);
  n = (int *)malloc(size * sizeof(int));

  for(c=0; c<size; c++){
    scanf("%d",&a);
    n[c] = a;
  }
  
  for(i=0;i<c;i++){
    if(isprime(n[i])==1) count++;;
  }
  printf("%d",count);
  return 0;
}

int isprime(int x){
  if(x == 2) return 1;
  if(x < 2 || x%2==0) return -1; 
  int i = 3;
  while(i <= sqrt(x)){
    if (x % i ==0) return -1;
    i = i+2;
  }
  return 1;
}

