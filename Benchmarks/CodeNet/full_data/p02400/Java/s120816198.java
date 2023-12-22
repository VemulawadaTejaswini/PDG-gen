import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double a = (r * 2) * Math.PI;
        double b = r * r * Math.PI;
        System.out.println(String.format("%.6f %.6f", a, b));
    }
}