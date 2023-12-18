import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double theta;
        if (x < (a * a * b / 2)) {
            theta = Math.atan((a * b * b) / (2 * x));
        } else {
            theta = Math.atan(2 * (b / a - x / (a * a * a)));
        }
        System.out.println(theta * 360 / (2 * Math.PI));
    }

}
