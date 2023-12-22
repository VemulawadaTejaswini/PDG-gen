
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        double c = x - a;
        double z = y - b;
        double d = (c * c) + (z * z);
        double p = Math.sqrt(d);
        System.out.printf("%.8f\n", p);

    }
}

