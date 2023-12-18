import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    void solve() throws IOException {
        // 問題を勘違いしてた
        int n = ni();
        int a = ni() - 1;
        int b = ni() - 1;
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            long xx = nl();
            long yy = nl();
            x[i] = yy + xx - 2;
            y[i] = yy - xx + 999999999;

            out.println("(" + x[i] + ", " + (y[i] - 999999999) + ")");
        }

        long d = Math.max(Math.abs(x[a] - x[b]), Math.abs(y[a] - y[b]));

        long t = 2000000000;

        TreeSet<Long> setX = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if (i != a && i != b) {
                setX.add(y[i] * t + x[i]);
            }
        }

        TreeSet<Long> setY = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if (i != a && i != b) {
                setY.add(x[i] * t + y[i]);
            }
        }

        ArrayDeque<Long> Q = new ArrayDeque<>();
        Q.add(x[a] * t + y[a]);
        Q.add(x[b] * t + y[b]);

        int ans = 0;

        while (!Q.isEmpty()) {
            long p = Q.poll();
            long xx = p / t;
            long yy = p % t;

            out.println("(" + xx + ", " + (yy - 999999999) + ")");
            out.println(setX);
            out.println(setY);
            ans++;

            if (xx + d < t) {
                long sy = Math.max(0, yy - d);
                long ty = Math.min(t - 1, yy + d);
                while (true) {
                    Long r = setY.higher((xx + d) * t + sy - 1);
                    if (r == null || r > (xx + d) * t + ty) break;
                    long rx = r / t;
                    long ry = r % t;
                    Q.add(r);
                    setY.remove(r);
                    setX.remove(ry * t + rx);
                }
            }

            if (xx - d >= 0) {
                long sy = Math.max(0, yy - d);
                long ty = Math.min(t - 1, yy + d);
                while (true) {
                    Long r = setY.higher((xx - d) * t + sy - 1);
                    if (r == null || r > (xx - d) * t + ty) break;
                    long rx = r / t;
                    long ry = r % t;
                    Q.add(r);
                    setY.remove(r);
                    setX.remove(ry * t + rx);
                }
            }

            if (yy + d < t) {
                long sx = Math.max(0, xx - d);
                long tx = Math.min(t - 1, xx + d);
                while (true) {
                    Long r = setX.higher((yy + d) * t + sx - 1);
                    if (r == null || r > (yy + d) * t + tx) break;
                    long ry = r / t;
                    long rx = r % t;
                    Q.add(rx * t + ry);
                    setX.remove(r);
                    setY.remove(rx * t + ry);
                }
            }

            if (yy - d >= 0) {
                long sx = Math.max(0, xx - d);
                long tx = Math.min(t - 1, xx + d);
                while (true) {
                    Long r = setX.higher((yy - d) * t + sx - 1);
                    if (r == null || r > (yy - d) * t + tx) break;
                    long ry = r / t;
                    long rx = r % t;
                    Q.add(rx * t + ry);
                    setX.remove(r);
                    setY.remove(rx * t + ry);
                }
            }
        }

        out.println(ans);
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    class INA {
        int[][] a;

        INA(int n, int m) throws IOException {
            this(n, m, -1);
        }

        INA(int n, int m, int t) throws IOException {
            a = new int[m][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[j][i] = ni() + t;
                }
            }
        }

        int[] get(int i) {
            return a[i - 1];
        }
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}