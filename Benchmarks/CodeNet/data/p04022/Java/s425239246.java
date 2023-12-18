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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static final int MAX_SQRT = (int) 1e5;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] s = new long[n];
            for (int i = 0; i < n; ++i) {
                s[i] = in.nextLong();
            }
            boolean[] pr = new boolean[MAX_SQRT];
            Arrays.fill(pr, 2, pr.length, true);
            int prCount = 0;
            for (int i = 2; i < pr.length; ++i)
                if (pr[i]) {
                    ++prCount;
                    for (int j = i * 2; j < pr.length; j += i) pr[j] = false;
                }
            int[] prs = new int[prCount];
            prCount = 0;
            for (int i = 2; i < pr.length; ++i) if (pr[i]) prs[prCount++] = i;
            int res = 0;
            int cubes = 0;
            long max = 0;
            for (long x : s) max = Math.max(max, x);
            long[] vals = new long[s.length];
            int valsCount = 0;
            outer:
            for (long x : s) {
                long c = 1;
                long o = 1;
                for (int p : prs) {
                    int deg = 0;
                    while (x % p == 0) {
                        ++deg;
                        x /= p;
                    }
                    deg %= 3;
                    if (deg == 1) {
                        c *= p;
                        o *= p;
                        if (o > max) {
                            ++res;
                            continue outer;
                        }
                        o *= p;
                        if (o > max) {
                            ++res;
                            continue outer;
                        }
                    }
                }
                if (x > 1) {
                    ++res;
                    continue;
                }
                if (c == 1) {
                    ++cubes;
                    continue;
                }
                if (c < o) {
                    vals[valsCount++] = c * 2;
                } else {
                    vals[valsCount++] = o * 2 + 1;
                }
            }
            vals = Arrays.copyOf(vals, valsCount);
            Arrays.sort(vals);
            for (int i = 0; i < vals.length; ) {
                int j = i;
                int same = 0;
                while (j < vals.length && vals[j] == vals[i]) {
                    ++same;
                    ++j;
                }
                int diff = 0;
                while (j < vals.length && vals[j] == (vals[i] ^ 1)) {
                    ++diff;
                    ++j;
                }
                res += Math.max(same, diff);
                i = j;
            }
            res += Math.min(1, cubes);
            out.println(res);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

