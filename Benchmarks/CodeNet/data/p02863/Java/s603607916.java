
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        int n = sc.nextInt(), t = sc.nextInt();
        int[] as = new int[n], bs = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            as[i] = a;
            bs[i] = b;
        }

        int MAX = 3100;
        long[] dp = new long[t + MAX];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = t - 1; j >= 0; j--) {
                if (dp[j] >= 0 && j + as[i] < t + MAX) {
                    dp[j + as[i]] = Math.max(dp[j + as[i]], dp[j] + bs[i]);
                }
            }
        }

        long ans = 0;
        for (long x: dp) {
            ans = Math.max(ans, x);
        }

        out.println(ans);

        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}