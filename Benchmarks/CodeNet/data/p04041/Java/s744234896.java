import java.util.*;
import java.io.*;

public class Main {

    static int MOD = (int) 1e9+7;

    static int n, x, y, z;
    static int[][] dp;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        n = fs.nextInt(); x = fs.nextInt(); y = fs.nextInt(); z = fs.nextInt();

        dp = new int[n+1][1 << (x + y + z + 1)];
        dp[0][1] = 1;

        int p = 0;
        for (int i = 0; i < n; i++) {
            for (int j =0; j < 1 << (x + y + z + 1); j++) {
                if (dp[i][j] > 0) {
                    for (int A = 1; A <= 10; A++) {
                        p = 0;
                        //start
                        if ((j & 1) == 1) {
                            p |= (1 << 0);
                        }
                        for (int k = 0; k < x; k++) {
                            if ((((j >> k) & 1) == 1) && k + A <= x) {
                                p |= 1 << (k + A);
                            }
                        }
                        for (int k = x; k < x + y; k++) {
                            if ((((j >> k) & 1) == 1) && k + A <= x + y) {
                                p |= 1 << (k + A);
                            }
                        }
                        for (int k = x + y; k < x + y + z; k++) {
                            if ((((j >> k) & 1) == 1) && k + A <= x + y + z) {
                                p |= 1 << (k + A);
                            }
                        }
                        if (((j >> x + y + z) & 1) == 1) {
                            p |= 1 << (x + y + z);
                        }
                        dp[i + 1][p] = (dp[i + 1][p] + dp[i][j]) % MOD;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 1 << (x + y + z + 1); i++) {
            if ((((i >> x + y + z) & 1) == 1) && dp[n][i] > 0) {
                ans = (ans + dp[n][i]) % MOD;
            }
        }
        pw.println(ans);
        pw.flush();
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }

        public FastScanner() {
            this(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}