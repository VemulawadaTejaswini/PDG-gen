import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            Point2D.Double A = new Point2D.Double(Double.parseDouble(sc.next()), Double.parseDouble(sc.next()));
            Point2D.Double B = new Point2D.Double(Double.parseDouble(sc.next()), Double.parseDouble(sc.next()));
            Point2D.Double C = new Point2D.Double(Double.parseDouble(sc.next()), Double.parseDouble(sc.next()));
            Point2D.Double D = new Point2D.Double(Double.parseDouble(sc.next()), Double.parseDouble(sc.next()));

            System.out.println((((B.getX() - A.getX()) * (D.getY() - C.getY()) - (B.getY() - A.getY()) * (D.getX() - C.getX())) == 0.0)? "YES" : "NO");
        }
    }
}