import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextInt();
        long div = m / n;
        if (m % n == 0) System.out.println(div);
        else System.out.println(gcd(div, div + (m % n)));
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
