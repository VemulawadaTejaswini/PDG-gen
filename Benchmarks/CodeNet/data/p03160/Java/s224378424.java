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
        int[] h = new int[n];
        for (int i=0; i < n; i++)
            h[i] = in.nextInt();

        int[] dp = new int[n];
        dp[1] = Math.abs(h[1] - h[0]);
        for (int i=2; i < n; i++)
            dp[i] = Math.min(dp[i-2] + Math.abs(h[i] - h[i-2]), dp[i-1] + Math.abs(h[i] - h[i-1]));

        out.println(dp[n-1]);
    }

}
