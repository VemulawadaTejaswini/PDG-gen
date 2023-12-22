#include<stdio.h>
int main()
{
  int n,i,k,a,b,in=0,p;
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&a);
    for(k=1;k<=a;k+=2){
      if(k==1 && a==2){in++; break;}
      if(k==1)continue;
      if(a==2 || a==3 || a==5 || a==7){in++; break;}
      if(a!=2 && a%2==0)break;
      if(a!=3 && a%3==0)break;
      if(a!=5 && a%5==0)break;
      if(a!=7 && a%7==0)break;
      if((a%k)==0 && (a/k)!=1){
        break;
      }
      if(k>a/2){
        in++;
        break;
      }
      if(a%k==0 && a/k==1){in++; break;}
    }
  }
  printf("%d\n",in);
  return 0;
}

