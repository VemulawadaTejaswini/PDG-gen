import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Comparator;
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
        AtB solver = new AtB(in, out);
        solver.solve(1);
        out.close();
    }

    static class AtB {
        private final FastScanner in;
        private final PrintWriter out;
        private Pair[] a;

        public AtB(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) throws InterruptedException {
            Thread thread = new Thread(null, this::solve, "solution", 1 << 24);
            thread.setUncaughtExceptionHandler((t, e) -> {
                throw new RuntimeException(e);
            });
            thread.start();
            thread.join();
        }

        public void solve() {
            int n = 0;
            n = in.nextInt();

            a = new Pair[n];
            for (int i = 0; i < n; i++) {
                int val = in.nextInt();
                a[i] = new Pair(val, i);
            }

            Arrays.sort(a, Comparator.comparingInt(x -> x.value));

            out.println(calc(0, 0, n - 1));
        }

        private BigInteger calc(int i, int from, int to) {
            if (i == a.length || from > to) {
                return BigInteger.ZERO;
            }
            int index = a[i].index;
            if (index < from || index > to) {
                return calc(i + 1, from, to);
            }
            BigInteger sum = BigInteger.valueOf(a[i].value * (index - from + 1L) * (to - index + 1L));
            return sum.add(calc(i + 1, from, index - 1)).add(calc(i + 1, index + 1, to));
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

    static class Pair {
        final int value;
        final int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

    }
}

