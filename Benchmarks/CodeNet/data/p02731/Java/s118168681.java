import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double L = sc.nextDouble();

        System.out.printf("%12f\n", L / 3.0 * L / 3.0 * L / 3.0);
    }
}
