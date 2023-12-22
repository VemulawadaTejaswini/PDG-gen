import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int m = scan.nextInt();
        double da = h * 30 - m * 0.5;
        double d = Math.min(360 - da, da);
        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(d)));
        System.out.println(c);
        scan.close();
    }
}