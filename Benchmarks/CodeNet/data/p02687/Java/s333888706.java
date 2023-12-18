#include <stdio.h>
#include <stdlib.h>

int main(int argc, const char * argv[]) {
    int n, count = 0;
    scanf("%d", &n);
    
    int A[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &A[i]);
    }

    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(j - 1 == abs(A[i]-A[j])){
                count++;
            }
        }
    }
    
    printf("%d", count);
    
    return 0;
}
