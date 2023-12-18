
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    final static int MOD  = (int) 1E9 + 7;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.valueOf(scanner.nextLine());
        char[] s = scanner.nextLine().toCharArray();
        long[][] dp = new long[n+1][n+1];
        dp[1][1]=1;
        for (int len = 2; len <= n; len++) {
            for (int i = 1; i <len; i++) {
                dp[len-1][i]  = (dp[len-1][i] + dp[len-1][i-1])%MOD;
            }
            for (int a = 1; a <=len; a++) {
                int  l,r;
                if(s[len-2] == '<'){
                    l = 1;
                    r   = a-1;
                }
                else {
                    l = a;
                    r = len-1;
                }
                if(l <= r)
                    dp[len][a]  =(dp[len][a] + dp[len-1][r] - dp[len-1][l-1] + MOD)%MOD;
//                for (int i = l; i <= r; i++) {
//                    dp[len][a]  = (dp[len][a] + dp[len-1][i])%MOD;
//                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= n  ; i++) {
            ans  =  (ans + dp[n][i]) % MOD;
        }
        System.out.println(ans);


    }
}
