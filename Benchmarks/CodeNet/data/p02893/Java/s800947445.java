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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        static final long MODULO = 998244353;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String x = in.next();
            long xval = 0;
            for (int i = 0; i < n; ++i) {
                xval = (xval * 2 + (x.charAt(i) - '0')) % MODULO;
            }
            int[] len = new int[n];
            int[] what = new int[n];
            int am = 0;
            int cur = x.charAt(0) - '0';
            int cnt = 1;
            for (int i = 1; i < n; ++i) {
                if (x.charAt(i) - '0' == cur) {
                    ++cnt;
                } else {
                    len[am] = cnt;
                    what[am] = cur;
                    ++am;
                    cur = x.charAt(i) - '0';
                    cnt = 1;
                }
            }
            len[am] = cnt;
            what[am] = cur;
            ++am;
            long cval = 0;
            int pblock = 0;
            long[] ways = new long[n + 1];
            for (int k = n - (1 - n % 2); k >= 1; k -= 2) {
                if (n % k == 0) {
                    int block = n / k;
                    if (pblock > block) throw new RuntimeException();
                    while (pblock < block) {
                        cval = (cval * 2 + (x.charAt(pblock) - '0')) % MODULO;
                        ++pblock;
                    }
                    int extra = 1;
                    for (int i = 0; i + block < n; ++i) {
                        int e = 1 - (x.charAt(i) - '0');
                        int a = x.charAt(i + block) - '0';
                        if (e < a) {
                            break;
                        }
                        if (e > a) {
                            extra = 0;
                            break;
                        }
                    }
                    ways[k] = (cval + extra) % MODULO;
                    for (int j = 3 * k; j < ways.length; j += 2 * k) {
                        ways[k] -= ways[j];
                        if (ways[k] < 0) ways[k] += MODULO;
                    }
                }
            }
            long res = 0;
            for (int i = 1; i < ways.length; i += 2)
                if (ways[i] != 0) {
                    res += ways[i] * 2 * (n / i);
                    res %= MODULO;
                }
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

    }
}

