import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    char[] D = scanner.next().toCharArray();
    int N = D.length;
    long[][] dp = new long[2][N + 1];
    dp[1][0] = 1;
    for (int i = 1; i <= N; i++) {
      if (D[i - 1] == '0') {
        dp[0][i] = 3 * dp[0][i - 1] % M;
        dp[1][i] = dp[1][i - 1];
      } else {
        dp[0][i] = (3 * dp[0][i - 1] % M + dp[1][i - 1]) % M;
        dp[1][i] = 2 * dp[1][i - 1] % M;
      }
    }
    System.out.println((dp[0][N] + dp[1][N]) % M);
  }
}
