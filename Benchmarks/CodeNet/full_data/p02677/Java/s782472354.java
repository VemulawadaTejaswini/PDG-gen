import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        double hangle = (h * 30) + (m * 0.5);
        double manble = m * 6;
        double angle = Math.abs(hangle - manble);
        if (angle > 180) {
            angle = 360 - angle;
        }

        double length = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(Math.toRadians(angle))));
        System.out.println(length);
    }
}