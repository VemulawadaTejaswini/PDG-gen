import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    long[][] dp = new long[N][K + 1];
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      if (i == 0) for (int j = 0; j <= a; j++) dp[0][j] = 1;
      else {
        long sum = 0;
        for (int j = 0; j <= K; j++) {
          sum += dp[i - 1][j];
          if (j > a) sum -= dp[i - 1][j - a - 1];
          dp[i][j] = sum % M;
        }
      }
    }

    System.out.println(dp[N - 1][K]);
  }
}
