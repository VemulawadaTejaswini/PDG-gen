import java.util.*;
import java.util.stream.*;

public class Main {
  public static int MOD = 1_000_000_007;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int H = in.nextInt(), W = in.nextInt(), K = in.nextInt();
    int[][] dp = new int[H + 1][W];
    dp[0][0] = 1;
    for (int i = 0; i < H; i++) {
      for (int k = 0; k < Math.pow(2, W - 1); k++) {
        int val = k;
        int[] arr = new int[W - 1];
        for (int j = 0; j < W - 1; j++) {
          arr[j] = val % 2;
          val /= 2;
        }
        boolean valid = true;
        for (int j = 1; j < W - 1; j++) {
          if (arr[j - 1] == 1 && arr[j] == 1) {
            valid = false;
          }
        }
        if (!valid) {
          continue;
        }
        for (int j = 0; j < W; j++) {
          if (j - 1 >= 0 && arr[j - 1] == 1) {
            dp[i + 1][j - 1] += dp[i][j];
          }
          if (j + 1 < W && arr[j] == 1) {
            dp[i + 1][j + 1] += dp[i][j];
          }
          boolean left = j == 0 ? true : arr[j - 1] == 0;
          boolean right = j == W - 1 ? true : arr[j] == 0;
          if (left && right) {
            dp[i + 1][j] += dp[i][j];
          }
        }
        for (int j = 0; j < W; j++) {
          dp[i + 1][i] %= MOD;
        }
      }
    }
    System.out.println(dp[H][K - 1] % MOD);
  }
}
