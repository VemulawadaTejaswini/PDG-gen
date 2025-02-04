import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    int SIZE = 5 * 100_000;
    long MOD = 1_000_000_007;
    long inv[] = new long[5 * 100_000 + 1];
    long fac[] = new long[5 * 100_000 + 1];

    void solve(Scanner sc, PrintWriter pw) {
        fac[0] = 1;
        fac[1] = 1;
        inv[0] = 1;
        inv[1] = 1;
        for (int i = 2; i <= SIZE; i++) {
            fac[i] = (fac[i - 1] * i) % MOD;
            inv[i] = power(fac[i], MOD - 2);
        }
        int N = sc.nextInt();
        int M = sc.nextInt();
        long result = 0;
        for (int common = 0; common <= N; common++) {
            long positive = (common % 2) == 0 ? 1L : -1L;
            long abineFirst = abine(M , common);
            long abineSecond = abine(M - common, N - common);
            long secondPart = (abineFirst * ((abineSecond * abineSecond) % MOD)) % MOD;
            long combine = combine(N, common);
            long part = (positive * ((combine * secondPart) % MOD)) % MOD;
            result = (((result + part) % MOD) + MOD) % MOD;
            //System.out.println(String.format("a(m, i) %d, a(m- i, n - i) %d, combine %d, part %d, result %d", abineFirst, abineSecond, combine, part, result));
        }
        pw.println(result);
    }

    private long power(long l, long k) {
        if (k == 0) {
            return 1;
        }
        long half = power(l, k / 2);
        long part = (half * half) % MOD;
        if ((k % 2) == 1) {
            return (part * l) % MOD;
        } else {
            return part;
        }
    }

    long combine(int n, int k) {
        if (k == 0) {
            return 1L;
        }
        return (fac[n] * ((inv[k] * inv[n - k]) % MOD)) % MOD;
    }

    long abine(int n, int k) {
        if (k == 0) {
            return 1L;
        }
//        if (k == n) {
//            return fac[n];
//        }
        return (fac[n] * ((inv[n - k]))) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        new Main().solve(sc, pw);
        pw.flush();
        pw.close();
        sc.close();
    }
}
