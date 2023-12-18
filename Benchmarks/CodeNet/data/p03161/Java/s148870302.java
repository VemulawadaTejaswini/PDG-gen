import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = scan.nextInt();
    }
    scan.close();

    System.out.println(minCost(h, k));
  }

  private static int minCost(int[] heights, int k) {
    if (heights.length == 0)
        return 0;

    int[] dp = new int[heights.length];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for (int i = 0; i < heights.length; i++) {
        for (int j = i - 1; j >= Math.max(0, i - k); j--) {
            int currentCost = Math.abs(heights[i] - heights[j]);

            dp[i] = Math.min(dp[i], dp[j] + currentCost);
        }
    }

    return dp[dp.length - 1];
  }
}
