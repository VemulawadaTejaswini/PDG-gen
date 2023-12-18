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
    int s = 0;
    for (int i = 1; i <= N; i++) {
      s += a[i - 1];
      for (int j = i; j >= 1; j--) {
        for (int k = s; k >= a[i - 1]; k--) {
          dp[j][k] += dp[j - 1][k - a[i - 1]];
          if (dp[j][k] >= M) dp[j][k] -= M;
        }
      }
    }
    long sum = modpow(3, N, M);
    sum -= modpow(2, N, M) * 3 % M;
    if (sum < 0) sum += M;
    for (int j = 1; j <= N; j++) {
      for (int k = (MAX_SUM + 1) / 2; k <= MAX_SUM; k++) {
        long d = modpow(2, N - j, M) - 2;
        if (d < 0) d += M;
        d *= dp[j][k];
        d %= M;
        d *= 3;
        d %= M;
        sum -= d;
        if (sum < 0) sum += M;
      }
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
