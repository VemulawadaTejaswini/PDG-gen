import java.util.Scanner;

public class Main {
    static public void main(String args[]){
        final long INF = (long)(1e10);
        final int V_MAX = 100000;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        long[] w = new long[N];
        int[] v = new int[N];
        long[][] dp = new long[N+1][V_MAX+1];

        for(int i = 0 ; i < N ; i++){
            w[i] = sc.nextLong();
            v[i] = sc.nextInt();
        }

        for(int i = 0 ; i <= N ; i++){
            for(int j = 0 ; j <= V_MAX ; j++){
                dp[i][j] = INF;
            }
        }
        dp[0][0] = 0;

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j <= V_MAX ; j++){
                if(j + v[i] <= V_MAX) {
                    dp[i + 1][j + v[i]] = Math.min(dp[i + 1][j + v[i]], dp[i][j]+w[i]);
                }
                dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]);
            }
        }

        long ans = INF;
        for(int i = V_MAX; i >= 0  ; i--){
            if(dp[N][i] <= W){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
