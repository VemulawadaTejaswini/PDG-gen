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
 * Built using CHelper plug-in Actual solution is at the top
 * 
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
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
            TaskA solver = new TaskA();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskA {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            boolean[] forOne = new boolean[11];
            long val = 1;
            for (int i = 0; i <= 10; i++) {
                forOne[i] = ask(in, out, val);
                val *= 10;
            }
            boolean[] forTwo = new boolean[11];
            val = 2;
            for (int i = 0; i <= 10; i++) {
                forTwo[i] = ask(in, out, val);
                val *= 10;
            }

            int digit = 0;
            boolean forOneMerge = true;
            for (int i = 0; i <= 10; i++) {
                forOneMerge = forOneMerge && forOne[i];
            }
            if (forOneMerge) {
                for (int j = 0; j <= 10; j++) {
                    if (forTwo[j]) {
                        digit = j + 1;
                        break;
                    }
                }
            } else {
                for (int j = 0; j <= 10; j++) {
                    if (!forOne[j]) {
                        digit = j;
                        break;
                    }
                }
            }

            long l = DigitUtils.setDigitOn(0, digit - 1, 1);
            long r = DigitUtils.setDigitOn(0, digit, 1) - 1;
            while (l < r) {
                long m = (l + r) >> 1;
                if (ask(in, out, m * 10)) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }

            out.append("! ").append(l);
            out.flush();
        }

        public boolean ask(FastInput in, FastOutput out, Object o) {
            out.append("? ").println(o);
            out.flush();
            return in.readString().equals("Y");
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

        public FastOutput append(long c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(String c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(Object c) {
            cache.append(c).append('\n');
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

    }
    static class DigitUtils {
        private static final long[] DIGIT_VALUES = new long[19];
        static {
            DIGIT_VALUES[0] = 1;
            for (int i = 1; i < 19; i++) {
                DIGIT_VALUES[i] = DIGIT_VALUES[i - 1] * 10;
            }
        }

        private DigitUtils() {}

        public static int digitOn(long x, int i) {
            if (x < 0) {
                return digitOn(-x, i);
            }
            x /= DIGIT_VALUES[i];
            return (int) (x % 10);
        }

        public static long setDigitOn(long x, int i, int newDigit) {
            if (x < 0) {
                return -setDigitOn(-x, i, newDigit);
            }
            return x + (newDigit - digitOn(x, i)) * DIGIT_VALUES[i];
        }

    }
    static class FastInput {
        private final InputStream is;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
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

        public String readString(StringBuilder builder) {
            skipBlank();

            while (next > 32) {
                builder.append((char) next);
                next = read();
            }

            return builder.toString();
        }

        public String readString() {
            defaultStringBuf.setLength(0);
            return readString(defaultStringBuf);
        }

    }
}

