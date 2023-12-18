import java.util.*;
import java.io.*;
import java.math.*;

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
    Arrays.fill(dp, 1000000);
    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= k; j++) {
        if (i >= j) {
          dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(nums[i] - nums[i - j]));
        } else {
          break;
        }
      }
    }
    System.out.println(dp[n - 1]);
  }
}