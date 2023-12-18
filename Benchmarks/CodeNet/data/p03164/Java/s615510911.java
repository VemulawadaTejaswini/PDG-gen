import java.util.*;
public class Main {
    static long[][] dp = new long[100][1000000001];
    static int[] v = new int[100];
    static int[] w = new int[100];
    static int N, W;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        W = in.nextInt();
        for(int i = 0 ; i < N ; ++i){
            w[i] = in.nextInt();
            v[i] = in.nextInt();
        }
        solve();
        System.out.println(dp[N-1][W]);

    }
    private static void solve() {
        Arrays.fill(dp[0], w[0], W+1, v[0]);
        for(int i = 1 ; i < N ; ++i){
            for(int j = 0 ; j <= W ; ++j){
                if(j < w[i])
                    dp[i][j] = dp[i-1][j];
                else
                dp[i][j] = Math.max(dp[i-1][j] ,
                        (dp[i-1][j-w[i]] + v[i]));
            }
        }
    }
}