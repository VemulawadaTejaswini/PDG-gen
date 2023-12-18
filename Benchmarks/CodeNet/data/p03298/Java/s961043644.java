import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
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
        OutputWriter out = new OutputWriter(outputStream);
        CStringColoring solver = new CStringColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStringColoring {
        static final long MOD = (long) 1e16 + 61;
        static final int BASE = 31;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            char[] str = in.readCharArray(2 * n);
            HashMap<Long, Long> hm = new HashMap<>();
            for (int i = 0; i < (1 << n); i++) {
                long h1 = 0, h2 = 0;
                for (int j = 0; j < n; j++) {
                    if ((i >> j & 1) > 0) {
                        h1 = (h1 * BASE + str[j] - 'a' + 1) % MOD;
                    }
                }

                for (int j = n - 1; j >= 0; j--) {
                    if ((i >> j & 1) == 0) {
                        h2 = (h2 * BASE + str[j] - 'a' + 1) % MOD;
                        h1 = (h1 * BASE) % MOD;
                    }
                }

                long key = (MOD + h1 - h2) % MOD;
                if (!hm.containsKey(key)) hm.put(key, 1L);
                else hm.put(key, hm.get(key) + 1);
            }

            long ans = 0;

            for (int i = 0; i < (1 << n); i++) {
                long h1 = 0, h2 = 0;
                for (int j = n - 1; j >= 0; j--) {
                    if ((i >> j & 1) == 0) {
                        h2 = (h2 * BASE + str[j + n] - 'a' + 1) % MOD;
                    }
                }
                for (int j = 0; j < n; j++) {
                    if ((i >> j & 1) > 0) {
                        h1 = (h1 * BASE + str[j + n] - 'a' + 1) % MOD;
                        h2 = (h2 * BASE) % MOD;
                    }
                }
                long key = (MOD + h2 - h1) % MOD;
                if (hm.containsKey(key)) ans += hm.get(key);
            }
            out.println(ans);

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

        public char[] readCharArray(int size) {
            char[] array = new char[size];
            for (int i = 0; i < size; i++) {
                array[i] = readCharacter();
            }
            return array;
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
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
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

        public char readCharacter() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            return (char) c;
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

        public void println(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
            writer.print('\n');
        }

        public void close() {
            writer.close();
        }

    }
}

