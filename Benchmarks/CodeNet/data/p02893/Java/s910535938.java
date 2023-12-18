import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        CDivisionByTwoWithSomething solver = new CDivisionByTwoWithSomething();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDivisionByTwoWithSomething {
        int mod = 998244353;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            String t = in.next();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) x[i] = t.charAt(i) - '0';
            int[] ct = new int[n + 1];
            List<Integer>[] child = LUtils.genArrayList(n + 1);
            for (int grpsize = 1; grpsize <= n; grpsize++) {
                if (n % grpsize == 0 && (n / grpsize) % 2 == 1) {
                    for (int k = grpsize * 2; k <= n; k += grpsize) {
                        child[k].add(grpsize);
                    }
                    int[] s1 = new int[n];
                    long a = 0;
                    for (int i = 0; i < grpsize; i++) {
                        a = a * 2 + x[i];
                        a %= mod;
                        s1[i] = x[i];
                    }
                    for (int i = grpsize; i < n; i++) {
                        s1[i] = 1 - s1[i - grpsize];
                    }
                    boolean less = true;
                    for (int i = 0; i < x.length; i++) {
                        if (x[i] < s1[i]) less = false;
                        if (x[i] != s1[i]) break;
                    }
                    if (less) {
                        a++;
                        if (a >= mod) a -= mod;
                    }
                    ct[grpsize] = (int) a;
                }
            }
            long ans = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i) % 2 == 1) {
                    for (int j : child[i]) {
                        ct[i] -= ct[j];
                        if (ct[i] < 0) ct[i] += mod;
                    }
                    ans = (ans + 2L * i * ct[i]) % mod;
                }
            }
            out.println(ans);
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

        public String next() {
            int c;
            while (isSpaceChar(c = this.read())) {
                ;
            }

            StringBuilder result = new StringBuilder();
            result.appendCodePoint(c);

            while (!isSpaceChar(c = this.read())) {
                result.appendCodePoint(c);
            }

            return result.toString();
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

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }

    static class LUtils {
        public static <E> List<E>[] genArrayList(int size) {
            return Stream.generate(ArrayList::new).limit(size).toArray(List[]::new);
        }

    }
}

