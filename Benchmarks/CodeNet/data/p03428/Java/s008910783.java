import java.io.*;
import java.util.*;

public class Main {
    private static InputStream is;
    private static PrintWriter out;
    private static String INPUT = "";

    void solve() throws Exception {
        int n = ni();
        Point[] points = new Point[n];
        for (int i = 0; i < n; ++i) {
            points[i] = new Point(nd(), nd());
        }
        Point[] outer = giftWrapping(points);
        int[] ids = new int[outer.length];
        for (int i = 0; i < outer.length; ++i) {
            for (int j = 0; j < n; ++j) {
                if (outer[i].equals(points[j])) {
                    ids[i] = j;
                    break;
                }
            }
        }
        final int test = 0x2000000;
        int count[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < test; ++i) {
            Point t;
            do {
                t = new Point(r.nextInt(), r.nextInt());
            } while ((double) Integer.MAX_VALUE < t.distance());
            int id = -1;
            double distance = Double.MAX_VALUE;
            for (int j = 0; j < outer.length; ++j) {
                double d = t.distance_(outer[j]);
                if (distance > d) {
                    distance = d;
                    id = j;
                }
            }
            count[ids[id]]++;
        }
        for (int i : count) {
            out.println((double) i / test);
        }
    }

    class Point {
        public final double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        Point sub(Point p) {
            return new Point(x - p.x, y - p.y);
        }

        double dot(Point p) {
            return x * p.x + y * p.y;
        }

        double cross(Point p) {
            return x * p.y - y * p.x;
        }

        double distance_() {
            return Math.pow(x, 2) + Math.pow(y, 2);
        }

        double distance() {
            return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }

        double distance_(Point p) {
            return Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2);
        }

        double distance(Point p) {
            return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        }

        boolean equals(Point p) {
            return x == p.x && y == p.y;
        }
    }

    Point[] giftWrapping(Point[] p) {
        List<Point> remain = new ArrayList<>();
        for (Point i : p) remain.add(i);
        List<Point> list = new ArrayList<>();
        Point a, b, s;
        a = p[0];
        for (Point c : remain) {
            if (a.y > c.y || (a.y == c.y && a.x > c.x)) a = c;
        }
        s = a;
        do {
            list.add(a);
            remain.remove(a);
            if (remain.isEmpty()) break;
            b = remain.get(0);
            for (Point c : remain) {
                if (a.equals(b)) {
                    b = c;
                } else {
                    Point ab = a.sub(b);
                    Point ac = a.sub(c);
                    double v = ab.cross(ac);
                    if (v > 0 || (v < 1e-8 && ac.distance() > ab.distance())) b = c;
                }
            }
            a = b;
        } while (!s.equals(a));
        return list.toArray(new Point[p.length]);
    }

    public static void main(String[] args) throws Exception {
        long S = System.currentTimeMillis();
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);

        new Main().solve();
        out.flush();
        long G = System.currentTimeMillis();
        tr(G - S + " ms");
    }

    private static boolean eof() {
        if (lenbuf == -1) return true;
        int lptr = ptrbuf;
        while (lptr < lenbuf)
            if (!isSpaceChar(inbuf[lptr++])) return false;

        try {
            is.mark(1000);
            while (true) {
                int b = is.read();
                if (b == -1) {
                    is.reset();
                    return true;
                } else if (!isSpaceChar(b)) {
                    is.reset();
                    return false;
                }
            }
        } catch (IOException e) {
            return true;
        }
    }

    private static byte[] inbuf = new byte[1024];
    static int lenbuf = 0, ptrbuf = 0;

    private static int readByte() {
        if (lenbuf == -1) throw new InputMismatchException();
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) return -1;
        }
        return inbuf[ptrbuf++];
    }

    private static boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private static int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b))
            ;
        return b;
    }

    private static double nd() {
        return Double.parseDouble(ns());
    }

    private static char nc() {
        return (char) skip();
    }

    private static String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private static char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private static char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for (int i = 0; i < n; i++)
            map[i] = ns(m);
        return map;
    }

    private static int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }

    private static long[] nal(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }

    private static int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}