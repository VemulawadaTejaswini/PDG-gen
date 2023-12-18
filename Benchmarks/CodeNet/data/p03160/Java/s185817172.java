import java.util.*;

public class Main {
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int[] dp = new int[h.length];

        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);
        for (int i = 2; i < h.length; i++) {
            int v1 = Math.abs(h[i] - h[i-2]) + dp[i-2];
            int v2 = Math.abs(h[i] - h[i-1]) + dp[i-1];
            dp[i] = Math.min(v1, v2);
        }

        System.out.println(dp[dp.length - 1]);

  }
}