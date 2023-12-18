import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Long> ansMap = new HashMap<>();

    public static long combination(long n, long r) {
        r = Math.min(r, n - r);
        if (r == 1) {
            return n;
        }

        long sum = 1;
        for (long i = 1; i <= r; i++) {
            sum = sum * (n - i + 1) / i;
        }
        return sum;
    }

    private static long howManyPatterns(long p, long q, long r, long N) {
        if ((p+q+r) > N) {
            return 0;
        }
        long nCp = combination(N, p);
        long n_Cq = combination(N-p, q);
        long n__Cr = combination(N-p-q, r);
        return (nCp*n_Cq*n__Cr) % 998244353;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        long ans = 0;
        long maxP = (K / (A+B)) + 1;
        for (long p=0; p<=maxP; p++) {
            long rem = K - (p*(A+B));
            if (rem == 0) {
                //System.out.println("" + p + "," + 0 + "," + 0);
                ans += howManyPatterns(p, 0, 0, N);
                ans %= 998244353;
                continue;
            }

            long maxQ = (K / A) + 1;
            for (long q=0; q<=maxQ; q++) {
                long rem2 = rem - (q*A);
                if (rem2 < 0) {
                    break;
                }
                if (rem2 == 0) {
                    //System.out.println("" + p + "," + q + "," + 0);
                    ans += howManyPatterns(p, q, 0, N);
                    ans %= 998244353;
                    continue;
                }
                if (rem2 % B != 0) {
                    continue;
                }
                long r = rem2 / B;
                //System.out.println("" + p + "," + q + "," + r);
                ans += howManyPatterns(p, q, r, N);
                ans %= 998244353;
            }
        }

        System.out.println("" + ans);
    }
}
