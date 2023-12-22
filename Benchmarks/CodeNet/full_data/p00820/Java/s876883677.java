import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int max = (int)Math.pow(2, 15)+10;
        int[][] dp = new int[max][5];
        dp[0][0] = 1;
        for(int i=1; i*i<max; i++){
            for(int j=0; j+i*i<max; j++){
                for(int k=1; k<5; k++){
                    dp[j+i*i][k] += dp[j][k-1];
                }
            }
        }

        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int ans = dp[n][1] + dp[n][2] + dp[n][3] + dp[n][4];
            System.out.println(ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}