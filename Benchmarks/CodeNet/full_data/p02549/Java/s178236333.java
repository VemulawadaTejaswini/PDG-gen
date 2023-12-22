import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        int N;
        int K;
        int[] L;
        int[] R;
        static long MOD = 998244353;

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            N = in.Int();
            K = in.Int();
            L = new int[K];
            R = new int[K];
            for (int i = 0; i < K; i++) {
                L[i] = in.Int();
                R[i] = in.Int();
            }

            TreeSet<Integer> set = new TreeSet<>(Comparator.naturalOrder());
            for (int i = 0; i < K; i++) {
                for (int j = L[i]; j <= R[i]; j++) {
                    set.add(j);
                }
            }

            long[] dp = new long[N + 1];
            dp[1] = 1;
            for (int i = 1; i < N; i++) {
                for (Integer n : set) {
                    if (i + n > N) continue;
                    dp[i + n] += dp[i];
                    dp[i + n] %= MOD;
                }
            }
            out.println(dp[N]);
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

