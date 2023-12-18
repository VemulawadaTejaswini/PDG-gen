import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Point[] r = new Point[N];
        for (int i = 0; i < N; i++) {
            Point p = new Point();
            p.x = scan.nextInt();
            p.y = scan.nextInt();
            r[i] = p;
        }
        Point[] b = new Point[N];
        for (int i = 0; i < N; i++) {
            Point p = new Point();
            p.x = scan.nextInt();
            p.y = scan.nextInt();
            b[i] = p;
        }
        Arrays.sort(r, new PointComparator());
        Arrays.sort(b, new PointComparator());
        PointComparator c = new PointComparator();
        int answer = 0;
        boolean[] d_r = new boolean[N];
        Arrays.fill(d_r, false);
        int r_l = -1;
        for (int i = 0; i < N; i++) {
            Point p2 = b[i];
            boolean found = false;
            int y = -1;
            for (int j = 0; j < N; j++) {
                if (d_r[j]){
                    continue;
                }
                Point p1 = r[j];
                if (c.compare(p1, p2) < 0 && y < p1.y) {
                    found = true;
                    y = p1.y;
                    r_l = j;
                }
            }
            if (found) {
                d_r[r_l] = true;
                answer += 1;
            }
        }
        System.out.println(answer);
    }
    class Point {
        int x;
        int y;
    }
    class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            if (o1.x == o2.x) {
                return Integer.compare(o1.y, o2.y);
            }
            return Integer.compare(o1.x, o2.x);
        }
    }
}
