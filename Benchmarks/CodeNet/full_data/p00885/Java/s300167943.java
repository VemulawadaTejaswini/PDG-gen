import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = (int)1e9;

        while(true){

            int n = sc.nextInt();
            if(n==0) break;

            int[] p = new int[n];
            int[] t = new int[n];
            for(int i=0; i<n; i++){
                p[i] = sc.nextInt();
                t[i] = sc.nextInt();
            }

            int[][] dp = new int[n][4];
            for(int i=0; i<n; i++) Arrays.fill(dp[i], INF);

            int NG = -1;
            if(p[0]<=t[0]) dp[0][1] = p[0];
            else NG = 1;

            for(int i=1; i<n; i++){
                if(NG!=-1) break;
                int time = t[i] - t[i-1];
                if(dp[i-1][3]!=INF && p[i-1]*4+p[i]<=time){
                    dp[i][1] = dp[i-1][3] + p[i-1] + p[i];
                }
                if(dp[i-1][2]!=INF && p[i-1]*3+p[i]<=time){
                    dp[i][1] = Math.min(dp[i][1], dp[i-1][2] + p[i-1] + p[i]);
                }
                if(dp[i-1][1]!=INF && p[i-1]*2+p[i]<=time){
                    dp[i][1] = Math.min(dp[i][1], dp[i-1][1] + p[i-1] + p[i]);
                }                
                if(dp[i-1][1]!=INF && Math.abs(p[i-1]-p[i])*2<=time){
                    dp[i][2] = dp[i-1][1] + Math.abs(p[i-1]-p[i]);
                }
                if(dp[i-1][2]!=INF && Math.abs(p[i-1]-p[i])*3<=time){
                    dp[i][3] = dp[i-1][2] + Math.abs(p[i-1]-p[i]);
                }
                dp[i][0] = Math.min(dp[i][1] ,Math.min(dp[i][2], dp[i][3])) + p[i];
                if(dp[i][0]>=INF){
                    NG = i+1;
                    break;
                }
            }


            if(NG!=-1) System.out.println("NG " + NG);
            else System.out.println("OK " + dp[n-1][0]);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}