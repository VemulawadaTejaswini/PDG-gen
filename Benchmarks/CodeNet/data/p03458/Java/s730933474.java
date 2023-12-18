import java.util.*;

public class Main {
    private class Point {
        int x, y;
        boolean isBlack;

        public Point(int x, int y, String s) {
            this.x = x;
            this.y = y;
            this.isBlack = s.equals("B");
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        Point p[] = new Point[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Point(sc.nextInt(), sc.nextInt(), sc.next());
        }

        int ans = 0;
        for (int dx = 0; dx < 2 * k; dx++) {
            for (int dy = 0; dy < k; dy++) {
                int res = 0;
                for (int i = 0; i < n; i++) {
                    if (isBlack(p[i].x + dx, p[i].y + dy, k) == p[i].isBlack) {
                        res++;
                    }
                }
                ans = Math.max(ans, res);
            }
        }
        System.out.println(ans);
    }

    private boolean isBlack(int x, int y, int k) {
        return (x % (2 * k) < k) == (y % (2 * k) < k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
