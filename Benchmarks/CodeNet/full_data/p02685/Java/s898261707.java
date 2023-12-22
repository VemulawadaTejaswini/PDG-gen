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
            EColorfulBlocks solver = new EColorfulBlocks();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EColorfulBlocks {
        Modular mod = new Modular(998244353);
        Power pw = new Power(mod);
        Factorial fc = new Factorial(200005, mod);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            int kk = in.readInt();
            long temp = 0;
            for (int k = 0; k <= kk; k++) {
                long ans = m;
                ans = mod.mul(ans, pw.pow(m - 1, n - 1 - k));
                ans = mod.mul(ans, fc.fact(n - 1));
                ans = mod.mul(ans, fc.inv(n - 1 - k));
                ans = mod.mul(ans, fc.inv(k));
                temp = mod.add(temp, ans);
            }
            out.println(temp);
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

        public FastOutput append(long c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(long c) {
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

    static class InverseNumber {
        int[] inv;
        Modular modular;

        public InverseNumber(int[] inv, int limit, Modular modular) {
            this.modular = modular;
            this.inv = inv;
            inv[1] = 1;
            int mod = modular.getMod();
            for (int i = 2; i <= limit; i++) inv[i] = modular.mul(-(mod / i), inv[mod % i]);
        }

        public InverseNumber(int limit, Modular modular) {
            this(new int[limit + 1], limit, modular);
        }

        public int inv(int index) {
            return inv[index];
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

        public int getMod() {
            return this.mod;
        }

        public int valueOf(int x) {
            x %= mod;
            if (x < 0) x += mod;
            return x;
        }

        public int valueOf(long x) {
            x %= mod;
            if (x < 0) x += mod;
            return (int) x;
        }

        public int mul(int x, int y) {
            return valueOf((long) x * y);
        }

        public int mul(long x, long y) {
            return valueOf(x * y);
        }

        public int add(long x, long y) {
            return valueOf(x + y);
        }

        public String toString() {
            return "Mod : " + mod;
        }

    }

    static class Factorial {
        int[] fact;
        int[] inv;
        Modular modular;

        public Factorial(int[] fact, int[] inv, InverseNumber in, int limit, Modular modular) {
            this.modular = modular;
            this.fact = fact;
            this.inv = inv;
            fact[0] = inv[0] = 1;
            for (int i = 1; i <= limit; i++) {
                fact[i] = modular.mul(fact[i - 1], i);
                inv[i] = modular.mul(inv[i - 1], in.inv(i));
            }
        }

        public Factorial(int limit, Modular modular) {
            this(new int[limit + 1], new int[limit + 1], new InverseNumber(limit, modular), limit, modular);
        }

        public int fact(int n) {
            return fact[n];
        }

        public int inv(int n) {
            return inv[n];
        }

    }

    static class Power {
        private final Modular modular;

        public Power(Modular modular) {
            this.modular = modular;
        }

        public int pow(int x, int y) {
            long r = modular.valueOf(1);
            while (y > 0) {
                if ((y & 1) == 1) r = modular.valueOf(r * x);
                x = modular.mul(x, x);
                y >>= 1;
            }
            return modular.valueOf(r);
        }

    }
}

