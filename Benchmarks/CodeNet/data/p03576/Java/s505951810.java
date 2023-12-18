import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static final void main(String[] args) {
        Main m = new Main();
        m.init();
        m.solve();
    }

    // ========================================================================= //
    int n, m;
    long[] xs, ys;
    P[] ps;

    public void init() {
        n = sc.nextInt();
        m = sc.nextInt();
        xs = new long[n];
        ys = new long[n];
        ps = new P[n];
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            xs[i] = x;
            ys[i] = y;
            ps[i] = new P(x, y);
        }
        Arrays.sort(xs);
        Arrays.sort(ys);
    }

    public void solve() {
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            long sx = xs[i];
            for (int j = i + 1; j < n; j++) {
                long ex = xs[j];
                for (int k = 0; k < n - 1; k++) {
                    long sy = ys[k];
                    for (int l = k + 1; l < n; l++) {
                        long ey = ys[l];

                        int pnum = 0;
                        for (P p : ps) if (p.x >= sx && p.x <= ex && p.y >= sy && p.y <= ey) pnum++;
                        if (pnum == m) {
                            ans = Math.min(ans, (ex - sx) * (ey - sy));
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    class P {
        long x, y;
        P(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}
