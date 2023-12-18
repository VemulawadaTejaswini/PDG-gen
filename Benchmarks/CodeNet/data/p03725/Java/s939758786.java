import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = true;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private int H;
    private int W;
    private int K;
    private int[][] b;

    private void solve(Scanner sc) {
        H = sc.nextInt();
        W = sc.nextInt();
        K = sc.nextInt();
        sc.nextLine();
        int x = 1;
        int y = 1;
        b = new int[H][W];
        for (int i = 0; i < H; ++i) {
            String s = sc.nextLine();
            for (int j = 0; j < W; ++j) {
                char ch = s.charAt(j);
                if (ch == '.') {
                    b[i][j] = 1;
                } else if (ch == 'S') {
                    b[i][j] = 2;
                    x = j;
                    y = i;
                } else {
                    b[i][j] = -1;
                }
            }
        }

        int[][] m = {
            { 1, 0, },
            { -1, 0, },
            { 0, 1, },
            { 0, -1, },
        };

        int[][] tmp = b.clone();
        int[][] v = new int[H][W];
        for (int i = 0; i < v.length; ++i) {
            Arrays.fill(v[i], -1);
        }
        v[y][x] = 0;
        List<Point> list = new ArrayList<>();
        List<Point> list2 = new ArrayList<>();
        list.add(new Point(x, y));
        while (!list.isEmpty()) {
            Point p = list.remove(0);
            list2.add(p);
            if (v[(int)p.y][(int)p.x] >= K) {
                break;
            }
            for (int i = 0; i < m.length; ++i) {
                int xx = (int)(p.x + m[i][0]);
                int yy = (int)(p.y + m[i][1]);
                if (!edge(xx, yy) && b[yy][xx] >= 0 && v[yy][xx] < 0) {
                    v[yy][xx] = v[(int)p.y][(int)p.x] + 1;
                    list.add(new Point(xx, yy));
                }
            }
        }
if (debug) {
for (int i = 0; i < b.length; ++i) {
    for (int j = 0; j < b[i].length; ++j) {
        _err.printf("%2d ", b[i][j]);
    }
    _err.println();
}
_err.println("--------");
for (int i = 0; i < v.length; ++i) {
    for (int j = 0; j < v[i].length; ++j) {
        _err.printf("%2d ", v[i][j]);
    }
    _err.println();
}
}

        int rmin = Integer.MAX_VALUE;
        while (!list2.isEmpty()) {
            Point p = list2.remove(0);
            for (int i = 0; i < m.length; ++i) {
                b = tmp.clone();
                rmin = Math.min(rmin, search((int)p.x, (int)p.y, m[i][0], m[i][1]) + (v[(int)p.y][(int)p.x] > 0 ? 1 : 0));
            }
        }

        _out.println(rmin);
    }
    private int search(int x, int y, int dx, int dy) {
        if (edge(x, y)) {
            return 0;
        }

        for (int i = 0; i < K && b[y + dy][x + dx] >= 0; ++i) {
            x += dx;
            y += dy;
            if (edge(x, y)) {
                break;
            }
        }
        if (edge(x, y)) {
            return 1;
        }

        int xx = x + dx;
        int yy = y + dy;
        int k = 0;
        while (k < K) {
            if (b[yy][xx] < 0) {
                ++k;
                b[yy][xx] = 0;
            }
            if (edge(xx, yy)) {
                break;
            }
            xx += dx;
            yy += dy;
        }
        return search(x, y, dx, dy) + 1;
    }
    private boolean edge(int x, int y) {
        if (x <= 0 || y <= 0 || x >= W - 1 || y >= H - 1) {
            return true;
        } else {
            return false;
        }
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    private static class Point implements Comparable<Point> {
        long x;
        long y;
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
        public boolean equals(Object o) {
            if (o instanceof Point) {
                Point that = (Point)o;
                return this.x == that.x && this.y == that.y;
            }
            return false;
        }
        public int hashCode() {
            int hashCode = 17;
            hashCode = hashCode * 31 + (int)(x ^ (x >>> 32));
            hashCode = hashCode * 31 + (int)(y ^ (y >>> 32));
            return hashCode;
        }
        public int compareTo(Point that) {
            if (this.x != that.x) {
                return this.x > that.x ? 1 : -1;
            }
            if (this.y != that.y) {
                return this.y > that.y ? 1 : -1;
            }
            return 0;
        }
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        new Main().solve(sc);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}