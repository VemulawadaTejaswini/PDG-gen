import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        System.out.println(0.0 + " " + 0.0);

        koch(0.0, 0.0, 100.0, 0.0, 0, n);

        System.out.println(100.0 + " " + 0.0);

    }



   

    static void koch(double ax, double ay, double bx, double by, int call, int n) {

        double x1 = ax + (bx - ax) / 3.0;

        double y1 = ay + (by - ay) / 3.0;

        double x3 = ax + (bx - ax) / 3.0 * 2;

        double y3 = ay + (by - ay) / 3.0 * 2;

        double x2 = Math.cos(Math.PI / 3) * (bx - ax) / 3 - Math.sin(Math.PI / 3) * (by - ay) / 3 + x1;

        double y2 = Math.sin(Math.PI / 3) * (bx - ax) / 3 + Math.cos(Math.PI / 3) * (by - ay) / 3 + y1;

        if (call < n) {

            koch(ax, ay, x1, y1, call + 1, n);

            System.out.println(x1 + " " + y1);

            koch(x1, y1, x2, y2, call + 1, n);

            System.out.println(x2 + " " + y2);

            koch(x2, y2, x3, y3, call + 1, n);

            System.out.println(x3 + " " + y3);

            koch(x3, y3, bx, by, call + 1, n);

        }

    }

}








