#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

#define L 10000

#define MIN(a,b) ((a) < (b) ? (a) : (b)) 

int main()
{
    int N, K;

    scanf("%d%d",&N,&K);

    int h[N], dp[L];
    
    for (int i = 0; i < N; i++) {
        scanf("%d", &h[i]);
        dp[i] = INT_MAX;
    }

    dp[0] = 0;
    

    for (int i = 0; i < N; i++) {
        for (int j = 1; j <= K; j++) {
            if (i + j < N) {
                dp[i+j] = MIN(dp[i+j], dp[i] + abs(h[i] - h[i+j]));
            }
        }
    }

    printf("%d", dp[N-1]);

    return 0;
    

}