import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextDouble()) {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                double f = scanner.nextDouble();
                double y = (a * f - d * c) / (a * e - b * d);
                double x = (c - b * y) / a;
                System.out.printf("%.3f %.3f\n", x, y);
            }
        }
    }
}