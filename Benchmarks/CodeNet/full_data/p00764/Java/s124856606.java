import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double INF = Double.MAX_VALUE / 2;
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            Circle[] cs = new Circle[n];
            for (int i = 0; i < n; i++) {
                cs[i] = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
            Point[] ps = new Point[2 * n];
            ps[0] = new Point(cs[0].x, cs[0].y);
            ps[ps.length - 1] = new Point(cs[n - 1].x, cs[n - 1].y);
            int c = 1;
            Line[] ls = new Line[n - 1];
            for (int i = 1; i < n; i++) {
                Point[] cis = cs[i].circleInterSection(cs[i - 1]);
                ps[c++] = cis[0];
                ps[c++] = cis[1];
                ls[i - 1] = new Line(cis[0], cis[1]);
            }
            double[][] cost = new double[2 * n][2 * n];
            for (int i = 0; i < 2 * n; i++) {
                Arrays.fill(cost[i], INF);
            }
            for (int i = 0; i <= 2 * n - 4; i++) {
                for (int j = i + 1; j < 2 * n; j++) {
                    if (j % 2 == 0) {
                        Line l1 = new Line(ps[i], ps[j]);
                        boolean inCircle = true;
                        for (int k = i % 2 == 0 ? i / 2 : i / 2 + 1; k < j / 2 - 1; k++) {
                            Line l2 = ls[k];
                            if (!l2.intersectsLine(l1)) {
                                inCircle = false;
                                break;
                            }
                        }
                        if (inCircle) {
                            cost[i][j] = l1.length();
                        }
                    } else {
                        Line l1 = new Line(ps[i], ps[j]);
                        boolean inCircle = true;
                        for (int k = i % 2 == 0 ? i / 2 : i / 2 + 1; k < j / 2; k++) {
                            Line l2 = ls[k];
                            if (!l2.intersectsLine(l1)) {
                                inCircle = false;
                                break;
                            }
                        }
                        if (inCircle) {
                            cost[i][j] = l1.length();
                        }
                    }
                }
            }
            cost[2 * n - 3][2 * n - 1] = new Line(ps[2 * n - 3], ps[2 * n - 1])
                    .length();
            cost[2 * n - 2][2 * n - 1] = new Line(ps[2 * n - 2], ps[2 * n - 1])
                    .length();
            for (int k = 0; k < 2 * n; k++) {
                for (int i = 0; i < 2 * n; i++) {
                    if (k < i)
                        break;
                    for (int j = i + 1; j < 2 * n; j++) {
                        cost[i][j] = Math.min(cost[i][j], cost[i][k]
                                + cost[k][j]);
                    }
                }
            }
            System.out.printf("%.5f\n", cost[0][2 * n - 1]);
        }
    }
}

@SuppressWarnings("serial")
class Point extends Point2D.Double {
    Point(int x, int y) {
        super(x, y);
    }

    Point(double x, double y) {
        super(x, y);
    }
}

@SuppressWarnings("serial")
class Line extends Line2D.Double {

    Line(Point p1, Point p2) {
        super(p1, p2);
    }

    public double length() {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public double ip(Line l) {
        Point q1 = new Point(l.x1, l.y1);
        Point q2 = new Point(l.x2, l.y2);
        return (x2 - x1) * (q2.x - q1.x) + (y2 - y1) * (q2.y - q1.y);
    }

    public double ep(Line l) {
        Point q1 = new Point(l.x1, l.y1);
        Point q2 = new Point(l.x2, l.y2);
        return (x2 - x1) * (q2.y - q1.y) - (y2 - y1) * (q2.x - q1.x);
    }
}

class Circle {
    int x;
    int y;
    int r;

    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Point[] circleInterSection(Circle c2) {
        Circle c1 = this;
        double a = c1.x;
        double b = c1.y;
        double r = c1.r;
        double c = c2.x;
        double d = c2.y;
        double s = c2.r;
        double norm = (c - a) * (c - a) + (d - b) * (d - b);
        double t = 0.5 * (norm + r * r - s * s) / Math.sqrt(norm);
        double th = Math.acos(t / r);
        double th0 = Math.atan2((d - b), (c - a));
        double p1 = a + r * Math.cos(th + th0);
        double q1 = b + r * Math.sin(th + th0);
        double p2 = a + r * Math.cos(-th + th0);
        double q2 = b + r * Math.sin(-th + th0);
        Point[] ps = { new Point(p1, q1), new Point(p2, q2) };
        return ps;
    }
    public String toString() {
        return "x,y,r " + x + " " + y + " " + r + " ";
    }
}