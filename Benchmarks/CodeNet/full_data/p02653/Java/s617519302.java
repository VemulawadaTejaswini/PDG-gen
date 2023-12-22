import java.util.*;

public class Main {

    static int mod = 1_000_000_007;

    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a%mod;
            }
            a=a*a%mod;
            n>>=1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        long[][] dp = new long[N][A+B-2];
        // dp[ind][j] -> contiguous_zero is j+1 (0 <= j <A-1)
        // dp[ind][j] -> contiguous_one is j-(A-1)+1 (A-1 <= j < A-1+B-1)

        dp[0][0] = 1;
        dp[0][A-1] = 1;
        for (int i=0;i<N-1;i++) {
            for (int j=0;j<A-1;j++) {
                if (j != A-2) {
                    dp[i+1][j+1] = (dp[i+1][j+1]+dp[i][j])%mod;
                }
                dp[i+1][A-1] = (dp[i+1][A-1]+dp[i][j])%mod;
            }
            for (int j=A-1;j<A+B-2;j++) {
                if (j != A+B-3) {
                    dp[i+1][j+1] = (dp[i+1][j+1]+dp[i][j])%mod;
                }
                dp[i+1][0] = (dp[i+1][0]+dp[i][j])%mod;
            }
        }

        System.out.println(Arrays.deepToString(dp));
        long ans = 0L;
        for (int j=0;j<A+B-2;j++) {
            ans = (ans+dp[N-1][j])%mod;
        }

        System.out.println((pow(2, N)-ans+mod)%mod);
    }
}