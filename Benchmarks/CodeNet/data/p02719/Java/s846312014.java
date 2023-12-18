import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double n = sc.nextDouble();
        final double k = sc.nextDouble();

        System.out.println((long)(n < k ? n : Math.abs(n - k*Math.ceil(n / k))));
    }
}
