import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Denis Nedelyaev
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AtC solver = new AtC(in, out);
        solver.solve(1);
        out.close();
    }

    static class AtC {
        private final FastScanner in;
        private final PrintWriter out;

        public AtC(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) {
            int n = in.nextInt();
            int[] t = in.nextInts(n);
            int[] a = in.nextInts(n);

            int[] min = new int[n];
            int[] max = new int[n];

            Arrays.fill(min, 1);
            Arrays.fill(max, 1000000000);

            int prev = 0;
            for (int i = 0; i < n; i++) {
                max[i] = t[i];
                if (t[i] > prev) {
                    min[i] = t[i];
                    prev = t[i];
                }
            }

            prev = 0;
            for (int i = n - 1; i >= 0; i--) {
                max[i] = Math.min(max[i], a[i]);
                if (a[i] > prev) {
                    min[i] = Math.max(min[i], a[i]);
                    prev = a[i];
                }
            }

            long ans = 1;
            for (int i = 0; i < n; i++) {
                ans *= Math.max(0, max[i] - min[i] + 1);
                ans %= 1000000007;
            }

            out.println(ans);
        }

    }

    static class FastScanner {
        private final static int BUFFER_SIZE = 4096;
        private final InputStream in;
        private byte[] buffer = new byte[BUFFER_SIZE];
        private int pos = 0;
        private int size;

        public FastScanner(InputStream inputStream) throws IOException {
            in = inputStream;
            size = 0;
        }

        public int nextInt() {
            int c = skipWhitespace();

            int sign = -1;
            if (c == '-') {
                sign = 1;
                c = read();
            }

            int ans = 0;

            while (c > ' ') {
                ans *= 10;
                ans -= c - '0';
                c = read();
            }

            return sign * ans;
        }

        public int[] nextInts(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        private int skipWhitespace() {
            while (true) {
                int c = read();
                if (c > ' ' || c == -1) {
                    return c;
                }
            }
        }

        private int read() {
            if (pos >= size) {
                try {
                    size = in.read(buffer, 0, BUFFER_SIZE);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (size <= 0) {
                    return -1;
                }
                pos = 0;
            }
            return buffer[pos++];
        }

    }
}

