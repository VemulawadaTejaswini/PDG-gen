import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long[] a = new long[N];
    long[] s = new long[N + 1];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      s[i + 1] = s[i] + a[i];
    }

    long[][] dp = new long[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) dp[i][j] = Long.MAX_VALUE;
    for (int i = 0; i < N; i++) dp[i][i] = 0;
    for (int l = 1; l < N; l++) {
      for (int i = 0; i < N - l; i++) {
        int j = i + l;
        for (int k = i; k < j; k++) {
          dp[i][j] = Math.min(dp[i][j], s[j + 1] - s[i] + dp[i][k] + dp[k + 1][j]);
        }
      }
    }
    System.out.println(dp[0][N - 1]);
  }
}
