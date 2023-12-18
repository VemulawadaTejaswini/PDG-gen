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
        FEngines solver = new FEngines();
        solver.solve(1, in, out);
        out.close();
    }

    static class FEngines {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            final double epsilon = 1e-11;
            int n = in.readInt();
            List<Vector> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = in.readInt();
                int y = in.readInt();
                list.add(new Vector(x, y));
                out.printLine(list.get(i).angle());
            }

            list.sort(Comparator.comparing(Vector::angle));
            double ans = 0;
            for (Vector v1 : list) {
                double x = 0;
                double y = 0;
                double angle = v1.angle();
                for (Vector v2 : list) {
                    double tmp = v2.angle();
                    if (tmp < angle - epsilon) tmp += 2 * Math.PI;
                    if (angle - epsilon <= tmp && tmp < angle + Math.PI - epsilon) {
                        x += v2.x;
                        y += v2.y;
                    }
                }
                ans = Math.max(ans, Math.sqrt(x * x + y * y));
            }
            out.printLine(ans);
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

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class Vector {
        public final double x;
        public final double y;
        public final Point point;

        public Vector(double x, double y) {
            this.x = x;
            this.y = y;
            point = new Point(x, y);
        }

        public Vector(Point point) {
            this.x = point.x;
            this.y = point.y;
            this.point = point;
        }

        public Vector(Point from, Point to) {
            this(to.x - from.x, to.y - from.y);
        }

        public double angle() {
            return point.angle();
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

    static class Point {
        public final double x;
        public final double y;

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Point point = (Point) o;

            return Math.abs(x - point.x) <= GeometryUtils.epsilon && Math.abs(y - point.y) <= GeometryUtils.epsilon;
        }

        public int hashCode() {
            int result;
            long temp;
            temp = x != +0.0d ? Double.doubleToLongBits(x) : 0L;
            result = (int) (temp ^ (temp >>> 32));
            temp = y != +0.0d ? Double.doubleToLongBits(y) : 0L;
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        public double angle() {
            return Math.atan2(y, x);
        }

    }

    static class GeometryUtils {
        public static double epsilon = 1e-8;

    }
}

