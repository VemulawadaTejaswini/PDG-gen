import java.util.Scanner;

public class Main {
    final double EPS = 1.0e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            P[] ps = new P[n];
            for (int i = 0; i < n; i++) {
                ps[i] = new P(sc.nextDouble(), sc.nextDouble());
            }
            int ans = 1;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (ps[i].sub(ps[j]).abs() > 2)
                        continue;
                    P[] cs = makeCircle(ps[i], ps[j], 1.0);
                    for (int l = 0; l < 2; l++) {
                        double cx = cs[l].x;
                        double cy = cs[l].y;
                        int c = 2;
                        for (int k = 0; k < n; k++) {
                            if (k == i || k == j)
                                continue;
                            if ((ps[k].x - cx) * (ps[k].x - cx)
                                    + (ps[k].y - cy) * (ps[k].y - cy) <= 1.0 + EPS) {
                                c++;
                            }
                        }
                        ans = Math.max(c, ans);
                    }
                }
            }
            System.out.println(ans);
        }

    }

    P[] makeCircle(P a, P b, double r) {
        double th = Math.atan(-(b.x - a.x) / (b.y - a.y));
        P m = a.add(b).mul(0.5);
        double dis = Math.sqrt(r * r - b.sub(m).abs2());
        return new P[] {
                new P(m.x - dis * Math.cos(th), m.y - dis * Math.sin(th)),
                new P(m.x + dis * Math.cos(th), m.y + dis * Math.sin(th)) };
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

class P {
    double x;
    double y;

    P(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + " , " + y + ")";
    }

    public P add(P p) {
        return new P(p.x + x, p.y + y);
    }

    public P sub(P p) {
        return new P(x - p.x, y - p.y);
    }

    public P mul(double k) {
        return new P(k * x, k * y);
    }

    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    public double abs2() {
        return x * x + y * y;
    }

    public double det(P p) {
        return x * p.y - y * p.x;
    }

    public P rot90() {
        return new P(-y, x);
    }
}