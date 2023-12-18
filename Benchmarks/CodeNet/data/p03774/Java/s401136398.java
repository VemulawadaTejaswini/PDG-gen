import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point {
    int x;
    int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        solve(in);
    }

    private static void build(final Scanner in, List<Point> coordinates, int n) {
        int x, y;
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            coordinates.add(new Point(x, y));
        }
    }

    private static void solve(final Scanner in) {
        int n = in.nextInt();
        int m = in.nextInt();
        List<Point> start = new ArrayList<>();
        List<Point> end = new ArrayList<>();
        build(in, start, n);
        build(in, end, m);
        checkPoint(start, end);
    }

    private static void checkPoint(final List<Point> start, final List<Point> end) {
        for (final Point point : start) {
            findMinimum(point, end);
        }
    }

    private static int getDis(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    private static void findMinimum(final Point point, final List<Point> end) {
        int minDis = Integer.MAX_VALUE, currDis, idx = 0;
        for (int i = 0; i < end.size(); i++) {
            Point currPoint = end.get(i);
            currDis = getDis(point, currPoint);
            if (currDis < minDis) {
                minDis = currDis;
                idx = i;
            }
        }
        System.out.println(idx + 1);
    }
}
