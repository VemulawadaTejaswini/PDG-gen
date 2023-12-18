
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;

public class Main {

    static class Point {
        @Override
        public String toString() {
            return "Point{" +
                   "x=" + x +
                   ", y=" + y +
                   '}';
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
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

    static Map<Integer, List<Point>> xSet = new HashMap<>();
    static Map<Integer, List<Point>> ySet = new HashMap<>();

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
        for (int i = 0; i < n; i++) {
            Point point = new Point(xs[i] + ys[i], ys[i] - xs[i]);
            xSet.computeIfAbsent(point.x, integer -> {
                return new ArrayList<>();
            }).add(point);
            ySet.computeIfAbsent(point.y, integer -> {
                return new ArrayList<>();
            }).add(point);
        }

        xSet.values().forEach(new Consumer<List<Point>>() {
            @Override
            public void accept(List<Point> points) {
                points.sort(Comparator.comparingInt(p -> p.y));
            }
        });
        ySet.values().forEach(new Consumer<List<Point>>() {
            @Override
            public void accept(List<Point> points) {
                points.sort(Comparator.comparingInt(p -> p.x));
            }
        });

        Set<Point> added = new HashSet<>();
        System.out.println(dfs(added, new Point(xs[a] + ys[a], ys[a] - xs[a]), d) / 2);
    }

    static long dfs(Set<Point> added, Point p, int d) {
        if (added.contains(p)) {
            return 0;
        }
//        System.out.println(p);  // TODO
        added.add(p);
        int ret = 0;

        List<Point> uSet = ySet.get(p.y + d);
        if (uSet != null) {
            int u2 = Collections.binarySearch(uSet, new Point(p.x + d, p.y + d),
                                              Comparator.comparingInt(Point::getX));
            int u1 = Collections.binarySearch(uSet, new Point(p.x - d, p.y + d),
                                              Comparator.comparingInt(Point::getX));
            int ret1 = getRet(u2, u1);
            ret += ret1;
            u2 = u2 >= 0 ? u2 + 1 : -(u2 + 1);
            u1 = u1 >= 0 ? u1 : -(u1 + 1);
//            System.out.println(p + ">>>>>>>u1:" + u1 + ", u2:" + u2);
            for (int i = u1; i < u2 && i < uSet.size(); ++i) {
                ret += dfs(added, uSet.get(i), d);
            }
        }

        List<Point> dSet = ySet.get(p.y - d);
        if (dSet != null) {
            int d2 = Collections.binarySearch(dSet, new Point(p.x + d, p.y - d),
                                              Comparator.comparingInt(Point::getX));
            int d1 = Collections.binarySearch(dSet, new Point(p.x - d, p.y - d),
                                              Comparator.comparingInt(Point::getX));
            int ret1 = getRet(d2, d1);
            ret += ret1;

            d2 = d2 >= 0 ? d2 + 1 : -(d2 + 1);
            d1 = d1 >= 0 ? d1 : -(d1 + 1);
//            System.out.println(p + ">>>>>>>d1:" + d1 + ", d2:" + d2);
            for (int i = d1; i < d2 && i < dSet.size(); ++i) {
                ret += dfs(added, dSet.get(i), d);
            }
        }

        List<Point> rSet = xSet.get(p.x + d);
        if (rSet != null) {
            int r2 = Collections.binarySearch(rSet, new Point(p.x + d, p.y + d - 1),
                                              Comparator.comparingInt(Point::getY));
            int r1 = Collections.binarySearch(rSet, new Point(p.x + d, p.y - d + 1),
                                              Comparator.comparingInt(Point::getY));
            int ret1 = getRet(r2, r1);
            ret += ret1;

            r2 = r2 >= 0 ? r2 + 1 : -(r2 + 1);
            r1 = r1 >= 0 ? r1 : -(r1 + 1);
//            System.out.println(p + ">>>>>>>r1:" + r1 + ", r2:" + r2 + "<>" + rSet);
            for (int i = r1; i < r2 && i < rSet.size(); ++i) {
                ret += dfs(added, rSet.get(i), d);
            }
        }

        List<Point> lSet = xSet.get(p.x - d);
        if (lSet != null) {
            int l2 = Collections.binarySearch(lSet, new Point(p.x - d, p.y + d - 1),
                                              Comparator.comparingInt(Point::getY));
            int l1 = Collections.binarySearch(lSet, new Point(p.x - d, p.y - d + 1),
                                              Comparator.comparingInt(Point::getY));
            int ret1 = getRet(l2, l1);
            ret += ret1;

            l2 = l2 >= 0 ? l2 + 1 : -(l2 + 1);
            l1 = l1 >= 0 ? l1 : -(l1 + 1);
//            System.out.println(p + ">>>>>>>l1:" + l1 + ", l2:" + l2);
            for (int i = l1; i < l2 && i < lSet.size(); ++i) {
                ret += dfs(added, lSet.get(i), d);
            }
        }
        return ret;
    }

    private static int getRet(int d2, int d1) {
        int ret = 0;
        if (d2 >= 0 & d1 >= 0) {
            ret += d2 - d1 + 1;
        }
        if (d2 >= 0 & d1 < 0) {
            ret += d2 + d1 + 1 + 1;
        }
        if (d2 < 0 & d1 >= 0) {
            ret += -(d2 + 1) - d1;
        }
        if (d2 < 0 & d1 < 0) {
            ret += -(d2 + 1) + d1 + 1;
        }
        return ret;
    }
}
