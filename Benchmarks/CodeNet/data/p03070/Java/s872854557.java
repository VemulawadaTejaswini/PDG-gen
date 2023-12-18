import java.util.*;

public class Main {

    static final long MOD  = 998_244_353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        long[][] dp = new long[n+1][sum+1];
        long[][] dp2 = new long[n+1][sum+1];
        dp[0][0] = 1;
        dp2[0][0] = 1;
        int tmpSum = 0;
        for (int i = 1; i < n+1; i++) {
            tmpSum += a[i-1];
            for(int j = 0; j < tmpSum+1; j++){
                if(a[i-1] <= j) dp[i][j] += dp[i-1][j-a[i-1]];
                dp[i][j] %= MOD;
                dp[i][j] += dp[i-1][j]*2;
                dp[i][j] %= MOD;

                if(a[i-1] <= j) dp2[i][j] += dp2[i-1][j-a[i-1]];
                dp2[i][j] %= MOD;
                dp2[i][j] += dp2[i-1][j];
                dp2[i][j] %= MOD;
            }
        }
        long ans = modPow(3, n);
        for (int i = (sum+1)/2; i < sum+1; i++) {
            ans -= dp[n][i] * 3;
            if(ans < 0)ans += MOD;
        }
        if(sum % 2 == 0){
            ans += dp2[n][sum/2] * 3;
            ans %= MOD;
        }
        System.out.println(ans);
        sc.close();
    }

    public static long modPow(long base, int exp) {
        long ret = 1;
        while(exp > 0){
            if((exp & 1) == 1){
                ret = ret * base %MOD;
            }
            base = base * base %MOD;
            exp >>= 1;
        }
        return ret;
    }

}
