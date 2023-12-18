import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
 *
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            Point[] p = new Point[n];
            for (int i = 0; i < n; i++) {
                p[i] = Point.readPoint(in);
            }
            double[] answer = new double[n];
            Polygon pol = Polygon.convexHull(p.clone());
            for (int i = 0; i < pol.vertices.length; i++) {
                int prev = i - 1;
                if (prev < 0) {
                    prev += pol.vertices.length;
                }
                int next = i + 1;
                if (next >= pol.vertices.length) {
                    next -= pol.vertices.length;
                }
                double ang1 = new Vector(pol.vertices[prev], pol.vertices[i]).angle();
                double ang2 = new Vector(pol.vertices[i], pol.vertices[next]).angle();
                double ang = ang1 - ang2;
                if (ang < 0) {
                    ang += 2 * Math.PI;
                }
                for (int j = 0; j < n; j++) {
                    if (p[j].equals(pol.vertices[i])) {
                        answer[j] = ang / (2 * Math.PI);
                    }
                }
            }
            for (double d : answer) {
                out.printLine(d);
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

    static class Polygon {
        public final Point[] vertices;

        public Polygon(Point... vertices) {
            this.vertices = vertices.clone();
        }

        public static boolean over(Point a, Point b, Point c) {
            return a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y) < -GeometryUtils.epsilon;
        }

        private static boolean under(Point a, Point b, Point c) {
            return a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y) > GeometryUtils.epsilon;
        }

        public static Polygon convexHull(Point[] points) {
            if (points.length == 1) {
                return new Polygon(points);
            }
            Arrays.sort(points, new Comparator<Point>() {
                public int compare(Point o1, Point o2) {
                    int value = Double.compare(o1.x, o2.x);
                    if (value != 0) {
                        return value;
                    }
                    return Double.compare(o1.y, o2.y);
                }
            });
            Point left = points[0];
            Point right = points[points.length - 1];
            List<Point> up = new ArrayList<Point>();
            List<Point> down = new ArrayList<Point>();
            for (Point point : points) {
                if (point == left || point == right || !under(left, point, right)) {
                    while (up.size() >= 2 && under(up.get(up.size() - 2), up.get(up.size() - 1), point)) {
                        up.remove(up.size() - 1);
                    }
                    up.add(point);
                }
                if (point == left || point == right || !over(left, point, right)) {
                    while (down.size() >= 2 && over(down.get(down.size() - 2), down.get(down.size() - 1), point)) {
                        down.remove(down.size() - 1);
                    }
                    down.add(point);
                }
            }
            Point[] result = new Point[up.size() + down.size() - 2];
            int index = 0;
            for (Point point : up) {
                result[index++] = point;
            }
            for (int i = down.size() - 2; i > 0; i--) {
                result[index++] = down.get(i);
            }
            return new Polygon(result);
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

        public static Point readPoint(InputReader in) {
            double x = in.readDouble();
            double y = in.readDouble();
            return new Point(x, y);
        }

    }

    static class GeometryUtils {
        public static double epsilon = 1e-8;

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

        public double readDouble() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, readInt());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E') {
                        return res * Math.pow(10, readInt());
                    }
                    if (c < '0' || c > '9') {
                        throw new InputMismatchException();
                    }
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

