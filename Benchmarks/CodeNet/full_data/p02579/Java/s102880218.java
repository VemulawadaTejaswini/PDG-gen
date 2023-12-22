import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Main {

    public static String Y = "Yes";
    public static String N = "No";
    public static long MOD = (long) (Math.pow(10, 9) + 7);
    public static Scanner sc = new Scanner(System.in);
    static int h;
    static int w;
    static boolean[][] checked;
    static int[][] depth;

    public static void main(String[] args) {

        h = ni();
        w = ni();

        int ch = ni();
        int cw = ni();

        int dh = ni();
        int dw = ni();

        checked = new boolean[h][w];
        depth = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                depth[i][j] = 10000;
            }
        }

        char[][] s = new char[h][w];
        Deque<XY> q = new ArrayDeque<>();
        q.addLast(new XY(ch - 1, cw - 1, 0));

        for (int i = 0; i < h; i++) {
            s[i] = nc();
        }

        int ans = Integer.MAX_VALUE;

        for (;;) {

            if (q.size() < 1) {
                break;
            }

            XY xy = q.pollLast();
            int hh = xy.h;
            int ww = xy.w;
            int dd = xy.d;

            debug(hh + " " + ww + " " + dd);

            if (hh == dh - 1 && ww == dw - 1) {
                if (ans > dd) {
                    ans = dd;
                    break;
                }
                if (ans == 0) {
                    break;
                }
                continue;
            }

            depth[hh][ww] = dd;

            //  && depth[hh][ww] != ddd
            //depth[hh][ww] = dd;

            //          if (checked[hh][ww]) {
            //              continue;
            //          } else {
            //              checked[hh][ww] = true;
            //          }

            // 現在の周囲をenqueue
            if (hh - 1 >= 0) {
                if (s[hh - 1][ww] == '.') {
                    if (depth[hh - 1][ww] == 10000) {
                        q.addLast(new XY(hh - 1, ww, dd));
                    }
                }
            }
            if (hh + 1 < h) {
                if (s[hh + 1][ww] == '.') {
                    if (depth[hh + 1][ww] == 10000) {
                        q.addLast(new XY(hh + 1, ww, dd));
                    }
                }
            }
            if (ww - 1 >= 0) {
                if (s[hh][ww - 1] == '.') {
                    if (depth[hh][ww - 1] == 10000) {
                        q.addLast(new XY(hh, ww - 1, dd));
                    }
                }
            }
            if (ww + 1 < w) {
                if (s[hh][ww + 1] == '.') {
                    if (depth[hh][ww + 1] == 10000) {
                        q.addLast(new XY(hh, ww + 1, dd));
                    }
                }
            }

            // ワープ
            if (hh - 2 >= 0) {
                for (int i = -2; i <= 2; i++) {
                    if (ww + i < w && ww + i >= 0) {
                        if (s[hh - 2][ww + i] == '.') {
                            if (depth[hh - 2][ww + i] == 10000) {
                                q.addFirst(new XY(hh - 2, ww + i, dd + 1));
                            }
                        }
                    }
                }
            }

            if (hh - 1 >= 0) {
                for (int i = -2; i <= 2; i++) {
                    if (i == 0) {
                        continue;
                    }
                    if (ww + i < w && ww + i >= 0) {
                        if (s[hh - 1][ww + i] == '.') {
                            if (depth[hh - 1][ww + i] == 10000) {
                                q.addFirst(new XY(hh - 1, ww + i, dd + 1));
                            }
                        }
                    }
                }
            }

            if (hh + 2 < h) {
                for (int i = -2; i <= 2; i++) {
                    if (ww + i < w && ww + i >= 0) {
                        if (s[hh + 2][ww + i] == '.') {
                            if (depth[hh + 1][ww + i] == 10000) {
                                q.addFirst(new XY(hh + 2, ww + i, dd + 1));
                            }
                        }
                    }
                }
            }

            if (hh + 1 < h) {
                for (int i = -2; i <= 2; i++) {
                    if (i == 0) {
                        continue;
                    }
                    if (ww + i < w && ww + i >= 0) {
                        if (s[hh + 1][ww + i] == '.') {
                            if (depth[hh + 1][ww + i] == 10000) {
                                q.addFirst(new XY(hh + 1, ww + i, dd + 1));
                            }
                        }
                    }
                }
            }

            for (int i = -2; i <= 2; i++) {
                if (i == 0 || i == -1 || i == 1) {
                    continue;
                }
                if (ww + i < w && ww + i >= 0) {
                    if (s[hh][ww + i] == '.') {
                        if (depth[hh][ww + i] == 10000) {
                            q.addFirst(new XY(hh, ww + i, dd + 1));
                        }
                    }
                }
            }
        }

        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }
        out(ans);

    }

    /*
     * 以下メソッド集
     */

    public static void permutation(String q, String ans) {

        // Base Case
        if (q.length() <= 1) {
            System.out.println(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
            }
        }
    }

    static char[][] same(char[][] c, int h, int w) {

        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = c[i][j];
            }
        }
        return a;

    }

    static int countkuro(char[][] c) {

        int count = 0;
        for (char[] cc : c) {
            for (char ccc : cc) {
                if ('#' == ccc) {
                    count++;
                }
            }
        }
        return count;
    }

    static void debug() {

        out("---");
    }

    static void debug(Object a) {

        out("-------");
        out(a);
        out("-------");
    }

    static int ketasuu(int n) {

        String str = "" + n;
        return str.length();
    }

    static int account(String str) {

        String target = "AC";
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            if (target.equals(str.substring(i, i + target.length()))) {
                count++;
            }
        }
        return count;
    }

    static int ni() {

        return sc.nextInt();
    }

    static long nl() {

        return sc.nextLong();
    }

    static double nd() {

        return sc.nextDouble();
    }

    static String n() {

        return sc.next();
    }

    static char[] nc() {

        return sc.next().toCharArray();
    }

    static int kaijo(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * kaijo(n - 1);
        }
    }

    static int fib(int n) {

        return (n == 1 || n == 0) ? n : fib(n - 2) + fib(n - 1);
    }

    static long lcm(long m, long n) {

        return m * n / gcd(m, n);
    }

    static int lcm(int m, int n) {

        return m * n / gcd(m, n);
    }

    static long gcd(long a, long b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static int gcd(int a, int b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static void out(Object obj) {

        System.out.println(obj);
    }

    static void outn(Object obj) {

        System.out.print(obj);
    }

    static double max(double d, double e) {

        return Math.max(d, e);
    }

    static long max(long a, long b) {

        return Math.max(a, b);
    }

    static long min(long d, long e) {

        return Math.min(d, e);
    }

    static int min(int a, int b) {

        return Math.min(a, b);
    }
}


class XY {

    int h;
    int w;
    int d;

    XY(int h, int w, int d) {
        this.h = h;
        this.w = w;
        this.d = d;
    }
}
