import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);
        int INF = Integer.MAX_VALUE/2;

        int n = sc.nextInt();
        int[] kirime = new int[n-1];
        for(int i=0; i<n-1; i++) kirime[i] = sc.nextInt();

        int[][][] dp = new int[2][n/2+1][2]; // dp[お菓子どこまで見たか][Aの所持分][今見ている一片をAとBどちらに取り分けたか];
        for(int i=0; i<2; i++)
            for(int j=0; j<=n/2; j++) Arrays.fill(dp[i][j], INF);
        dp[0][0][1] = 0; //最初の一片をBに取り分ける
        dp[0][1][0] = 0; //Aに取り分ける
        int idx = 1;
        for(int i=1; i<n; i++){
            for(int j=0; j<=n/2; j++){
                int n1 = INF, n2 = INF;
                if(j!=0){
                    n1 = Math.min(dp[1-idx][j-1][0], //(i-1)番目をAのものにした時。
                                  dp[1-idx][j-1][1] + kirime[i-1]); //(i-1)番目をBのものにした時。所持者が変わるのでお菓子を切る。
                }
                n2 = Math.min(dp[1-idx][j][0] + kirime[i-1], //(i-1)番目をAのものにした時。所持者が変わるのでお菓子を切る。
                              dp[1-idx][j][1]); //(i-1)番目をBのものにした時。
                if(j!=0) dp[idx][j][0] = Math.min(dp[idx][j][0], n1);
                dp[idx][j][1] = Math.min(dp[idx][j][1], n2);
            }
            idx = 1-idx;
            for(int j=0; j<=n/2; j++) Arrays.fill(dp[idx][j], INF);
        }
        System.out.println(Math.min(dp[1-idx][n/2][0], dp[1-idx][n/2][1]));
    }

    public static void main(String[] args){
        new Main().solve();
    }
}