
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
#include <stdio.h>
 
using namespace std;
 
int main(){
    int a,b;
    scanf("%d %d",&a,&b);
    if(a > b){
        printf("a > b\n");
    }else if(a < b){
        printf("a < b\n");
    }else{
        printf("a == b\n");
    }
}
