import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer h = scanner.nextInt();
        Integer m = scanner.nextInt();

        double result;

        double angle = h*360/12 - m*360/60;

        System.out.println(angle);

        System.out.println(2*a*b*Math.cos(Math.toRadians(angle)));

        if (angle >= 180) {
            result = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2*a*b*Math.cos(Math.toRadians(angle-180)));
        } else {
            result = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2*a*b*Math.cos(Math.toRadians(angle)));
        }

        System.out.println(result);
    }
}
