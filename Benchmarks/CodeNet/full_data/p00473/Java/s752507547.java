import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE/10;
        int n = sc.nextInt();
        int[] cost = new int[n-1];
        for(int i=0; i<n-1; i++) cost[i] = sc.nextInt();

        int[][][] dp = new int[n][n+1][2];
        for(int i=0; i<n; i++)
            for(int j=0; j<=n; j++) Arrays.fill(dp[i][j], INF);

        //for(int i=0; i<n; i++) Arrays.fill(dp[i][0], 0);


        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                if(j==1){
                    dp[i][j][0] = cost[i-1];
                    continue;
                }
                dp[i][j][0] = Math.min(dp[i-1][j-1][0], dp[i-1][j-1][1] + cost[i-1]);
                dp[i][j][1] = Math.min(dp[i-1][j][1], dp[i-1][j][0] + cost[i-1]);
            }
        }

        System.out.println(dp[n-1][n/2][1]);

    }

    public static void main(String[] args){
        new Main().solve();
    }
}