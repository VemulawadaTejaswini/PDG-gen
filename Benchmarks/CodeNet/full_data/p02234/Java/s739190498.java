#include <stdio.h>
#define max 1000
int n;
 int m[max][max],p[max];


int main(){
  int c,r;
  int i,k;
 
  scanf("%d",&n);
  for(i=1;i<n+1;i++){
    scanf("%d %d",&p[i-1],&p[i]);
  }
  printf("%d\n", optimalParenthesization());
}

int optimalParenthesization(){
  int l,i,j;
  for(i=1;i<n+1;i++) m[i][i]=0;
  for(l=2;l<n+1;l++){  
    for(i=1;i<n+1;i++){
       j = i + l -1;
       
      m[i][j] = min(i,j);
    }
  }
 
  return m[1][n];
}
int min(int i,int j){
  int min,k;
  for(k=i; k<=j; k++){
    m[i][j] = m[i][k] + m[k+1][j] +p[i-1]*p[k]*p[j];
    
    if(k==i) min = m[i][j];
    if(k>i && m[i][j] < min) min = m[i][j];
  }
  // printf("i = %d,j = %d,%d\n",i,j,min);
  return min;
}

