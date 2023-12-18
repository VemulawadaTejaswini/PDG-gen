import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
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
            PriorityQueue<DBalanceBeam.Beam> bb = new PriorityQueue<>(Comparator.comparingLong(x -> -x.b));
            ArrayList<DBalanceBeam.Beam> other = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (a <= b) {
                    bb.add(new DBalanceBeam.Beam(a, b));
                } else {
                    other.add(new DBalanceBeam.Beam(a, b));
                }
            }
            if (bb.size() == 0) {
                out.println("0 1");
                return;
            }
            other.sort(Comparator.comparingLong(x -> x.a - x.b));
            int oidx = 0;
            long sa = 0;
            long sb = 0;
            for (DBalanceBeam.Beam b : bb) {
                sa += b.a;
                sb += b.b;
            }
            while (sa > sb) {
                DBalanceBeam.Beam cb = other.get(other.size() - 1);
                if (cb.a + sa > cb.b + sb) {
                    sa += cb.a;
                    sb += cb.b;
                    bb.add(cb);
                    other.remove(other.size() - 1);
                } else {
                    break;
                }
            }
            other.sort(Comparator.comparingLong(x -> x.a));
            while (bb.size() > 0) {
                DBalanceBeam.Beam cb = bb.poll();
                if (cb.b >= sa) {
                    if (oidx < other.size()) {
                        long fnum = Math.min(other.get(oidx).a, cb.b - sa);
                        long fden = cb.b;
                        long have = other.get(oidx).a - fnum;
                        if (have > 0) {
                            if (bb.size() == 0) {
                                fnum = cb.b + 1;
                            } else {
                                long gnum = Math.min(have, bb.peek().b + 1);
                                long gden = bb.peek().b;

                                fnum = (fnum * gden + gnum * fden);
                                fden = fden * gden;
                            }
                        }
                        if (fnum < fden) {
                            sa += other.get(oidx).a;
                            bb.add(cb);
                            bb.add(other.get(oidx));
                            oidx++;
                            continue;
                        }
                    }
                    long num = 1L * bb.size() * cb.b + cb.b - sa;
                    long den = 1L * n * cb.b;
                    long g = Utils.gcd(num, den);
                    num /= g;
                    den /= g;
                    out.println(num + " " + den);
                    return;
                } else {
                    sa -= cb.b;
                }
            }
            throw new RuntimeException();
        }

        static class Beam {
            public long a;
            public long b;

            public Beam(long a, long b) {
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

