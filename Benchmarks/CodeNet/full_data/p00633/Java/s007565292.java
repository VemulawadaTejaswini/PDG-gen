import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    final double EPS = 1.0e-5;

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            Circle[] cs = new Circle[n];
            double sum = 0;
            for (int i = 0; i < n; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                double r = sc.nextDouble();
                cs[i] = new Circle(new P(x, y), r);
                sum += 2 * Math.PI * r;
            }
            Set<Integer> inCircle = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    double dis = cs[i].p.sub(cs[j].p).abs();
                    if (cs[i].r + dis < cs[j].r) {
                        inCircle.add(i);
                    } else if (cs[j].r + dis < cs[i].r) {
                        inCircle.add(j);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (inCircle.contains(i) || inCircle.contains(j))
                        continue;
                    if (crsCC(cs[i].p, cs[i].r, cs[j].p, cs[j].r)) {
                        P[] cc = isCC(cs[i].p, cs[i].r, cs[j].p, cs[j].r);
                        if (cc.length == 1)
                            continue;
                        sum -= calcArc(cc[0], cc[1], cs[i]);
                        sum -= calcArc(cc[0], cc[1], cs[j]);
                    }
                }
            }
            Integer[] incs = new Integer[inCircle.size()];
            incs = inCircle.toArray(incs);
            for (int i = 0; i < incs.length; i++) {
                sum -= 2 * Math.PI * cs[i].r;
            }
            System.out.println(sum);
        }
    }

    double calcArc(P cc1, P cc2, Circle circle) {
        P c = circle.p;
        double A = cc1.sub(cc2).abs();
        double B = cc1.sub(c).abs();
        double C = cc2.sub(c).abs();
        double th = Math.acos((B * B + C * C - A * A) / (2 * B * C));
        return circle.r * th;
    }

    // 円と円の交差判定
    boolean crsCC(P c1, double r1, P c2, double r2) {
        double dis = c1.sub(c2).abs();
        return dis < r1 + r2 + EPS && abs(r1 - r2) < dis + EPS;
    }

    // 二円の交点
    P[] isCC(P c1, double r1, P c2, double r2) {
        double x = c1.sub(c2).abs2();
        double y = ((r1 * r1 - r2 * r2) / x + 1) / 2;
        double d = r1 * r1 / x - y * y;
        if (d < -EPS)
            return new P[0];
        if (d < 0)
            d = 0;
        P q1 = c1.add(c2.sub(c1).mul(y));
        P q2 = c2.sub(c1).mul(Math.sqrt(d)).rot90();
        return new P[] { q1.sub(q2), q1.add(q2) };
    }

    public static void main(String[] args) {
        new Main().run();
    }

    double abs(double d) {
        return Math.abs(d);
    }

}

class Circle {
    P p;
    double r;

    Circle(P p, double r) {
        this.p = p;
        this.r = r;
    }

    public String toString() {
        return p + " " + r;
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