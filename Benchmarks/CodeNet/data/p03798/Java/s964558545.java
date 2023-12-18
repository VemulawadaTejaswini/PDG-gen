import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DMenagerie solver = new DMenagerie();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMenagerie {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            final char UNDEF = 'Z';

            int n = in.nextInt();
            String s = in.nextString();

            outer:
            for (int mask = 0; mask < 8; mask++) {
                char[] ret = new char[n];
                Arrays.fill(ret, UNDEF);
                for (int bit = 0; bit < 3; bit++) {
                    char animal = ((mask >> bit) & 1) == 1 ? 'W' : 'S';
                    if (bit < 2) {
                        ret[bit] = animal;
                    } else {
                        ret[n - 1] = animal;
                    }
                }
                for (int i = 0; i < n; i++) {
                    char ans = s.charAt(i);
                    char cur = ret[i];
                    char prev = ret[(n + i - 1) % n];
                    int nextIdx = (i + 1) % n;
                    char next = UNDEF;
                    if (ans == 'o') {
                        if (cur == 'W') {
                            next = prev == 'W' ? 'S' : 'W';
                        } else if (cur == 'S') {
                            next = prev;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        if (cur == 'W') {
                            next = prev;
                        } else if (cur == 'S') {
                            next = prev == 'W' ? 'S' : 'W';
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    if (ret[nextIdx] == UNDEF) {
                        ret[nextIdx] = next;
                    } else {
                        if (next != ret[nextIdx]) {
                            continue outer;
                        } else if (i == n - 1) {
                            out.println(ret);
                            return;
                        }
                    }
                }
            }

            out.println(-1);
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

        public void println(char[] array) {
            writer.println(array);
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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
}

