
import java.util.Scanner;

public class Main {

  private static final int mod = 1000000007;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] val = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        val[i][j] = sc.nextInt();
      }
    }

    int ans = solve(val);
    System.out.println(ans);
  }

  private static int solve(int[][] val) {
    int n = val.length;
    int[] dp = new int[1 << n];
    dp[0] = 1;
    for (int mask = 0; mask < (1 << n) - 1; ++mask) {
      int a = numbersOf1(mask);
      for (int b = 0; b < n; b++) {
        if (val[a][b] == 1 && (mask & (1 << b)) == 0) {
          int mask2 = mask ^ (1 << b);
          dp[mask2] = addSelf(dp[mask2], dp[mask]);
        }
      }
    }
    return dp[(1 << n) - 1];
  }

  private static int numbersOf1(int mask) {
    String s = Integer.toBinaryString(mask);
    int count = 0;
    for (int i = 0; i < s.length(); ++i) {
      if (s.charAt(i) == '1') {
        count++;
      }
    }
    return count;
  }

  private static int addSelf(int s, int i) {
    s += i;
    if (s >= mod) {
      s -= mod;
    }
    return s;
  }
}
