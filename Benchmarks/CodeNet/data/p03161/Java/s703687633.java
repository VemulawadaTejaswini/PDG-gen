import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] h = new int[n];
        for (int i=0; i < n; i++)
            h[i] = in.nextInt();

        int[] dp = new int[n];
        // i = target
        for (int i=1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            // j = from
            for (int j=i-1; j >= Math.max(0, i-k); j--) {
                min = Math.min(min, dp[j] + Math.abs(h[j] - h[i]));
            }
            dp[i] = min;
        }

        out.println(dp[n-1]);
    }

}
