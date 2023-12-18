import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long MOD = 1000000007;

        long[] f = new long[100002];
        f[0] = f[1] = 1;

        for (int i = 2; i <= 100000; i++) {
            f[i] = (f[i - 1] * i) % MOD;
        }

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            long ans = 0;

            if (N == M) {
                ans = (f[N] * f[M] * 2) % MOD;
            } else if (Math.abs(N - M) == 1) {
                ans = (f[N] * f[M]) % MOD;
            }

            System.out.println(ans);
        }
    }
}
