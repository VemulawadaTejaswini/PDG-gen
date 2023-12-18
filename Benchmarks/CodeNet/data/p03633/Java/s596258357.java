import java.util.Scanner;

public class Main {

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] t = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextLong();
        }

        long result = 1L;
        for (int i = 0; i < n; i++) {
            result = lcm(result, t[i]);
        }
        System.out.println(result);
    }

}
