import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int L = scanner.nextInt();
    int[] a = new int[L + 1];
    for (int i = 1; i <= L; i++) a[i] = scanner.nextInt();

    long[][] dp = new long[L + 1][5];
    for (int i = 1; i <= L; i++) {
      int f = a[i] % 2 == 0 ? 0 : 1;
      if (a[i] == 0) f = 2;
      int g = a[i] % 2 == 1 ? 0 : 1;

      dp[i][0] = dp[i - 1][0] + a[i];
      dp[i][1] = min(dp[i - 1][0], dp[i - 1][1]) + f;
      dp[i][2] = min(dp[i - 1][0], dp[i - 1][1], dp[i - 1][2]) + g;
      dp[i][3] = min(dp[i - 1][0], dp[i - 1][1], dp[i - 1][2], dp[i - 1][3]) + f;
      dp[i][4] = min(dp[i - 1][0], dp[i - 1][1], dp[i - 1][2], dp[i - 1][3], dp[i - 1][4]) + a[i];
    }

    long min = dp[L][0];
    for (int i = 1; i < 5; i++) min = Math.min(min, dp[L][i]);
    System.out.println(min);
  }

  private static long min(long... args) {
    long m = Long.MAX_VALUE;
    for (long a : args) m = Math.min(m, a);
    return m;
  }
}
