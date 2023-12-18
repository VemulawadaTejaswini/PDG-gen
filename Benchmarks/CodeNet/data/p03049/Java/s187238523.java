import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            char[][] arr = new char[n][];
            for (int i = 0; i < n; i++) {
                arr[i] = in.readString().toCharArray();
            }
            int ans = 0;
            for (char[] s : arr) {
                for (int i = 0; i < s.length - 1; i++) {
                    if (s[i] == 'A' && s[i + 1] == 'B') {
                        ans++;
                    }
                }
            }
//        System.err.println("def ans = " + ans);
            int startB = 0;
            int endA = 0;
            int both = 0;
            for (char[] s : arr) {
                if (s[0] == 'B' && s[s.length - 1] == 'A') {
                    both++;
                } else {
                    if (s[0] == 'B') {
                        startB++;
                    }
                    if (s[s.length - 1] == 'A') {
                        endA++;
                    }
                }
            }
            ans += f(startB, endA, both);
            out.printLine(ans);
        }

        private int f(final int startB, final int endA, final int both) {
//        System.err.println(">> " + startB + " " + endA + " " + both);
            int maxAns = 0;
            for (int tt = 0; tt <= both; tt++) {
                int t = tt;
                int b = startB;
                int a = endA;
                int ans = 0;
                int d = Math.min(t, Math.min(b, a));
                ans += 2 * d;
                b -= d;
                a -= d;
                t -= d;
                ans += Math.max(0, t - 1);
                if (t > 0) {
                    b++;
                    a++;
                }
                ans += Math.min(b, a);
//            System.err.println(t + " " + d + " " + ans);
                maxAns = Math.max(maxAns, ans);
            }
            return maxAns;
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

        public String readString() {
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

        public void printLine(int i) {
            writer.println(i);
        }

    }
}

