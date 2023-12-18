#include"stdio.h"
int main(){
    int n,i,e=0,res=300000;
    char s[300000];
    scanf("%d%s",&n,s);
    for(i=0;i<n;i++){
        if(s[i]=='E') e++;
    }
    for(i=0;i<n;i++){
        res=min(res,e);
        if(s[i]=='W') e++;
        if(s[i]=='E') e--;
    }
    printf("%d",res);
    return 0;
}
int min(int *a,int *b){
    if(a<b){
        return a;
    }
    else{
        return b;
    }
}
