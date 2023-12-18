import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] array = new long[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }

        long num = 1;

        for (int i = 0; i < n; i++) {
            num = lcm(num, array[i]);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += num / array[i];

            if (ans > 1000000007) {
                ans = ans % 1000000007;
            }
        }

        System.out.println(ans);

    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }

}