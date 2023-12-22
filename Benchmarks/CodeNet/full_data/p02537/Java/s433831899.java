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
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFlatSubsequence solver = new DFlatSubsequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFlatSubsequence {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            long ans = 0;
            long[] dp = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            //out.println(longest(n, k, a));
            for (int i : a) i++;
            fenwick f = new fenwick();
            for (int i = 0; i < n; i++) {
                int l = Math.max(1, a[i] - k);
                int r = Math.min(300001, a[i] + k);
                dp[i] = f.query(l, r) + 1;
                if (dp[i] > ans) ans = dp[i];
                f.modify(a[i], dp[i]);
            }
            out.println(ans);
        }

        public class fenwick {
            final static int MAX = 300005;
            public long[] v = new long[MAX];
            public long[] c = new long[MAX];

            fenwick() {
                Arrays.fill(v, 0);
                Arrays.fill(c, 0);
            }

            public void modify(int x, long val) {
                v[x] = val;
                for (; x <= MAX - 1; x += x & -x) {
                    if (val > c[x]) {
                        c[x] = val;
                    }
                }
            }

            public long query(int x, int y) {
                long res = Long.MIN_VALUE;
                while (y >= x) {
                    int step = y & -y;
                    if (y - step >= x - 1) {
                        res = Math.max(res, c[y]);
                        y -= step;
                    } else {
                        res = Math.max(res, v[y]);
                        y -= 1;
                    }
                }
                return res;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

