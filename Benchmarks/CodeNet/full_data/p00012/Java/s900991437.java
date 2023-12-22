import java.util.Scanner;

class Main {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Point[] list = new Point[4];
            for (int i = 0; i < 4; i++) {
                list[i] = new Point(sc.nextDouble(), sc.nextDouble());
            }
            boolean result1 = true;
            boolean result2 = true;
            for (int i = 0; i < 3; i++) {
                double v = crossProduct(sub(list[i], list[(i + 1) % 3]), sub(list[(i + 1) % 3], list[3]));
                result1 &= v < 0.0;
                result2 &= v > 0.0;
            }
            System.out.println(result1 || result2 ? "YES" : "NO");
        }
    }

    static double crossProduct(Point a, Point b) {
        return a.x * b.y - a.y * b.x;
    }

    static Point sub(Point a, Point b) {
        return new Point(b.x - a.x, b.y - a.y);
    }

}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

