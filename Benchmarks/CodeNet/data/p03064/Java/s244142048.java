import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final long M = 998244353L;
    int N = scanner.nextInt();
    int[] a = new int[N];
    int MAX_SUM = 0;
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      MAX_SUM += a[i];
    }

    long[][] dp = new long[N + 1][MAX_SUM + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j <= MAX_SUM; j++) {
        dp[i][j] = dp[i - 1][j] * 2;
        dp[i][j] %= M;
        if (j >= a[i - 1]) {
          dp[i][j] += dp[i - 1][j - a[i - 1]];
          dp[i][j] %= M;
        }
      }
    }

    long cnt = 0;
    if (MAX_SUM % 2 == 0) {
      long[][] dp2 = new long[N + 1][MAX_SUM + 1];
      dp2[0][0] = 1;
      for (int i = 1; i <= N; i++) {
        for (int j = 0; j <= MAX_SUM; j++) {
          dp2[i][j] = dp2[i - 1][j];
          if (j >= a[i - 1]) {
            dp2[i][j] += dp2[i - 1][j - a[i - 1]];
            dp2[i][j] %= M;
          }
        }
      }
      cnt = dp2[N][MAX_SUM / 2];
      cnt *= modpow(2, M - 2, M);
      cnt *= 6;
      cnt %= M;
    }

    long sum = modpow(3, N, M);
    sum += cnt;
    sum %= M;
    for (int i = (MAX_SUM + 1) / 2; i <= MAX_SUM; i++) {
      long d = dp[N][i] * 3 % M;
      sum -= d;
      if (sum < 0) sum += M;
    }
    System.out.println(sum);
  }

  private static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }
}
