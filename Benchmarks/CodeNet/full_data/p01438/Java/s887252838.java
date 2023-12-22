import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int[][] dp = new int[2][1<<17];

            int idx = 0;
            for(int i=0; i<n; i++){
                int m = sc.nextInt();
                int L = sc.nextInt();
                for(int j=0; j<m; j++){
                    int s = sc.nextInt()-6;
                    int e = sc.nextInt()-6;
                    int bit = 0;
                    int bit2 = (1<<17)-1;
                    for(int k=s; k<=e; k++){
                        bit ^= (1<<k);
                        if(k!=s && k!=e) bit2 ^= (1<<k);
                    }
                    for(int k=0; k<(1<<17); k++){
                        dp[idx][k|bit] = Math.max(dp[idx][k|bit], dp[1-idx][k|bit]);
                        if(k!=0 && dp[1-idx][k&bit2]==0) continue;
                        dp[idx][k|bit] = Math.max(dp[idx][k|bit], L + dp[1-idx][k&bit2]);
                    }
                }
                idx = 1-idx;
            }

            idx = 1-idx;
            int max = 0;
            for(int i=0; i<(1<<17); i++){
                max = Math.max(max, dp[idx][i]);
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}