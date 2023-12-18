import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long ans = solve(n, m);
        System.out.println(ans);
    }

    static long solve(long n, long m) {
        // 数列が作れないパターン
        if (Math.abs(n - m) > 1) {
            return 0;
        }

        long ans = 0;
        if (n == m) {
            // 犬猿同値
            long inu = kaijo(n);
            long sal = kaijo(m);
            ans = inu * sal * 2;
        } else {
            if (n > m) {
                long sentou = kaijo(n);
                long other = kaijo(m);
                ans = sentou * other;
            } else {
                long sentou = kaijo(m);
                long other = kaijo(n);
                ans = sentou * other;
            }
        }
        return ans % 1000000007;
    }

    static long kaijo(long n) {
        long ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
            ret %= 1000000007;
        }
        return ret;
    }
}
