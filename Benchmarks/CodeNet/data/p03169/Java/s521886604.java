import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskJ solver = new TaskJ();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskJ {
        int n;
        double[][][] dp;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            n = in.readInt();
            dp = new double[n + 1][n + 1][n + 1];
            SequenceUtils.deepFill(dp, (double) -1);
            int[] cnts = new int[4];
            for (int i = 0; i < n; i++) {
                cnts[in.readInt()]++;
            }
            double ans = dp(cnts[3], cnts[2], cnts[1]);
            out.printf("%.15f", ans);
        }

        public double dp(int a, int b, int c) {
            if (dp[a][b][c] == -1) {
                if (a + b + c == 0) {
                    return dp[a][b][c] = 0;
                }
                dp[a][b][c] = 1;
                int d = n - a - b - c;
                double stayProb = (double) d / n;
                if (a > 0) {
                    dp[a][b][c] += dp(a - 1, b + 1, c) *
                            (double) a / n;
                }
                if (b > 0) {
                    dp[a][b][c] += dp(a, b - 1, c + 1) *
                            (double) b / n;
                }
                if (c > 0) {
                    dp[a][b][c] += dp(a, b, c - 1) *
                            (double) c / n;
                }
                dp[a][b][c] /= (1 - stayProb);
            }
            return dp[a][b][c];
        }

    }

    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput printf(String format, Object... args) {
            cache.append(String.format(format, args));
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }

    static class SequenceUtils {
        public static void deepFill(Object array, double val) {
            if (!array.getClass().isArray()) {
                throw new IllegalArgumentException();
            }
            if (array instanceof double[]) {
                double[] doubleArray = (double[]) array;
                Arrays.fill(doubleArray, val);
            } else {
                Object[] objArray = (Object[]) array;
                for (Object obj : objArray) {
                    deepFill(obj, val);
                }
            }
        }

    }
}

