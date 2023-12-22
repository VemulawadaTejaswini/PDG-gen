import java.io.PrintWriter;
import java.util.*;

public class Main {


    static Scanner sc;
    static PrintWriter out;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

    public void solve() {
        int s = sc.nextInt();
        long mod = 1_000_000_007;
        long[][] dp = new long[701][s+1];
        long[][] sum = new long[701][s+1];
        for(int i=3; i<=s; i++) {
            dp[1][i] = 1;
            sum[1][i] = sum[1][i-1]+1;
        }
        long res = dp[1][s];
        for(int j=2; j<=700; j++) {
            for (int i = 3; i <= s; i++) {
                dp[j][i] = sum[j-1][i-3];
                sum[j][i] = sum[j][i-1]+dp[j][i];
                sum[j][i] %= mod;
            }
            res += dp[j][s];
            res %= mod;
        }
        out.println(res);
    }

}
