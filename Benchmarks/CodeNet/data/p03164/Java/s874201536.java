import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            int[] wei = new int[n];
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                wei[i] = sc.nextInt();
                v[i] = sc.nextInt();
            }

            long[][] dp = new long[n + 1][100001];
            boolean[][] go = new boolean[n + 1][100001];
            go[0][0] = true;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < 100001; j++) {
                    dp[i][j] = Long.MAX_VALUE;
                }
            }
            dp[0][0] = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 100001; j++) {
                    if (go[i][j]) {
                        dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
                        go[i + 1][j] = true;

                        dp[i + 1][j + v[i]] = Math.min(dp[i + 1][j + v[i]], dp[i][j] + wei[i]);
                        go[i + 1][j + v[i]] = true;
                    }
                }
            }
            long max = 0;
            for (int i = 0; i < 100001; i++) {
                if (dp[n][i] <= w && go[n][i]) {
                    max = Math.max(max, i);
                }
            }
            out.println(max);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

