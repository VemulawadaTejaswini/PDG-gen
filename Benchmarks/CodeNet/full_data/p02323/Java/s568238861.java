import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
        int INF = 1_500_000_000;
        int[][] e = new int[N][N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                e[i][j] = INF;
            }
        }
        for (int i=0;i<E;i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int d = sc.nextInt();
            e[s][t] = d;
        }

        long[][] dp = new long[(1<<N)][N];
        long ans = INF;
        for (int s=0;s<N;s++) {
            for (int i=0;i<(1<<N);i++) {
                for (int j=0;j<N;j++) {
                    dp[i][j] = INF;
                }
            }
            dp[(1<<s)][s] = 0;
            for (int i=0;i<(1<<N);i++) {
                for (int j=0;j<N;j++) {
                    for (int k=0;k<N;k++) {
                        if (e[j][k]==INF) continue;
                        if (((i>>k)&1)==1) continue;
                        dp[i+(1<<k)][k] = Math.min(dp[i+(1<<k)][k], dp[i][j]+e[j][k]);
                        if (i+(1<<k)==(1<<N)-1) ans = Math.min(ans, dp[i][j]+e[j][k]+e[k][s]);
                    }
                }
            }
        }
        System.out.println(ans==INF?-1:ans);
    }
}
