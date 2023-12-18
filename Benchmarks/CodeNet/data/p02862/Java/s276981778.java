import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    sc.close();

    int mod = 1000000007;
    int[][] dp = new int[3][Y + 1];
    dp[0][0] = 1;

    for (int i = 1; i < X + 1; i++) {
      int i0 = i % 3;
      int i1 = (i - 1) % 3;
      int i2 = (i + 1) % 3;
      Arrays.fill(dp[i0], 0);
      for (int j = 0; j < Y + 1; j++) {
        if (2 <= j && dp[i1][j - 2] != 0)
          dp[i0][j] = (dp[i0][j] + dp[i1][j - 2]) % mod;
        if (1 <= j && dp[i2][j - 1] != 0)
          dp[i0][j] = (dp[i0][j] + dp[i2][j - 1]) % mod;
      }
    }
    long ans = dp[X % 3][Y];
    System.out.println(ans);
  }
}