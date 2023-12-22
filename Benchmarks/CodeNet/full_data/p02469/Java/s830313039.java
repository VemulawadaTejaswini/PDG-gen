import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int n = in.nextInt();
        long lcm = in.nextLong();
        while (n-- > 1) {
            long a = in.nextLong();
            long gcd = gcd(lcm, a);
            lcm = lcm / gcd * a;
        }
        System.out.println(lcm);
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}