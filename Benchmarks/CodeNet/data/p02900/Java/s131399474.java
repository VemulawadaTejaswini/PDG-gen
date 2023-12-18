import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DDisjointSetOfCommonDivisors solver = new DDisjointSetOfCommonDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDisjointSetOfCommonDivisors {
        int res;

        public void solve(int testNumber, InputReader c, OutputWriter w) {

            long a = c.readLong(), b = c.readLong();
            ArrayList<Long> a1 = Utils.getDivisors(a);
            ArrayList<Long> b1 = Utils.getDivisors(b);
            //w.printLine(a1);
            //w.printLine(b1);
            HashSet<Long> hs = new HashSet<>();
            HashSet<Long> r = new HashSet<>();
            for (long h : a1) {
                hs.add(h);
            }
            for (long j : b1) {
                if (hs.contains(j)) {
                    r.add(j);
                }
            }

            ArrayList<Long> re = new ArrayList<>();
            for (long fd : r) {
                re.add(fd);
            }
            //w.printLine(re);
            res = 0;
            for (int i = 0; i < re.size(); i++) {
                if (Utils.getDivisors(re.get(i)).size() == 2) {
                    res++;
                }
            }
            res++;
            w.printLine(res);


        }

    }

    static class Utils {
        public static ArrayList<Long> getDivisors(long n) {
            ArrayList<Long> divisors = new ArrayList<>();
            for (int i = 1; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0) {
                    divisors.add(i * 1L);
                    if (n / i != i) {
                        divisors.add(n / i);
                    }
                }
            }
            return divisors;
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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

        public void printLine(int i) {
            writer.println(i);
        }

    }
}

