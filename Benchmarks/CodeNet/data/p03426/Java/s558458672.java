import java.util.Scanner;

public class Main {
    private static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        Point a[] = new Point[h * w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[sc.nextInt() - 1] = new Point(j, i);
            }
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = 0;
            for (; l < r; l += d) {
                ans += calc(a[l - 1], a[l + d - 1]);
            }
            System.out.println(ans);
        }
    }

    private int calc(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
