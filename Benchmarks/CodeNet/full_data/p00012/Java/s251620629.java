import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double x1 = Double.parseDouble(sc.next());
            double y1 = Double.parseDouble(sc.next());
            double x2 = Double.parseDouble(sc.next());
            double y2 = Double.parseDouble(sc.next());
            double x3 = Double.parseDouble(sc.next());
            double y3 = Double.parseDouble(sc.next());

            double px = Double.parseDouble(sc.next());
            double py = Double.parseDouble(sc.next());


            double S = calcS(x1, y1, x2, y2, x3, y3);

            double s1 = calcS(px, py, x1, y1, x2, y2);
            double s2 = calcS(px, py, x1, y1, x3, y3);
            double s3 = calcS(px, py, x2, y2, x3, y3);

            System.out.println((S>= s1 + s2 + s3)? "YES" : "NO");
        }
    }

    private static double calcS(double x1, double y1, double x2, double y2 ,double x3, double y3) {
        double mx = x2 - x1;
        double my = y2 - y1;
        double nx = x3 - x1;
        double ny = y3 - y1;

        return Math.abs(mx * ny - my * nx) / 2.0;
    }
}