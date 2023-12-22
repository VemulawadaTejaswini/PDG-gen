#include <stdio.h>
  
int main(){
  char c,m,s;
  int i,j, temp[26]={0};
  while(scanf("%c", &s) != EOF){
    for(j=0,c='a',m='temp';j<26;j++,c++,m++){
      if((int)s>=97&&(int)s<=122){
    if(c==s)temp[(int)c-97]++;
      }else if((int)s>=65&&(int)s<=90){
    if(m==s)temp[(int)m-65]++;
      }
    }
  }
  for(i=0,c='a';i<26;i++,c++){
    printf("%c : %d\n",c,temp[i]);
  }
  return 0;
}