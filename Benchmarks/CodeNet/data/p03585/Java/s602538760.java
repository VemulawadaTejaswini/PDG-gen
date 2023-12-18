import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskE {
        double prec = 1e-11;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            Line[] lines = new Line[n];
            for (int i = 0; i < n; i++) {
                double a = in.readInt();
                double b = in.readInt();
                double c = in.readInt();
                GeometryUtils.Point2D pt0 = new GeometryUtils.Point2D(0, apply(a, b, c, 0));
                GeometryUtils.Point2D pt1 = new GeometryUtils.Point2D(1, apply(a, b, c, 1));
                GeometryUtils.Line2D line = new GeometryUtils.Line2D(pt0, pt1);
                lines[i] = new Line();
                lines[i].line = line;
                lines[i].ab = -a / b;
                lines[i].ba = b / a;
            }


            Arrays.sort(lines, (a, b) -> Double.compare(a.ba, b.ba));
            for (int i = 0; i < n; i++) {
                lines[i].baIndex = i + 1;
            }
            Arrays.sort(lines, (a, b) -> Double.compare(a.ab, b.ab));
            for (int i = 0; i < n; i++) {
                lines[i].abIndex = i + 1;
            }


            // find x
            BIT bit = new BIT(n);
            double xl = -100000000;
            double xr = 100000000;

            int total = n * (n - 1) / 2;
            while (xr - xl > prec) {
                int leftCnt = 0;
                int rightCnt = 0;
                bit.clear();
                double m = (xl + xr) / 2;

                GeometryUtils.Line2D test = new GeometryUtils.Line2D(new GeometryUtils.Point2D(m, 0),
                                new GeometryUtils.Point2D(m, 1));
                for (int i = 0; i < n; i++) {
                    lines[i].intersect = test.intersect(lines[i].line).y;
                }
                Arrays.sort(lines, (a, b) -> Double.compare(a.intersect, b.intersect));
                for (int i = 0; i < n; i++) {
                    int l = i;
                    int r = i;
                    while (r + 1 < n && CompareUtils.compare(lines[r].intersect, lines[r + 1].intersect, prec) == 0) {
                        r++;
                    }
                    i = r;

                    for (int j = l; j <= r; j++) {
                        leftCnt += bit.query(lines[j].abIndex);
                        rightCnt += bit.query(n) - bit.query(lines[j].abIndex);
                    }
                    for (int j = l; j <= r; j++) {
                        bit.update(lines[j].abIndex, 1);
                    }
                }

                if (leftCnt >= total - leftCnt) {
                    xr = m;
                } else if (rightCnt > total - rightCnt) {
                    xl = m;
                } else {
                    xr = m;
                }
            }

            double yl = -100000000;
            double yr = 100000000;
            while (yr - yl > prec) {
                int leftCnt = 0;
                int rightCnt = 0;
                bit.clear();
                double m = (yl + yr) / 2;

                GeometryUtils.Line2D test = new GeometryUtils.Line2D(new GeometryUtils.Point2D(0, m),
                                new GeometryUtils.Point2D(1, m));
                for (int i = 0; i < n; i++) {
                    lines[i].intersect = test.intersect(lines[i].line).x;
                }
                Arrays.sort(lines, (a, b) -> Double.compare(a.intersect, b.intersect));
                for (int i = 0; i < n; i++) {
                    int l = i;
                    int r = i;
                    while (r + 1 < n && CompareUtils.compare(lines[r].intersect, lines[r + 1].intersect, prec) == 0) {
                        r++;
                    }
                    i = r;

                    for (int j = l; j <= r; j++) {
                        rightCnt += bit.query(lines[j].baIndex);
                        leftCnt += bit.query(n) - bit.query(lines[j].baIndex);
                    }
                    for (int j = l; j <= r; j++) {
                        bit.update(lines[j].baIndex, 1);
                    }
                }

                if (leftCnt >= total - leftCnt) {
                    yr = m;
                } else if (rightCnt > total - rightCnt) {
                    yl = m;
                } else {
                    yr = m;
                }
            }

            out.printf("%.15f %.15f", xl, yl);
        }

        double apply(double a, double b, double c, double x) {
            return (c - a * x) / b;
        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput printf(String format, Object... args) {
            cache.append(String.format(format, args));
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }
    static class GeometryUtils {
        private static final double PREC = 1e-11;

        public static double valueOf(double x) {
            return x > -PREC && x < PREC ? 0 : x;
        }

        public static class Point2D {
            public final double x;
            public final double y;

            public Point2D(double x, double y) {
                this.x = valueOf(x);
                this.y = valueOf(y);
            }

            public String toString() {
                return String.format("(%f, %f)", x, y);
            }

            public int hashCode() {
                return (int) (Double.doubleToLongBits(x) * 31 + Double.doubleToLongBits(y));
            }

            public boolean equals(Object obj) {
                GeometryUtils.Point2D other = (GeometryUtils.Point2D) obj;
                return x == other.x && y == other.y;
            }

        }

        public static class Line2D {
            public final GeometryUtils.Point2D a;
            public final GeometryUtils.Point2D b;
            public final GeometryUtils.Point2D d;
            public final double theta;

            public Line2D(GeometryUtils.Point2D a, GeometryUtils.Point2D b) {
                this.a = a;
                this.b = b;
                d = new GeometryUtils.Point2D(b.x - a.x, b.y - a.y);
                theta = Math.atan2(d.y, d.x);
            }

            public GeometryUtils.Point2D intersect(GeometryUtils.Line2D another) {
                double m11 = b.x - a.x;
                double m01 = another.b.x - another.a.x;
                double m10 = a.y - b.y;
                double m00 = another.a.y - another.b.y;

                double div = valueOf(m00 * m11 - m01 * m10);
                if (div == 0) {
                    return null;
                }

                double v0 = (another.a.x - a.x) / div;
                double v1 = (another.a.y - a.y) / div;

                double alpha = m00 * v0 + m01 * v1;
                return getPoint(alpha);
            }

            public GeometryUtils.Point2D getPoint(double alpha) {
                return new GeometryUtils.Point2D(a.x + d.x * alpha, a.y + d.y * alpha);
            }

            public String toString() {
                return d.toString();
            }

        }

    }
    static class Line {
        GeometryUtils.Line2D line;
        double intersect;
        double ba;
        double ab;
        int baIndex;
        int abIndex;

    }
    static class BIT {
        private int[] data;
        private int n;

        public BIT(int n) {
            this.n = n;
            data = new int[n + 1];
        }

        public int query(int i) {
            int sum = 0;
            for (; i > 0; i -= i & -i) {
                sum += data[i];
            }
            return sum;
        }

        public void update(int i, int mod) {
            if (i <= 0) {
                return;
            }
            for (; i <= n; i += i & -i) {
                data[i] += mod;
            }
        }

        public void clear() {
            Arrays.fill(data, 0);
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                builder.append(query(i) - query(i - 1)).append(' ');
            }
            return builder.toString();
        }

    }
    static class CompareUtils {
        private CompareUtils() {}

        public static double compare(double a, double b, double prec) {
            return Math.abs(a - b) < prec ? 0 : Double.compare(a, b);
        }

    }
    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }
}

