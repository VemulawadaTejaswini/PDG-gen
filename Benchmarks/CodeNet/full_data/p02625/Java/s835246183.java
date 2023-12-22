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
            inv[i] = (MOD - (MOD / i) * inv[(int) (MOD % i)] % MOD) % MOD;
        }
        int N = sc.nextInt();
        int M = sc.nextInt();
        long result = 0;
        for (int common = 0; common <= N; common++) {
            long positive = (common % 2) == 0 ? 1 : -1;
            long abineFirst = abine(M , common);
            long abineSecond = abine(M - common, N - common);
            long secondPart = (abineFirst * ((abineSecond * abineSecond) % MOD)) % MOD;
            long part = (positive * ((combine(N, common) * secondPart) % MOD)) % MOD;
            result = (result + part) % MOD;
            //System.out.println(String.format("a(m, i) %d, a(m- i, n - i) %d, part %d, result %d", abineFirst, abineSecond, part, result));
        }
        pw.println(result);
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
