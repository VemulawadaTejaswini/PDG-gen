import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double n = sc.nextDouble();
        final double k = sc.nextDouble();

        final double t = n % k;
        System.out.println((long)Math.min(t, k-t));
    }
}
