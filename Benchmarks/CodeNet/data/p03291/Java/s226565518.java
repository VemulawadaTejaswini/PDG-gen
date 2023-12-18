import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long mod = 1_000_000_007L;
        int N = S.length();
        long[][] dp = new long[N+1][3];
        for (int i=0;i<N;i++) {
            switch (S.charAt(i)) {
                case 'A':
                    dp[i+1][0]=(dp[i][0]+1)%mod;
                    dp[i+1][1]=dp[i][1];
                    dp[i+1][2]=dp[i][2];
                    break;
                case 'B':
                    dp[i+1][0]=dp[i][0];
                    dp[i+1][1]=(dp[i][1]+dp[i][0])%mod;
                    dp[i+1][2]=dp[i][2];
                    break;
                case 'C':
                    dp[i+1][0]=dp[i][0];
                    dp[i+1][1]=dp[i][1];
                    dp[i+1][2]=(dp[i][2]+dp[i][1])%mod;
                    break;
                case '?':
                    dp[i+1][0]=(3*dp[i][0]+1)%mod;
                    dp[i+1][1]=(3*dp[i][1]+dp[i][0])%mod;
                    dp[i+1][2]=(3*dp[i][2]+dp[i][1])%mod;
                    break;
            }
        }
        System.out.println(dp[N][2]);
    }
}