import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double x = sc.nextInt();

        double tanq = -1;
        if (x / a > a * b / 2.0) {
            tanq = 2.0 * b / a - 2.0 * x / a / a / a;
            // System.out.println(1);
        } else {
            tanq = a * b * b / 2.0 / x;
            // System.out.println(3);
        }

        double q = Math.atan(tanq) * 180.0 / Math.PI;
        System.out.println(q);

        sc.close();
    }

}
