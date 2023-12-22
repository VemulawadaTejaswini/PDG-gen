import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        class Point {
            double x, y;
            public Point(double inX, double inY) {
                x = inX;
                y = inY;
            }
            public double getDistance(Point p2) {
                double dst;
                dst = Math.pow(this.x - p2.x, 2.0) + Math.pow(this.y - p2.y, 2.0);
                dst = Math.sqrt(dst);
                return dst;
            }
        }
        Point p1 = new Point(Double.parseDouble(scan.next()), Double.parseDouble(scan.next()));
        Point p2 = new Point(Double.parseDouble(scan.next()), Double.parseDouble(scan.next()));

        System.out.println(p1.getDistance(p2));
    }
}

