import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int X = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    Arrays.sort(a);

    long[][] dp = new long[2][X + 1];
    for (int i = 0; i <= X; i++) dp[0][i] = i;
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j <= X; j++) {
        int k = i % 2;
        dp[k][j] = (long) (i - 1) * dp[1 - k][j] % M;
        dp[k][j] += dp[1 - k][j % a[i - 1]];
        dp[k][j] %= M;
      }
    }
    System.out.println(dp[N % 2][X]);
  }
}
