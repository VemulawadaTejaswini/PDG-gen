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
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
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
            EAwkwardResponse solver = new EAwkwardResponse();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EAwkwardResponse {
        FastOutput out;
        FastInput in;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            this.out = out;
            this.in = in;

            long limit = (long) 1e15;
            long x = 1;
            while (ask(x) && x < limit) {
                x = x * 10;
            }

            if (x >= limit) {
                //all one
                x = 1;
                while (!ask(x + 1)) {
                    x = x * 10;
                }
                answer(x);
                return;
            }

            int len = Long.toString(x).length();
            long min = Math.round(Math.pow(10, len));
            long max = min * 10 - 1;

            LongBinarySearch lbs = new LongBinarySearch() {

                public boolean check(long mid) {
                    return ask(mid);
                }
            };

            long ans = lbs.binarySearch(min, max);
            ans /= 100;
            answer(ans);
        }

        public boolean ask(long x) {
            out.printf("? %d\n", x);
            out.flush();
            return in.readChar() == 'Y';
        }

        public void answer(long x) {
            out.printf("! %d\n", x);
            out.flush();
        }

    }

    static class DigitUtils {
        private DigitUtils() {
        }

        public static long floorAverage(long x, long y) {
            return (x & y) + ((x ^ y) >> 1);
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

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
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

    static abstract class LongBinarySearch {
        public abstract boolean check(long mid);

        public long binarySearch(long l, long r) {
            if (l > r) {
                throw new IllegalArgumentException();
            }
            while (l < r) {
                long mid = DigitUtils.floorAverage(l, r);
                if (check(mid)) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return l;
        }

    }
}

