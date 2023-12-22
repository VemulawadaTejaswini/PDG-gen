import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble(), y1 = scan.nextDouble(),
                x2 = scan.nextDouble(), y2 = scan.nextDouble();
        double dx = Math.abs(x2 - x1), dy = Math.abs(y2 - y1);
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

        System.out.println(distance);
    }
}