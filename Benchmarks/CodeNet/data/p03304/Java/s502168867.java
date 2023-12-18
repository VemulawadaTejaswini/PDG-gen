import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final int d = sc.nextInt();
        final double single = (d == 0 ? 1. : 2.) * Math.max(n - d, 0) / n / n;
        System.out.printf("%.8f\n", single * (m - 1));
    }
}
public class Main {
    public static void main(String...args) {
        C.main();
    }
}
