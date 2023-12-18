import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public HashMap<TaskD.Triple, Integer> mp;

        public int f(int a, int b, int mx) {
            TaskD.Triple tt = new TaskD.Triple(a, b, mx);
            Integer g = mp.get(tt);
            if (g != null) return g;
            int lo = 0, hi = Math.min(b, a / mx);
            while (lo < hi) {
                int mid = (lo + hi + 1) / 2;
                int useda = mid * mx;
                int usedb = mid;
                int lefta = a - useda;
                int leftb = b - usedb;

                if (lefta < 0 || leftb < 0 || leftb > lefta * mx) {
                    hi = mid - 1;
                    continue;
                } else {
                    lo = mid;
                }
            }
            mp.put(tt, lo);
            return lo;
        }

        public char f(int a, int b, int pos, int mx) {
            int xor = 0;
            while (a > mx || b > mx) {
                if (b > a) {
                    int t = b;
                    b = a;
                    a = t;
                    pos = a + b - pos - 1;
                    xor ^= 'A' ^ 'B';
                    continue;
                }

                int lo = f(a, b, mx);
                int useda = lo * mx;
                int usedb = lo;
                int lefta = a - useda;
                int leftb = b - usedb;

                if (pos < lo * (mx + 1)) {
                    if (pos % (mx + 1) == mx) {
                        return (char) ('B' ^ xor);
                    } else {
                        return (char) ('A' ^ xor);
                    }
                }

                a = lefta;
                b = leftb;
                pos -= lo * (mx + 1);
            }
            return (char) ((pos < a ? 'A' : 'B') ^ xor);
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int q = in.nextInt();
            mp = new HashMap<>();
            while (q-- > 0) {
                int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
                for (int i = c; i <= d; i++) {
                    out.print(f(a, b, i - 1, (a + b) / (Math.min(a, b) + 1)));
                }
                out.println();
            }
        }

        static class Triple {
            public int a;
            public int b;
            public int c;


            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                TaskD.Triple triple = (TaskD.Triple) o;

                if (a != triple.a) return false;
                if (b != triple.b) return false;
                return c == triple.c;
            }


            public int hashCode() {
                int result = a;
                result = 31 * result + b;
                result = 31 * result + c;
                return result;
            }

            public Triple(int a, int b, int c) {

                this.a = a;
                this.b = b;
                this.c = c;
            }

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

        public void println() {
            writer.println();
        }

        public void print(char i) {
            writer.print(i);
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

