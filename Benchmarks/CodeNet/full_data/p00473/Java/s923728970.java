import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE/10;
        int n = sc.nextInt();
        int[] cost = new int[n-1];
        for(int i=0; i<n-1; i++) cost[i] = sc.nextInt();

        int[][][] dp = new int[2][n/2+1][2];
        for(int i=0; i<2; i++)
            for(int j=0; j<dp[i].length; j++) Arrays.fill(dp[i][j], INF);

        dp[0][1][0] = 0;
        dp[0][0][1] = 0;

        int idx = 1;
        for(int i=1; i<n; i++){
            for(int j=1; j<=i && j<=n/2; j++){
                for(int k=0; k<2; k++){
                    int nj = j;
                    if(k==0) nj--;
                    dp[idx][j][k] = Math.min(dp[idx][j][k], dp[1-idx][nj][k]);
                    dp[idx][j][k] = Math.min(dp[idx][j][k], dp[1-idx][nj][1-k] + cost[i-1]);
                }
            }
            idx = 1-idx;
            for(int j=0; j<dp[idx].length; j++) Arrays.fill(dp[idx][j], INF);
        }

        int ans = Math.min(dp[1-idx][n/2][0], dp[1-idx][n/2][1]);
        System.out.println(ans);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}