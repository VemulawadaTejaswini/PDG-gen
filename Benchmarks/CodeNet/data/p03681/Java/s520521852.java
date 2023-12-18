import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println( solve(N, M) );
    }

    private static long solve(int N, int M) {
        if( N == M + 1 ) {
            return calc(M) * N % MOD;

        } else if( M == N + 1 ) {
            return calc(N) * M % MOD;

        } else if( N == M ) {
            return calc(N) * 2 % MOD;

        } else {
            return 0;
        }
    }

    private static long calc(int n) {
        // n! * n!
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i % MOD;
        }
        return result * result % MOD;
    }
}
