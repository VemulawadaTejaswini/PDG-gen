import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Point {
    double x;
    double y;

    void print() {
        System.out.printf("%.8f %.8f\n", x, y);
    }
}

public class Main {
    static final double ONE_THIRDS_PI = Math.PI * 60 / 180;
    static final double SIN60 = Math.sin(ONE_THIRDS_PI);
    static final double COS60 = Math.cos(ONE_THIRDS_PI);

    static void koch(int d, Point p1, Point p2) {
        if (d == 0) return;

        Point s = new Point();
        Point u = new Point();
        Point t = new Point();

        s.x = (2 * p1.x + 1 * p2.x) / 3;
        s.y = (2 * p1.y + 1 * p2.y) / 3;
        t.x = (1 * p1.x + 2 * p2.x) / 3;
        t.y = (1 * p1.y + 2 * p2.y) / 3;
        u.x = (t.x - s.x) * COS60 - (t.y - s.y) * SIN60 + s.x;
        u.y = (t.x - s.x) * SIN60 + (t.y - s.y) * COS60 + s.y;

        koch(d - 1, p1, s);
        s.print();
        koch(d - 1, s, u);
        u.print();
        koch(d - 1, u, t);
        t.print();
        koch(d - 1, t, p2);
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());

            Point p1 = new Point();
            Point p2 = new Point();

            p1.x = 0;
            p1.y = 0;
            p2.x = 100;
            p2.y = 0;

            p1.print();
            koch(n, p1, p2);
            p2.print();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

