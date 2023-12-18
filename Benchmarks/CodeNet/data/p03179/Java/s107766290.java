
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
            for (int a = 1; a <=len; a++) {
                for (int b = 1; b <len ; b++) {
                    int realB = b;
                    if(b >= a) realB++;
                    if((realB < a ) != (s[len-2]=='<')) continue;
                    dp[len][a]  = ( dp[len][a] + dp[len-1][b] )% MOD;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= n  ; i++) {
            ans  =  (ans + dp[n][i]) % MOD;
        }
        System.out.println(ans);
    }
}
