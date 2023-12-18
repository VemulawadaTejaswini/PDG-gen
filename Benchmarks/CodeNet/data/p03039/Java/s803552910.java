import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    static void solve(Scanner scanner) {
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = n[0], M = n[1], K = n[2];

        Combination combination = new Combination(200_000, MOD);
        long x = 0, y = 0;
        for (int d = 1; d < N; d++) {
            x = (x + d * (N - d) * M * M) % MOD;
        }
        for (int d = 1; d < M; d++) {
            y = (y + d * (M - d) * N * N) % MOD;
        }
        long abs = (combination.kFromN(K - 2, N * M - 2) * (x + y)) % MOD;
        System.out.println(abs);
    }

}

class Combination {

    private int MOD;
    private int MAX;

    private final long[] fac, facInv, inv;

    public Combination(int max, int mod) {
        this.MAX = max + 1;
        this.MOD = mod;
        fac = new long[MAX];
        facInv = new long[MAX];
        inv = new long[MAX];

        fac[0] = fac[1] = 1;
        facInv[0] = facInv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            facInv[i] = facInv[i - 1] * inv[i] % MOD;
        }
    }

    public long kFromN(int k, int n) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (facInv[k] * facInv[n - k] % MOD) % MOD;
    }
}

