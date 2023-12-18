import java.util.*;

public class Main {

    static final long MOD = 1000000007L;

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        long result = Math.abs(n - m) <= 1 ? factorial(n) * factorial(m) % MOD : 0;
        if ((n + m) % 2 == 0) {
            result *= 2;
            result %= MOD;
        }

        // 出力
        System.out.println(result);
    }

    public static long factorial(long n) {
        long x = 1;
        for (long i = 2; i <= n; i++) {
            x *= i;
            x %= MOD;
        }
        return x;
    }
}
