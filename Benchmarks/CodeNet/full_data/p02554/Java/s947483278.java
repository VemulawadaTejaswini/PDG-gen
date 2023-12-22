import java.util.Scanner;

public class Main {
    private static long mod = (long) (1e9 + 7);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ans = power(10, n) - 2 * power(9, n) + power(8, n);
        // if ans is negative
        ans = (ans + mod) % mod;
        System.out.println(ans);
    }


    private static long power(long a, long b) {
        long x = 1, y = a;
        while (b > 0) {
            if (b % 2 != 0) {
                x = (x * y) % mod;
            }
            y = (y * y) % mod;
            b /= 2;
        }
        return x % mod;
    }
}