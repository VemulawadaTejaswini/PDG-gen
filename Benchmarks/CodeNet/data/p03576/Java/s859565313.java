
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n, k;
    long[] xs, ys;
    Point[] ps;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        xs = new long[n];
        ys = new long[n];
        ps = new Point[n];
        for (int i = 0; i < n; i++){
            xs[i] = sc.nextLong();
            ys[i] = sc.nextLong();
            ps[i] = new Point(xs[i], ys[i]);
        }
    }

    private void solve() {
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            final long x = xs[i];
            final long y = ys[i];
            final Point trg = new Point(x, y);
            Point[] tmp = Arrays.stream(ps).sorted((p1, p2) ->
                    Long.compare(dist(trg, p1), dist(trg, p2))).toArray(Point[]::new);
            long minX = x, maxX = x, minY = y, maxY = y;
            for (int j = 1; j < k; j++) {
                minX = Math.min(tmp[j].x, minX);
                maxX = Math.max(tmp[j].x, maxX);
                minY = Math.min(tmp[j].y, minY);
                maxY = Math.max(tmp[j].y, maxY);
            }
            long area = Math.abs(minX - maxX) * Math.abs(minY - maxY);
            ans = Math.min(area, ans);
        }
        System.out.println(ans);
    }

    private class Point {
        long x, y;
        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    private long dist(Point p1, Point p2) {
        long x = Math.abs(p1.x - p2.x);
        long y = Math.abs(p1.y - p2.y);
        return x + y;
    }
}
