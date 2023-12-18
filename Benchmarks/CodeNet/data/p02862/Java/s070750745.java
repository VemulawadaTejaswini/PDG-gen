import java.util.Scanner;

/**
 * Knight
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if ((X + Y) % 3 != 0) {
                System.out.println(0);
                return;
            }

            int k = (X + Y) / 3;
            int i = 2 * k - X;
            int j = 2 * k - Y;

            if (i < 0 || j < 0) {
                System.out.println(0);
                return;
            }

            long ans = combination(k, i, 1000000007);

            System.out.println(ans);
        }
    }

    public static long combination(int N, int K, long MOD) {
        long factN = 1, factK = 1, factM = 1;
        for (int i = 1; i <= N; i++) {
            factN = factN * i % MOD;

            if (i == K) {
                factK = factN;
            }
            if (i == N - K) {
                factM = factN;
            }
        }

        long comb = factN;
        long m = MOD - 2;
        while (m > 0) {
            if (m % 2 == 1) {
                comb = comb * factK % MOD;
                comb = comb * factM % MOD;
                m--;
            }

            factK = factK * factK % MOD;
            factM = factM * factM % MOD;
            m = m / 2;
        }

        return comb;
    }

}
