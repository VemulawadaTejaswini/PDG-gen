import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double a = sc.nextDouble();
        final double b = sc.nextDouble();
        final double n = sc.nextDouble();

        double ans = Double.MIN_VALUE;
        for (int x = 0; x <= n; x++) {
            ans = Math.max(ans, Math.floor(a*x/b) - a * Math.floor(x/b));
        }

        System.out.println((long)ans);
    }
}
