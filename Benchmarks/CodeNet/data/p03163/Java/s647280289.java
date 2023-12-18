import java.util.Scanner;
class Main {
  public static long knapsack1(int N, int[] W, long[] V, int maxWeight) {
        long[][] dp = new long[N][maxWeight+1];

        for(int j=0;j<=maxWeight;++j) dp[0][j] = W[0] <= j ? V[0] : 0;

        for (int i = 1; i < N; ++i) {
            for (int j = 1; j <= maxWeight; ++j) {
                if (W[i] <= j)
                    dp[i][j] = Long.max(dp[i-1][j - W[i]] + V[i], dp[i - 1][j]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[N-1][maxWeight];
    }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int maxW = sc.nextInt();
    int[] W = new int[N];
    long[] V = new long[N];
    for(int i=0;i<N;++i) {
      W[i] = sc.nextInt();
      V[i] = sc.nextLong();
    }
    long res = knapsack1(N, W, V, maxW);
    System.out.println(res);
  }
}