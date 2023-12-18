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
 * @author EDGE
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] h = in.nextIntArray(n);

            int[][] dp = new int[n - 1][2];

            for (int i = 0; i < n - 1; i++) {

                if (i + 1 >= n)
                    dp[i][0] = Integer.MAX_VALUE;
                else
                    dp[i][0] = Math.abs(h[i] - h[i + 1]);

                if (i + 2 >= n)
                    dp[i][1] = Integer.MAX_VALUE;
                else
                    dp[i][1] = Math.abs(h[i] - h[i + 2]);

            }
            long ans = 0;
            for (int i = 0; i < n - 1; ) {
                if (dp[i][0] >= dp[i][1]) {
                    ans += dp[i][1];
                    i += 2;
                } else {
                    ans += dp[i][0];
                    i++;
                }
            }

            out.println(ans);
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

    }
}

