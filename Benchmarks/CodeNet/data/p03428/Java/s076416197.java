import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.FileReader;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            TaskB.Point[] ps = new TaskB.Point[n];
            for (int i = 0; i < ps.length; i++) {
                ps[i] = new TaskB.Point(in.nextInt(), in.nextInt(), i);
            }
            ps = convexHull(ps);
            double[] ans = new double[n];
            for (int i = 0; i < ps.length; i++) {
                TaskB.Point prev = ps[(i - 1 + ps.length) % ps.length];
                TaskB.Point next = ps[(i + 1) % ps.length];
                TaskB.Point cur = ps[i];
                double g = Complex.angle(new Complex(prev.x, prev.y), new Complex(cur.x, cur.y), new Complex(next.x, next.y));
                Debug.print(ps[i].idx, g / 2.0 / Math.PI * 360);
                ans[ps[i].idx] = (Math.PI - g) / Math.PI / 2.0;
            }
            for (double x : ans) out.printf("%.10f\n", x);
        }

        public TaskB.Point[] convexHull(TaskB.Point[] p) {
            int n = p.length;
            if (n <= 1) return p;
            Arrays.sort(p, (a, b) -> Integer.compare(a.x, b.x) != 0 ? Integer.compare(a.x, b.x) : Integer.compare(a.y, b.y));
            TaskB.Point[] q = new TaskB.Point[n * 2];
            int cnt = 0;
            for (int i = 0; i < n; q[cnt++] = p[i++])
                for (; cnt > 1 && cross(q[cnt - 2], q[cnt - 1], p[i]) >= 0; --cnt) ;
            for (int i = n - 2, t = cnt; i >= 0; q[cnt++] = p[i--])
                for (; cnt > t && cross(q[cnt - 2], q[cnt - 1], p[i]) >= 0; --cnt) ;
            return Arrays.copyOf(q, cnt - 1 - (q[0].x == q[1].x && q[0].y == q[1].y ? 1 : 0));
        }

        static long cross(TaskB.Point a, TaskB.Point b, TaskB.Point c) {
            return (long) (b.x - a.x) * (c.y - a.y) - (long) (b.y - a.y) * (c.x - a.x);
        }

        public static class Point {
            public final int x;
            public final int y;
            public int idx;

            public Point(int x, int y, int idx) {
                this.x = x;
                this.y = y;
                this.idx = idx;
            }

        }

    }

    static class Complex {
        final double x;
        final double y;

        public Complex(double x) {
            this.x = x;
            this.y = 0;
        }

        public Complex(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public static double angle(Complex a, Complex p, Complex b) {
            a = a.sub(p);
            b = b.sub(p);
            return Math.atan2(a.cross(b), a.dot(b));
        }

        public Complex sub(Complex b) {
            return new Complex(x - b.x, y - b.y);
        }

        public double cross(Complex b) {
            return x * b.y - y * b.x;
        }

        public double dot(Complex b) {
            return x * b.x + y * b.y;
        }


        public String toString() {
            return "Complex [x=" + x + ", y=" + y + "]";
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

        public void printf(String format, Object... objects) {
            writer.printf(format, objects);
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

    static class Debug {
        public static boolean DEBUG;

        static {
            try {
                DEBUG = System.getProperty("user.dir").contains("Dropbox");
            } catch (Exception e) {
                DEBUG = false;
            }
        }

        private static ArrayList<String> getParams() {
            StackTraceElement[] t = Thread.currentThread().getStackTrace();
            StackTraceElement up = t[3];

            ArrayList<String> ret = new ArrayList<>();
            String qqq = up.toString();
            ret.add("." + up.getMethodName() + qqq.substring(qqq.indexOf("("), qqq.length()));
            try {
                BufferedReader br = new BufferedReader(new FileReader(
                        new File("src/" + up.getClassName().replaceAll("\\.", "/") + ".java")));
                int g = up.getLineNumber();
                while (--g > 0) br.readLine();
                String q = br.readLine();
                String[] ss = q.split("Debug\\.print\\(");
                String[] qq = ss[1].substring(0, ss[1].lastIndexOf(")")).split(",");
                for (int i = 0; i < qq.length; i++) {
                    ret.add(qq[i].trim());
                }
            } catch (Exception e) {
            }
            for (int i = 0; i < 100; i++) ret.add("???");
            return ret;
        }

        private static String toString(Object o) {
            if (o == null) {
                return "null";
            } else if (o instanceof Object[]) {
                return Arrays.toString((Object[]) o);
            } else if (o instanceof char[]) {
                return new String((char[]) o);
            } else if (o instanceof int[]) {
                return Arrays.toString((int[]) o);
            } else if (o instanceof long[]) {
                return Arrays.toString((long[]) o);
            } else if (o instanceof double[]) {
                return Arrays.toString((double[]) o);
            } else {
                return o.toString();
            }
        }

        public static void print(Object... x) {
            if (!DEBUG) return;
            ArrayList<String> s = getParams();
            System.out.print(s.get(0) + ": ");
            for (int i = 0; i < x.length; i++) {
                System.out.print(s.get(i + 1) + " = " + toString(x[i]));
                if (i != x.length - 1) System.out.print(", ");
            }
            System.out.println();
        }

    }
}

