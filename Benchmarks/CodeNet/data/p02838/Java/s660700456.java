import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextLong();
        }


        System.out.println(solve(N, A));
    }

    private static long solve(int N, long[] A) {
        int[] bit = new int[61];

        for (int i=0; i<N; i++) {
            int k= 0;
            while (A[i] > 0) {
                bit[k++] += A[i]&1;
                A[i] /= 2;
            }
        }

        long ans = 0;
        for (int i=0; i<60; i++) {
            long p = (long)Math.pow(2, i) % MOD;
            ans += p * (bit[i] * (N-bit[i])) % MOD;
            ans %= MOD;
        }

        return ans;
    }
}