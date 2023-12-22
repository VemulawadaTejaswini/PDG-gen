#include <stdio.h>
int fib(int);

int main(){
    int n = 0;
    scanf("%d", &n);
    printf("%d\n", fib(n) );
    return 0;
}

int fib( int n ){
    int ans = 1;
    if( n > 0 ){
        ans = fib(n - 1) + fib(n - 2);
    }
    return ans;
}

