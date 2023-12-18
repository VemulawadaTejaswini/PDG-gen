import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final long A = sc.nextLong();
        final long B = sc.nextLong();
        final long C = sc.nextLong();
        final long D = sc.nextLong();
        System.out.println(B - (A-1) - (B / C - (A-1) / C) - (B / D - (A-1) / D) + (B / lcm(C, D)));
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
