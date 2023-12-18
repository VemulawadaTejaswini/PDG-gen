import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    long[][] dp = new long[N][N];
    dp[0][0] = 1;
    for (int i = 1; i < N; i++) {
      if (s[i - 1] == '<') for (int j = 1; j <= i; j++) dp[i][j] = (dp[i][j - 1] + dp[i - 1][j - 1]) % M;
      else for (int j = i - 1; j >= 0; j--) dp[i][j] = (dp[i][j + 1] + dp[i - 1][j]) % M;
    }
    long res = 0;
    for (int i = 0; i < N; i++) {
      res += dp[N - 1][i];
      if (res > M) res -= M;
    }
    System.out.println(res);
  }
}
