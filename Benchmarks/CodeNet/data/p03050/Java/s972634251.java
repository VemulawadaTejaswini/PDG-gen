import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long n = scanner.nextLong();
        long ans = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                long m1 = i - 1;
                if (i != 1 && n / m1 == n % m1) {
                    ans += m1;
                }
                long m2 = n / i - 1;
                if (i * i != n && n / m2 == n % m2) {
                    ans += m2;
                }
            }
        }
        System.out.println(ans);
    }
}