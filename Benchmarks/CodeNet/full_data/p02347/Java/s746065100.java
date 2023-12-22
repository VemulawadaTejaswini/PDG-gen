import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Point[] pts = new Point[n];
        for (int i = 0; i < n; i++) {
            pts[i] = new Point(i, in.nextInt(), in.nextInt());
        }
        int q = in.nextInt();
        Rect[] rects = new Rect[q];
        for (int i = 0; i < q; i++) {
            rects[i] = new Rect(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        }

        Arrays.sort(pts, Point.comparatorX);
        for (int i = 0; i < q; i++) {
            int sx = rects[i].sx;
            int sy = rects[i].sy;
            int tx = rects[i].tx;
            int ty = rects[i].ty;

            int il = MySearch.lower_bound(pts, new Point(-1, sx, 0), Point.comparatorX);
            int ir = MySearch.upper_bound(pts, new Point(-1, tx, 0), Point.comparatorX) ;
            Point[] inRangePts = Arrays.copyOfRange(pts, il, ir);

            Arrays.sort(inRangePts, Point.comparatorY);

            il = MySearch.lower_bound(inRangePts, new Point(-1, 0, sy), Point.comparatorY);
            ir = MySearch.upper_bound(inRangePts, new Point(-1, 0, ty), Point.comparatorY);

            Arrays.sort(inRangePts, il, ir, Point.comparatorI);
            for (int j = il; j < ir; j++) {
                inRangePts[j].print();
            }
            System.out.println();
        }

    }
}

class Point{
    final int i, x, y;
    static Comparator<Point> comparatorX = (t0, t1) -> {
        if(t0.x > t1.x) return 1;
        if(t0.x < t1.x) return -1;
        return 0;
    };
    static Comparator<Point> comparatorY = (t0, t1) -> {
        if(t0.y > t1.y) return 1;
        if(t0.y < t1.y) return -1;
        return 0;
    };
    static Comparator<Point> comparatorI = (t0, t1) -> {
        if(t0.i > t1.i) return 1;
        if(t0.i < t1.i) return -1;
        return 0;
    };

    Point(int i, int x, int y) {
        this.i = i;
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(i);
    }

}

class Rect{
    final int sx, sy, tx, ty;

    Rect(int sx, int tx, int sy, int ty) {
        this.sx = sx;
        this.tx = tx;
        this.sy = sy;
        this.ty = ty;
    }
}

class MySearch{
    static<T> int lower_bound(T[] a, T key, Comparator<T> c) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if(c.compare(key, a[m]) <= 0) r = m;
            else l = m + 1;
        }
        return l;
    }

    static<T> int upper_bound(T[] a, T key, Comparator<T> c) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if(c.compare(key, a[m]) >= 0) l = m + 1;
            else r = m;
        }
        return l;
    }
}
