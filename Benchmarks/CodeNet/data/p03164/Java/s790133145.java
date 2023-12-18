import java.util.*;

public class Main{
    public static final int INF = 100000000;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int W = scan.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        int vsum = 0;
        for(int i = 0; i < n; i++){
            w[i] = scan.nextInt();
            v[i] = scan.nextInt();
            vsum += v[i];
        }
        int[][] dp = new int[n + 1][vsum + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < vsum + 1; j++){
                dp[i][j] = INF;
            }
        }
        dp[0][0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= vsum; j++){
                if(j < v[i]) dp[i + 1][j] = dp[i][j];
                else dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - v[i]] + w[i]);
            }
        }
        for(int i = vsum; i >= 0; i--){
            if(dp[n][i] <= W){
                System.out.println(i);
                return;
            }
        }
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
