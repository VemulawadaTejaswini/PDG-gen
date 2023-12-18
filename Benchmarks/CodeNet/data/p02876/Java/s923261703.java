import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lewin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DBalanceBeam solver = new DBalanceBeam();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBalanceBeam {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            ArrayList<DBalanceBeam.Beam> bb = new ArrayList<>();
            ArrayList<DBalanceBeam.Beam> other = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (a < b) {
                    bb.add(new DBalanceBeam.Beam(a, b));
                } else {
                    other.add(new DBalanceBeam.Beam(a, b));
                }
            }
            if (bb.size() == 0) {
                out.println("0 1");
                return;
            }
            bb.sort(Comparator.comparingInt(x -> x.b));
            other.sort(Comparator.comparingInt(x -> x.a));
            int oidx = 0;
            long sa = 0;
            for (DBalanceBeam.Beam b : bb) sa += b.a;
            long add = 0;
            outer:
            for (int i = bb.size() - 1; i >= 0; i--) {
                if (bb.get(i).b >= sa) {
                    while (oidx < other.size()) {
                        long fnum = Math.min(other.get(oidx).a, bb.get(i).b - sa);
                        long fden = bb.get(i).b;
                        long have = other.get(oidx).a - fnum;
                        if (have > 0 && i == 0) {
                            fnum = bb.get(i).b + 1;
                        } else {
                            if (have > 0) {
                                long gnum = Math.min(have, bb.get(i - 1).b + 1);
                                long gden = bb.get(i - 1).b;

                                fnum = (fnum * gden + gnum * fden);
                                fden = fden * gden;
                            }
                        }
                        if (fnum < fden) {
                            sa += other.get(oidx).a;
                            oidx++;
                            add++;
                            i++;
                            continue outer;
                        } else {
                            break;
                        }
                    }
                    long num = 1L * (i + add) * bb.get(i).b + bb.get(i).b - sa;
                    long den = 1L * n * bb.get(i).b;
                    long g = Utils.gcd(num, den);
                    num /= g;
                    den /= g;
                    out.println(num + " " + den);
                    return;
                } else {
                    sa -= bb.get(i).b;
                }
            }
        }

        static class Beam {
            public int a;
            public int b;

            public Beam(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public String toString() {
                return "Beam{" +
                        "a=" + a +
                        ", b=" + b +
                        '}';
            }

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

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class Utils {
        public static long gcd(long x, long y) {
            for (; x != 0; x ^= y, y ^= x, x ^= y, x %= y) ;
            return y;
        }

    }
}

