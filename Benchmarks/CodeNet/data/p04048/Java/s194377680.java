import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long n = stdin.nextLong();
        long x = stdin.nextLong();
        long ans = 3 * (n - gcd(x, n));
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        long mod;
        while ((mod = b % a) > 0) {
            a = mod;
            b = a;
        }
        return a;
    }
}