import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Triangle t = new Triangle(x1, x2, y1, y2, x3, y3);
            System.out.printf("%.3f %.3f %.3f\n", t.getCenterX(), t.getCenterY(),
                    t.getR());
            n--;
        }

    }
}

class Triangle {
    Point2D.Double A;
    Point2D.Double B;
    Point2D.Double C;
    double a;
    double b;
    double c;
    double ang_a;
    double ang_b;
    double ang_c;
    double s2a;
    double s2b;
    double s2c;

    Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
        A = new Point2D.Double(ax, ay);
        B = new Point2D.Double(bx, by);
        C = new Point2D.Double(cx, cy);

        c = Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
        a = Math.sqrt(Math.pow(cx - bx, 2) + Math.pow(cy - by, 2));
        b = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));

        ang_a = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        ang_b = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        ang_c = Math.acos((b * b + a * a - c * c) / (2 * b * a));

        s2a = Math.sin(2 * ang_a);
        s2b = Math.sin(2 * ang_b);
        s2c = Math.sin(2 * ang_c);
    }

    double getCenterX() {
        double x = (A.x * s2a + B.x * s2b + C.x * s2c) / (s2a + s2b + s2c);
        return x;
    }

    double getCenterY() {
        double y = (A.y * s2a + B.y * s2b + C.y * s2c) / (s2a + s2b + s2c);
        return y;
    }

    double getR() {
        double r = a/Math.sin(ang_a)/2;
        return r;
    }
}