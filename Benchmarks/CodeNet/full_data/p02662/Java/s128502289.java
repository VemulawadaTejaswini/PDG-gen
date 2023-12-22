import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * @author khokharnikunj8
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "khokharnikunj8", 1 << 27);
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
            FKnapsackForAllSubsets solver = new FKnapsackForAllSubsets();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FKnapsackForAllSubsets {
        final int mod = 998244353;
        Modular md = new Modular(mod);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int s = in.readInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) ar[i] = in.readInt();
            int[] dp = new int[s + 1];
            dp[0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = s; j >= 0; j--) {
                    // take in U and T
                    if (j + ar[i] <= s) {
                        dp[j + ar[i]] = md.add(dp[j + ar[i]], dp[j]);
                    }
                    // take in T
                    // don't take in any
                    dp[j] = md.add(dp[j], dp[j]);
                }
            }
            out.println(dp[s]);
        }

    }

    static class Modular {
        private final int mod;

        public Modular(int mod) {
            this.mod = mod;
        }

        public Modular(long mod) {
            this((int) mod);
            if (this.mod != mod) throw new IllegalArgumentException();
        }

        public Modular(double mod) {
            this((int) mod);
            if (this.mod != mod) throw new IllegalArgumentException();
        }

        public int valueOf(int x) {
            x %= mod;
            if (x < 0) x += mod;
            return x;
        }

        public int add(int x, int y) {
            return valueOf(x + y);
        }

        public String toString() {
            return "Mod : " + mod;
        }

    }

    static class FastInput {
        private final InputStream is;
        private final byte[] buf = new byte[1 << 13];
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

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private final Writer os;
        private final StringBuilder cache = new StringBuilder(1 << 20);

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
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
}

