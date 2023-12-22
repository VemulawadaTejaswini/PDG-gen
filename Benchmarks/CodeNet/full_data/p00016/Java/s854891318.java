
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point2D point = new Point2D.Double(0, 0);
        double D = 0.0;

        while (true) {
            String S = sc.next();

            int d = Integer.parseInt(S.split(",")[0]);
            int r = Integer.parseInt(S.split(",")[1]);

            if (d == 0 && r == 0) break;

            point.setLocation(point.getX() +(double)d * Math.sin(D * (Math.PI / 180)), point.getY() + (double)d * Math.cos(D * Math.PI / 180));
            D += (double)r;
        }

        System.out.println((int) point.getX());
        System.out.println((int) point.getY());
    }
}