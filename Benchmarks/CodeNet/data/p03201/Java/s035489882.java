import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        BPowersOfTwo solver = new BPowersOfTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPowersOfTwo {
        Map<Integer, Integer> fm = new HashMap<>();

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int[] a = in.nextIntArray(n);

            for (int i = 0; i < n; i++) {
                fm.merge(a[i], 1, (x, y) -> x + y);
            }

            Map<Integer, Set<Integer>> g = new HashMap<>();

            int[] tp = new int[32];

            tp[0] = 1;

            for (int i = 1; i <= 31; i++) {
                tp[i] = tp[i - 1] * 2;
            }

            for (int i = 0; i < n; i++) {
                if (!g.containsKey(a[i])) {
                    g.put(a[i], new HashSet<>());
                }

                for (int j = 0; j < 32; j++) {
                    int rem = tp[j] - a[i];

                    if (rem == a[i]) {
                        continue;
                    }
                    if (fm.containsKey(rem)) {
                        g.get(a[i]).add(rem);
                    }
                }
            }
            ArrayDeque<Integer> dq = new ArrayDeque<>();

            for (int key : fm.keySet()) {
                if (g.get(key).size() == 1) {
                    dq.addLast(key);
                }
            }

            int ans = 0;

            while (!dq.isEmpty()) {
                int pe = dq.removeFirst();

                int f = fm.get(pe);
                Set<Integer> set = g.get(pe);
                for (int num : set) {

                    int fc = fm.get(num);

                    int min = Math.min(fc, f);

                    ans += min;

                    fm.put(num, fc - min);
                    fm.put(pe, f - min);
                    //fm.remove(num);

                    g.get(num).remove(pe);

                    if (g.get(num).size() == 1) {
                        dq.addLast(num);
                    }
                }
            }

            for (int key : fm.keySet()) {
                int val = fm.get(key);
                if ((key & (key - 1)) == 0) {
                    if (val > 1) {
                        ans += (val / 2);
                    }
                }
            }

            out.println(ans);
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

        public void println(int i) {
            writer.println(i);
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public int nextInt() {
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

