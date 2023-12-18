import java.util.Arrays;
import java.util.Scanner;

 class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int inf = (int) 1e9 + 5;
        int[] h = new int[n];
        for (int i = 0; i < n; i++) h[i] = sc.nextInt();
        int[] dp = new int[n];
        Arrays.fill(dp, 1, n, inf);
        System.out.println(Arrays.toString(dp));
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
          int[] a = {i + 1, i + 2};
          for (int j : a)
            if (j < n) {
              dp[j] = Math.min(dp[j], dp[i] + Math.abs(h[i] - h[j]));
            }
        }
        System.out.println(dp[n - 1]);
  }
}
