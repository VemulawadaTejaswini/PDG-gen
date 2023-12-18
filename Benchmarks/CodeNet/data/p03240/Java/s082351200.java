import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        Point[] ps = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int h = sc.nextInt();
            if (h == 100) {
                System.out.printf("%d %d %d%n", x, y, h);
                return;
            }
            ps[i] = new Point(x, y, h);
        }

        Arrays.sort(ps, (x, y) -> y.h - x.h);

        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                if (n >= 3) {
                    int h1 = ps[0].h + Math.abs(ps[0].x - x) + Math.abs(ps[0].y - y);
                    int h2 = ps[1].h + Math.abs(ps[1].x - x) + Math.abs(ps[1].y - y);
                    int h3 = ps[2].h + Math.abs(ps[2].x - x) + Math.abs(ps[2].y - y);

                    if (h1 == h2 && h2 == h3) {
                        System.out.printf("%d %d %d%n", x, y, h1);
                        return;
                    }
                }
            }
        }
    }
}

class Point {
    int x;
    int y;
    int h;

    Point(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }
}