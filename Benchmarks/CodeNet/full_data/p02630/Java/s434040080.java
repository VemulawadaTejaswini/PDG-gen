import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Hello
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DReplacing solver = new DReplacing();
        solver.solve(1, in, out);
        out.close();
    }

    static class DReplacing {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt();
            Counter<Integer> cnt = new Counter<>();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                int kk = c.readInt();
                sum += kk;
                cnt.add(kk);
            }

            int q = c.readInt();
            while (q-- > 0) {
                int u = c.readInt(), v = c.readInt();
                long tt = cnt.get(u);
                cnt.remove(u);
                cnt.add(v, tt);
                sum -= tt * u;
                sum += v * tt;
                w.printLine(sum);
            }

        }

    }

    static class Counter<K> {
        public Map<K, Long> map;

        public Counter() {
            map = new HashMap<>();
        }

        public void remove(K k) {
            map.remove(k);
        }

        public long add(K key) {
            long count = map.getOrDefault(key, 0L);
            ++count;
            map.put(key, count);
            return count;
        }

        public long add(K key, long delta) {
            long count = map.getOrDefault(key, 0L);
            count += delta;
            map.put(key, count);
            return count;
        }

        public long get(K key) {
            return map.getOrDefault(key, 0L);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void printLine(long i) {
            writer.println(i);
        }

    }
}

