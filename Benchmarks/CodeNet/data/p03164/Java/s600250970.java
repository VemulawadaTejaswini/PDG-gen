import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Azhan Khan
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            long w = in.nextLong();

            long[] weights = new long[n];
            int[] values = new int[n];

            for (int i = 0; i < n; i++) {
                weights[i] = in.nextLong();
                values[i] = in.nextInt();
            }

            long[] dp = new long[n * 1000 + 1];     //dp[j] = min weight to get value of J
            Arrays.fill(dp, w + 1);
            dp[0] = 0;
            for (int i = 0; i < n; i++) {
                for (int j = n * 1000; j >= values[i]; j--) {
                    dp[j] = Math.min(dp[j], dp[j - values[i]] + weights[i]);
                }
            }
            //out.println(Arrays.toString(dp));
            long ans = 0;
            for (int i = 0; i < n * 1000; i++) {
                if (dp[i] <= w) {
                    ans = i;
                }
            }
            out.print(ans);

        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

