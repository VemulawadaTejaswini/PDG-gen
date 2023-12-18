import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

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
        ZFrog3 solver = new ZFrog3();
        solver.solve(1, in, out);
        out.close();
    }

    static class ZFrog3 {
        double eps = 1e-6;

        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int n = in.nextInt();

            long c = in.nextLong();

            long[] h = in.nextLongArray(n);

            double[] dp = new double[n];

            dp[0] = 0;

            ConvexHullTrick cht = new ConvexHullTrick();

            cht.addToLastMinimumSlope(cht.new line(-2 * h[0], h[0] * h[0] + c));

            for (int i = 1; i < n; i++) {
                double val = cht.searchMinSortedSlopeDesc(h[i]);

                dp[i] = val + h[i] * h[i];

                cht.addToLastMinimumSlope(cht.new line(-2 * h[i], h[i] * h[i] + c + dp[i]));
            }

            out.println((long) (dp[n - 1] + eps));
        }

        class ConvexHullTrick {
            List<ExtendedLine> stack = new ArrayList<>();

            public void addToLastMinimumSlope(line l3) {
                if (stack.isEmpty()) {
                    stack.add(new ExtendedLine(l3, null));
                    return;
                }

                while (stack.size() > 1) {
                    ExtendedLine l2 = stack.get(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    ExtendedLine l1 = stack.get(stack.size() - 1);

                    point ip = l3.intersect(l1.line);
                    if (isLeft(ip, l2.intersectionPoint)) {
                        continue;
                    } else {
                        stack.add(l2);
                        stack.add(new ExtendedLine(l3, l3.intersect(l2.line)));
                        return;
                    }
                }

                stack.add(new ExtendedLine(l3, l3.intersect(stack.get(stack.size() - 1).line)));
            }

            public boolean isLeft(point p1, point p2) {
                return p1.x <= p2.x;
            }

            public double searchMinSortedSlopeDesc(double x) {
                assert !stack.isEmpty();
                if (stack.size() == 1 || stack.get(1).intersectionPoint.x > x) {
                    line line = stack.get(0).line;
                    return line.getSlope() * x + line.c;
                }

                int lo = 1;
                int hi = stack.size() - 1;

                int ans = 1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;

                    if (stack.get(mid).intersectionPoint.x <= x) {
                        ans = Math.max(ans, mid);
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }

                line line = stack.get(ans).line;
                return line.getSlope() * x + line.c;
            }

            class point {
                double x;
                double y;

                public point() {
                }

                public point(double x, double y) {
                    this.x = x;
                    this.y = y;
                }

            }

            class line {
                double a;
                double b;
                double c;

                public line(double a, double b, double c) {
                    this.a = a;
                    this.b = b;
                    this.c = c;
                }

                public line(double m, double c) {
                    this.a = -m;
                    this.b = 1;
                    this.c = c;
                }

                public line(double x1, double y1, double x2, double y2) {
                    this.a = y2 - y1;
                    this.b = x1 - x2;
                    this.c = a * x1 + b * y1;
                }

                public point intersect(line line) {
                    double det = a * line.b - line.a * b;

                    if (det == 0) {
                        return null;
                    } else {
                        point point = new point();

                        //Be careful of decimal precision issues here. BigDecimal can be helpful.
                        point.x = (line.b * c - b * line.c) / det;
                        point.y = (a * line.c - line.a * c) / det;

                        return point;
                    }
                }

                double getSlope() {
                    return -a / b;
                }

            }

            class ExtendedLine {
                line line;
                point intersectionPoint;

                public ExtendedLine(ConvexHullTrick.line line, point intersectionPoint) {
                    this.line = line;
                    this.intersectionPoint = intersectionPoint;
                }

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

        public void close() {
            writer.close();
        }

        public void println(long i) {
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

        public long nextLong() {
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

        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; ++i) array[i] = nextLong();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

