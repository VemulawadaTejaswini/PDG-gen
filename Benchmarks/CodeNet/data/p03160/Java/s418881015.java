import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++) h[i] = in.nextInt();
    int[] dp = new int[n];
    dp[0] = 0;
    dp[1] = Math.abs(h[0] - h[1]);
    for (int i = 2; i < n; i++) {
      int x = Math.abs(h[i] - h[i - 2]);
      int y = Math.abs(h[i] - h[i - 1]);
      dp[i] = Math.min(dp[i-2] + x,dp[i-1] + y);
    }
    System.out.println(dp[n-1]);
  }
}