import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        if (n % (2 * d + 1) == 0) {
            System.out.println(n / (2 * d + 1));
        } else {
            System.out.println(n / (2 * d + 1) + 1);
        }
    }
}
