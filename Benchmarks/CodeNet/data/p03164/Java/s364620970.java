import java.util.*;

public class Main{
    final long INF = (long)1e10;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int W = scan.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        int V = 0;
        for(int i = 0; i < n; i++){
            w[i] = scan.nextInt();
            v[i] = scan.nextInt();
            V += v[i];
        }
        long[][] dp = new long[n + 1][V + 1];
        for(int i = 0; i <= n; i++) Arrays.fill(dp[i], INF);
        dp[0][0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= V; j++){
                if(j < v[i]) dp[i + 1][j] = dp[i][j];
                else dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - v[i]] + w[i]); 
            }
        }
        for(int i = V; i >= 0; i--){
            if(dp[n][i] <= W){
                System.out.println(i);
                return;
            }
        }
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
