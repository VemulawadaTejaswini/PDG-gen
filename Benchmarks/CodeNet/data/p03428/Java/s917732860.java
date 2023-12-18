import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;


    class Point {
        long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    int vectMul(Point a, Point b, Point c) {
        return Long.signum((b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x));
    }


    void solve() {
        int n = in.nextInt();
        Point[] a = new Point[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Point(in.nextInt(), in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            int leftMost = -1, rightMost = -1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                boolean left = true, right = true;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    int v = vectMul(a[i], a[j], a[k]);
                    if (v < 0) {
                        left = false;
                    }
                    if (v > 0) {
                        right = false;
                    }
                }
                if (left) {
                    leftMost = j;
                }
                if (right) {
                    rightMost = j;
                }
            }
            double ans = 0;
            if (leftMost != -1 && rightMost != -1) {
                double aL = Math.atan2(a[leftMost].y - a[i].y, a[leftMost].x - a[i].x) - Math.PI / 2;
                double aR = Math.atan2(a[rightMost].y - a[i].y, a[rightMost].x - a[i].x) + Math.PI / 2;
                double diff = aL - aR;
                while (diff < 0) {
                    diff += Math.PI * 2;
                }
                while (diff > Math.PI * 2) {
                    diff -= Math.PI * 2;
                }
                ans = diff / (Math.PI * 2);
            }
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j) {
                            if (inside(a[i].x, a[j].x, a[k].x) && inside(a[i].y, a[j].y, a[k].y) && vectMul(a[i], a[j], a[k]) == 0) {
                                ans = 0;
                            }
                        }
                    }
                }
            }
            out.printf(Locale.US, "%.17f\n", ans);
        }
    }

    boolean inside(long x, long x1, long x2) {
        return Math.min(x1, x2) <= x && Math.max(x1, x2) >= x;
    }


    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}