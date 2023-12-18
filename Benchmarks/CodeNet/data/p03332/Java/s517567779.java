import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        long ret = 0;
        long mod = 998244353;

        for (long a = 0; a <= N; a++) {
            long b = (K - A * a) / B;
            if (b >= 0 && b <= N && a * A + b * B == K) {
                ret += ((choose(N, a) % mod) * (choose(N, b) % mod)) % mod;
            }
        }

        System.out.println(ret % mod);
    }

    static long choose(long x, long y) {
        if (y < 0 || y > x) return 0;
        if (y > x / 2) {
            y = x - y;
        }

        double answer = 1.0;
        for (int i = 1; i <= y; i++) {
            answer *= (x + 1 - i);
            answer /= i;
        }

        return (long) answer;
    }
}