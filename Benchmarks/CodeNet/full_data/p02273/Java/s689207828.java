import java.util.*;
import java.awt.geom.Point2D.Double;

public class Main {
        static void koch(int n, Double a, Double b) {
            if (n == 0) return;

            Double s = new Double();
            Double t = new Double();
            Double u = new Double();
            double th = Math.PI * 60.0 / 180.0;

            s.setLocation((2.0 * a.getX() + 1.0 * b.getX()) / 3.0,
                        (2.0 * a.getY() + 1.0 * b.getY()) / 3.0);
            t.setLocation((1.0 * a.getX() + 2.0 * b.getX()) / 3.0,
                        (1.0 * a.getY() + 2.0 * b.getY()) / 3.0);
            u.setLocation((t.getX() - s.getX()) * Math.cos(th) - (t.getY() - s.getY()) * Math.sin(th) + s.getX(),
                (t.getX() - s.getX()) * Math.sin(th) + (t.getY() - s.getY()) * Math.cos(th) + s.getY());

            koch(n - 1, a, s);
            System.out.println(String.format("%.8f %.8f", s.getX(), s.getY()));
            koch(n - 1, s, u);
            System.out.println(String.format("%.8f %.8f", u.getX(), u.getY()));
            koch(n - 1, u, t);
            System.out.println(String.format("%.8f %.8f", t.getX(), t.getY()));
            koch(n - 1, t, b);
        }

    public static void main(String[] args) throws Exception {
            Double a = new Double(0, 0);
            Double b = new Double(100, 0);
            int n;

            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.next());
            sc.close();

            System.out.println(String.format("%.8f %.8f", a.getX(), a.getY()));
            koch(n, a, b);
            System.out.println(String.format("%.8f %.8f", b.getX(), b.getY()));
    }
}

