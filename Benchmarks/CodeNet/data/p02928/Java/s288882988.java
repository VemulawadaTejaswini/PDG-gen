#include <stdio.h>
#define long long long int

const int MOD = 1000000007;

int main(void)
{
  int N;
  long long int K;
  scanf("%d %lld", &N, &K);
  int A[N];
  for (int i = 0; i < N; i++)
    scanf("%d", &A[i]);
  int n1 = 0;
  int n2 = 0;
  for (int i = 0; i < N; i++) {
      int Ai = A[i];
      for (int j = 0; j < i; j++)
          if(Ai > A[j])
              n1++;
      for (int j = i+1; j < N; j++)
          if(Ai > A[j])
              n2++;
  }
  printf("K = %ld\nn1 = %d\nn2 = %d\n", K, n1, n2);
  long long int num = K*(K-1)/2%MOD*n1+K*(K+1)/2%MOD*n2;
  printf("%lld\n", num%MOD);
  return 0;
}
