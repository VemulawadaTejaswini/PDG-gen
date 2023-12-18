import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int V = 200000;
        long[][] dp = new long[N+1][V+1];
        long INF = 1_000_000_000_000_000_000L;
        for (int i=0;i<N+1;i++) {
            for (int j=0;j<V+1;j++) {
                if (j!=0) dp[i][j] = INF;
            }
        }
        for (int i=0;i<N;i++) {
            int w = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            for (int j=0;j<V;j++) {
                if (j+1-v>=0 && dp[i][j+1-v]!=INF) {
                    dp[i+1][j+1] = Math.min(dp[i][j+1], dp[i][j+1-v]+w);
                } else {
                    dp[i+1][j+1] = dp[i][j+1];
                }
            }
        }
        int ans = 0;
        for (int i=0;i<V+1;i++) {
            if (dp[N][i]<=W) ans = Math.max(ans, i);
        }
        System.out.println(ans);
    }
}