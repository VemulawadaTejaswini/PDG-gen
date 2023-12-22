import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double h = sc.nextInt();
        double m = sc.nextInt();

        double theta1 = (h / 12.0  + m / 60.0 / 12.0) * Math.PI * 2;
        double theta2 = m / 60.0 * Math.PI * 2;

        double ret = a * a + b * b - 2 * a * b * Math.cos(theta1 - theta2);
        ret = Math.sqrt(ret);

        System.out.printf("%.12f\n", ret);

    }
}