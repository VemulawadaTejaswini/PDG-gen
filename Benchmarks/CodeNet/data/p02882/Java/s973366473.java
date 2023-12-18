import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();

        if (x >= Math.pow(a, 2) * b) {
            System.out.println(Math.toDegrees(Math.atan((2 * b) / a - (2 * x) / Math.pow(a, 3))));
        } else {
            System.out.println(Math.toDegrees(Math.atan((a * Math.pow(b, 2) / (2 * x)))));
        }
    }
}