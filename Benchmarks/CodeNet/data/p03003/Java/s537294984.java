import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  private static final int mod = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nums = sc.nextLine().split(" ");
    int n = Integer.parseInt(nums[0]);
    int m = Integer.parseInt(nums[1]);
    int[] s = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] t = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    sc.close();
    long[][] dp = new long[n + 1][m + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= n; i++) dp[i][0] = 1L;
    for (int i = 1; i <= m; i++) dp[0][i] = 1L;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - (s[i - 1] != t[j - 1] ? dp[i - 1][j - 1] : 0);
        if (dp[i][j] >= mod) dp[i][j] -= mod;
      }
    }
    System.out.println(dp[n][m]);
  }
}