import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int MOD = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        for (long i = 1; i < m; i++)
            ans = (ans + i * (m - i) % MOD * n % MOD * n % MOD) % MOD;
        for (long i = 1; i < n; i++)
            ans = (ans + i * (n - i) % MOD * m % MOD * m % MOD) % MOD;
        for (long i = 2; i < k; i++)
            ans = ans * (n * m - i) % MOD * powAndMod(i - 1, MOD - 2) % MOD;
        System.out.println(ans);
    }

    static long powAndMod(long a, long b) {
        if (b == 0)
            return 1;
        if ((b & 1) == 1)
            return a * powAndMod(a, b - 1) % 1000000007;
        return powAndMod(a * a % 1000000007, b / 2);
    }
}