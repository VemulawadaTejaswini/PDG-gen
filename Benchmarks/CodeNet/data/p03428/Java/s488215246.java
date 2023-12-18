import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();

            List<Point> p = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                p.add(new Point(x, y, i));
            }
            List<Point> q = GenConvexHull(p);
            TreeMap<Point, Integer> set = new TreeMap<>();
            for (int i = 0; i < q.size(); i++) {
                set.put(q.get(i), i);
            }
//        dump(q);
            for (int ii = 0; ii < p.size(); ii++) {
                if (!set.containsKey(p.get(ii))) {
                    out.printf("%.10f\n", 0.0);
                    continue;
                }

                int i = set.get(p.get(ii));
                int j = (i + q.size() - 1) % q.size();
                int k = (i + 1) % q.size();

                double a1 = angle(q.get(j), q.get(i));
                double a2 = angle(q.get(i), q.get(k));
                double a = a1 - a2;
                if (a < 0) a += 2 * Math.PI;
//            dump(a1*180/Math.PI, a2*180/Math.PI, q.get(i), q.get(j), q.get(k));
                out.printf("%.10f\n", a / (2 * Math.PI));
            }
        }

        double angle(Point a, Point b) {
            Point d = a.sub(b);
            return Math.atan2(d.y, d.x);
        }

        private static boolean LeftRotate(List<Point> ps, int len) {
            int i = len - 2;
            double x1 = ps.get(i - 1).x, x2 = ps.get(i).x, x3 = ps.get(i + 1).x,
                    y1 = ps.get(i - 1).y, y2 = ps.get(i).y, y3 = ps.get(i + 1).y;
            Double cp = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
            return cp >= 0;
        }

        static List<Point> GenConvexHull(List<Point> pss) {
            if (pss.size() < 3) return pss;

            List<Point> ps = new ArrayList<>(pss);
            Collections.sort(ps);
            int ul = 0;
            final List<Point> upper = new ArrayList<Point>(ps.size());
            for (int i = 0; i < ps.size(); i++) {
                upper.add(null);
            }

            upper.set(ul++, ps.get(0));
            upper.set(ul++, ps.get(1));
            for (int i = 2; i < ps.size(); i++) {
                upper.set(ul++, ps.get(i));
                while (ul >= 3 && LeftRotate(upper, ul)) {
                    upper.set(ul - 2, upper.get(ul - 1));
                    ul--;
                }
            }

            int ll = 0;
            final List<Point> lower = new ArrayList<Point>(ps.size());
            for (int i = 0; i < ps.size(); i++) {
                lower.add(null);
            }

            lower.set(ll++, ps.get(ps.size() - 1));
            lower.set(ll++, ps.get(ps.size() - 2));
            for (int i = ps.size() - 3; i >= 0; i--) {
                lower.set(ll++, ps.get(i));
                while (ll >= 3 && LeftRotate(lower, ll)) {
                    lower.set(ll - 2, lower.get(ll - 1));
                    ll--;
                }
            }

            final List<Point> res = new ArrayList<Point>(ul + ll - 2);
            for (int i = 0; i < ul - 1; i++) res.add(upper.get(i));
            for (int i = 0; i < ll - 1; i++) res.add(lower.get(i));
            return res;
        }

        public class Point implements Comparable<Point> {
            public double x;
            public double y;
            int idx;

            public Point() {
            }

            public Point(double xx, double yy, int idx) {
                x = xx;
                y = yy;
                this.idx = idx;
            }

            public Point(Point p) {
                this(p.x, p.y, p.idx);
            }

            public Point subM(double x, double y) {
                this.x -= x;
                this.y -= y;
                return this;
            }

            public Point sub(Point p) {
                return sub(p.x, p.y);
            }

            public Point sub(double x, double y) {
                return new Point(this).subM(x, y);
            }

            public String toString() {
                return "(" + x + "," + y + ")";
            }


            public int compareTo(Point o) {
                final int cmp = Double.compare(x, o.x);
                return cmp != 0 ? cmp : Double.compare(y, o.y);
            }

        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

