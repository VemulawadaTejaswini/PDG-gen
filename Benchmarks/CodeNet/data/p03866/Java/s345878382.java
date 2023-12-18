import java.util.*;

public class Main {
    class Circle {
        int x, y, r;
        boolean visit;

        public Circle(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
            visit = false;
        }
    }

    public void main(Scanner sc) {
        Circle s = new Circle(sc.nextInt(), sc.nextInt(), 0);
        Circle t = new Circle(sc.nextInt(), sc.nextInt(), 0);
        int n = sc.nextInt();
        Circle c[] = new Circle[n];
        for (int i = 0; i < n; i++) {
            c[i] = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        double ans = 0;
        while (!(s.x == t.x && s.y == t.y)) {
            Circle next = new Circle(t.x, t.y, t.r);
            double minLen = getLength(s, t);
            int minIndex = -1;
            for (int i = 0; i < n; i++) {
                if (c[i].visit) {
                    continue;
                }

                double tmp = getLength(s, c[i]);
                if (minLen > tmp) {
                    next = new Circle(c[i].x, c[i].y, c[i].r);
                    minLen = tmp;
                    minIndex = i;
                }
            }

            if (minIndex != -1) {
                c[minIndex].visit = true;
            }
            ans += Math.max(minLen, 0);
            s = next;
        }

        System.out.println(ans);
    }

    private double getLength(Circle p1, Circle p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)) - p1.r - p2.r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
