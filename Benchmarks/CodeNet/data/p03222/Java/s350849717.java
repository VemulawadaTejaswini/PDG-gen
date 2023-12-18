import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;

        if(w == 1){
            System.out.println("1");
            System.exit(0);
        }

        long[][] dp = new long[h+1][w];

        dp[0][0] = 1;
        for(int i = 0;i < w;i++){
            dp[0][w-1] = 0;
        }

        int[] p = new int[w-1];
        int sum = 0;
        for(int i =0;i < Math.pow(2, w-1);i++){
            if((i & (i << 1)) != 0){
                continue;
            }
            sum++;
            for(int j = 0;j < w;j++){
                if((i & (1 << j)) != 0){
                    p[j]++;
                }
            }
        }

        for(int i = 1;i <= h;i++){
            dp[i][0] = (dp[i-1][0] * (sum-p[0]) + dp[i-1][1] * p[0])%mod;
            dp[i][w-1] = (dp[i-1][w-1] * (sum-p[w-2]) + dp[i-1][w-2] * p[w-2])%mod;
            for(int j = 1;j < w-1;j++){
                dp[i][j] = (dp[i-1][j-1]*p[j-1] + dp[i-1][j] * (sum-p[j-1]-p[j]) + dp[i-1][j+1]*p[j])%mod;
            }
        }
        System.out.println(dp[h][k-1]);
    }

}
