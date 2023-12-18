import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    long[][] dp = new long[N][K + 1];
    for (int i = 0; i <= a[0]; i++) dp[0][i] = 1;
    for (int i = 1; i < N; i++) {
      long sum = 0;
      for (int j = 0; j <= K; j++) {
        sum += dp[i - 1][j];
        if (j > a[i]) sum -= dp[i - 1][j - a[i] - 1];
        if (sum > M) sum -= M;
        if (sum < 0) sum += M;
        dp[i][j] = sum;
      }
    }
    System.out.println(dp[N - 1][K]);
  }
}
