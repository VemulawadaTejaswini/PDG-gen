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
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Comparator;
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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        int S(long n) {
            int res = 0;
            while (n > 0) {
                res += n % 10;
                n /= 10;
            }
            return res;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long k = in.readLong();

            List<Long> a = new ArrayList<>();
            for (long i = 1; i <= 9; i++) {
                a.add(i);
            }
            for (long i = 19; i <= 99; i += 10) {
                a.add(i);
            }
            for (long i = 199; i <= 999; i += 10) {
                a.add(i);
            }
            for (int len = 4; len <= 16; len++) {
                long pow10 = BigInteger.valueOf(10).pow(len - 2).longValue();
                for (int start = 10; start <= 99; start++) {
                    long num = pow10 * start + (pow10 - 1);
                    a.add(num);
                }
            }
            Comparator<Long> cmp = new Comparator<Long>() {

                public int compare(Long o1, Long o2) {
                    return Long.compare(o1 * S(o2), o2 * S(o1));
                }
            };
            List<Long> good = new ArrayList<>();
            for (int i = 0; i < a.size(); i++) {
                boolean isGood = true;
                for (int j = i + 1; j < a.size(); j++) {
                    if (cmp.compare(a.get(j), a.get(i)) < 0) {
                        isGood = false;
                        break;
                    }
                }
                if (isGood) {
                    good.add(a.get(i));
                }
            }
            for (int i = 0; i < k; i++) {
                out.printLine(good.get(i));
            }

//        if (true) return;
//
//        PrintWriter pw = null;
//        try {
//            pw = new PrintWriter("c.txt");
//            List<Pair> list = new ArrayList<>();
//            for (int n = 1; n <= 1200000; n++) {
////                pw.println(n + " " + 1.0 * n / S(n));
//                list.add(new Pair(n, S(n)));
//            }
////            List<Pair> lis = lis(list);
////            for (Pair pair : lis) {
////                pw.println(pair);
////            }
//            List<Pair> res = new ArrayList<>();
//            for (int i = 0; i < list.size(); i++) {
//                boolean isGood = true;
//                for (int j = i + 1; j < list.size(); j++) {
//                    if (list.get(j).compareTo(list.get(i)) < 0) {
//                        isGood = false;
//                        break;
//                    }
//                }
//                if (isGood) {
//                    res.add(list.get(i));
//                    pw.println(list.get(i));
//                    pw.flush();
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//
//        } finally {
//            pw.close();
//        }

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
}

