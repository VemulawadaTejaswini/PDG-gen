import java.util.Scanner;

public class Main {

    static final int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n+1][4];//a,c,g,t
        dp[1] = new long[]{1,1,1,1};
        dp[2] = new long[]{4,4,4,4};
        dp[3] = new long[]{16,14,15,16};
        for (int i = 4; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                if(j == 0){
                    dp[i][0] = (dp[i-1][0] +dp[i-1][1] +dp[i-1][2] +dp[i-1][3])%MOD;
                }else if(j == 1){
                    dp[i][1] = (dp[i-1][0] +dp[i-1][1] +dp[i-1][2] +dp[i-1][3] - dp[i-2][0] - dp[i-2][2] - (dp[i-3][0]*3))%MOD;
                }else if(j == 2){
                    dp[i][2] = (dp[i-1][0] +dp[i-1][1] +dp[i-1][2] +dp[i-1][3] - dp[i-2][0] +dp[i-3][2])%MOD;
                }else{
                    dp[i][3] = (dp[i-1][0] +dp[i-1][1] +dp[i-1][2] +dp[i-1][3])%MOD;
                }
            }
        }
        long ans = (dp[n][0] +dp[n][1] +dp[n][2] +dp[n][3]) %MOD;
        System.out.println(ans);
        sc.close();
    }

}
