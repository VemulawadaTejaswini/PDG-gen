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
        int[][] h = new int[3][n];
        for (int i=0; i < n; i++) {
            h[0][i] = in.nextInt();
            h[1][i] = in.nextInt();
            h[2][i] = in.nextInt();
        }

        int[] dp = new int[n+1];
        int last = -1;
        for (int i=0; i < n; i++) {
            int max = 0;
            int memo = 0;
            for (int j=0; j < 3; j++) {
                if (j == last)
                    continue;
                if (max < h[j][i]) {
                    memo = j;
                    max = h[j][i];
                }
            }
            last = memo;
            dp[i+1] = dp[i] + max;
        }

        out.println(dp[n]);
    }

}
