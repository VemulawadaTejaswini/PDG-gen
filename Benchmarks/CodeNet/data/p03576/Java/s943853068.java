import java.util.*;

public class Main {
    private class Point {
        long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    private class Square {
        long xl, xr, yd, yu;

        public Square(Point p1, Point p2, Point p3, Point p4) {
            xl = Math.min(Math.min(Math.min(p1.x, p2.x), p3.x), p4.x);
            xr = Math.max(Math.max(Math.max(p1.x, p2.x), p3.x), p4.x);
            yd = Math.min(Math.min(Math.min(p1.y, p2.y), p3.y), p4.y);
            yu = Math.max(Math.max(Math.max(p1.y, p2.y), p3.y), p4.y);
        }

        public boolean isCheck(Point p) {
            return xl <= p.x && p.x <= xr && yd <= p.y && p.y <= yu;
        }

        public long getSize() {
            return (xr - xl) * (yu - yd);
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int cntk = sc.nextInt();
        Point p[] = new Point[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Point(sc.nextLong(), sc.nextLong());
        }

        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = j; k < n; k++) {
                    for (int l = k; l < n; l++) {
                        Square sq = new Square(p[i], p[j], p[k], p[l]);
                        int cnt = 0;
                        for (int m = 0; m < n; m++) {
                            if (sq.isCheck(p[m])) {
                                cnt++;
                            }
                        }
                        if (cnt >= cntk) {
                            ans = Math.min(ans, sq.getSize());
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
