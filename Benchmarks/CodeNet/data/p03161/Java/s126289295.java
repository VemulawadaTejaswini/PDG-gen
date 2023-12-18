import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] nums = new int[n];
    int[] dp = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    sc.close();
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      int min = Integer.MAX_VALUE;
      for (int j = 1; j <= k && i + j < n; j++) {
        int temp = dp[i] + Math.abs(nums[i] - nums[i + j]);
        min = Math.min(min, temp);
      }
      dp[i + j] = min;
    }
    System.out.println(dp[n - 1]);
  }
}