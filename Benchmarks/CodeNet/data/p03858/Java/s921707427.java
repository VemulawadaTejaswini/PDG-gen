
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static class Point {
        @Override
        public String toString() {
            return "Point{" +
                   "x=" + x +
                   ", y=" + y +
                   '}';
        }

        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) { return true; }
            if (o == null || getClass() != o.getClass()) { return false; }

            Point point = (Point) o;

            if (x != point.x) { return false; }
            return y == point.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt() - 1;
        int b = scanner.nextInt() - 1;
        int[] xs = new int[n];
        int[] ys = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = scanner.nextInt();
            ys[i] = scanner.nextInt();
        }
        int d = Math.abs(xs[a] - xs[b]) + Math.abs(ys[a] - ys[b]);
        Set<Point> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(new Point(xs[i] + ys[i], ys[i] - xs[i]));
        }
        Set<Point> added = new HashSet<>();
        System.out.println(dfs(added, set, new Point(xs[a] + ys[a], ys[a] - xs[a]), d)/2);
    }

    static long dfs(Set<Point> added, Set<Point> set, Point p, int d) {
        if (added.contains(p)) {
            return 0;
        }
        added.add(p);
        int ret = 0;
        {
            int y = p.y + d;
            for (int i = p.x + d; i >= p.x - d; i--) {
                Point o = new Point(i, y);
                if (set.contains(o)) {
                    ret++;
                    ret += dfs(added, set, o, d);
                }
            }
        }
        {
            int y = p.y - d;
            for (int i = p.x + d; i >= p.x - d; i--) {
                Point o = new Point(i, y);
                if (set.contains(o)) {
                    ret++;
                    ret += dfs(added, set, o, d);
                }
            }
        }
        {
            int x = p.x + d;
            for (int i = p.y + d - 1; i > p.y - d; i--) {
                Point o = new Point(x, i);
                if (set.contains(o)) {
                    ret++;
                    ret += dfs(added, set, o, d);
                }
            }
        }
        {
            int x = p.x - d;
            for (int i = p.y + d - 1; i > p.y - d; i--) {
                Point o = new Point(x, i);
                if (set.contains(o)) {
                    ret++;
                    ret += dfs(added, set, o, d);
                }
            }
        }

        return ret;
    }
}
