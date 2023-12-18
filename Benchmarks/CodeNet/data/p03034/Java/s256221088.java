import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long[] s = new long[N];
    for (int i = 0; i < N; i++) s[i] = scanner.nextInt();

    long max = 0;
    long[] dp = new long[N + 1];
    for (int d = 1; d < N; d++) {
      int maxn = N - d;
      if ((N - 1) % d == 0) maxn = N / 2;
      for (int k = 1; k * d < maxn; k++) {
        dp[k] = dp[k - 1] + s[k * d] + s[N - 1 - k * d];
        max = Math.max(max, dp[k]);
      }
    }
    System.out.println(max);
  }
}
