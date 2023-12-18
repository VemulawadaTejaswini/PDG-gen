import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        long[][] comb = new long[n+1][n+1];
        for (int i = 0; i < n+1; i++) {
            Arrays.fill(comb[i], -1);
        }
        comb[0][0] = 1;
        comb[1][1] = 1;

        int max = n - k + 1;
        for (int i = 1; i <= k; i++) {
            long res = comb(max, i, comb) * comb(k - 1, i - 1, comb);
            System.out.println(res);
        }
    }

    static long comb(int l, int r, long[][] comb) {
        int mod = 1000000007;
        if (comb[l][r] != -1) {
            return comb[l][r];
        }

        if (l == 0 || r == 0) {
            return 1;
        }

        if (l == r) {
            return comb[l][r] = 1;
        }

        return comb[l][r] = (comb(l - 1, r, comb) % mod + comb(l - 1, r - 1, comb) % mod) % mod;
    }
}
