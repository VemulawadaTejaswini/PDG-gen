import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int P = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    long[][] dp = new long[2][P];
    long res = 0;
    for (int i = 0; i < N; i++) {
      int a = S[i] - '0';
      dp[1][a % P] = 1;
      for (int j = 0; j < P; j++) {
        int k = (10 * j + a) % P;
        dp[1][k] += dp[0][j];
      }
      res += dp[1][0];
      System.arraycopy(dp[1], 0, dp[0], 0, P);
      Arrays.fill(dp[1], 0);
    }
    System.out.println(res);
  }
}
