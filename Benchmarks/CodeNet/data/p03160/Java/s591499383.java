        import java.util.*;
        public class Main {
          public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n  ; i++ ) {
              h[i] = s.nextInt();
            }
            System.out.println(calc(h));
          }
          public static int calc(int[] h) {
            int[] dp = new int[h.length];
            dp[0] = 0;
            dp[1] = Math.abs( h[1] - h[0]);
            for(int  i = 2; i < h.length; i++ ) {
              dp[i] = Math.max ( dp[i-1] + Math.abs(h[i] - h[i-1]),
                               dp[i-2] + Math.abs(h[i] - h[i-2]) );
            }
            return dp[h.length - 1];
          }
        }