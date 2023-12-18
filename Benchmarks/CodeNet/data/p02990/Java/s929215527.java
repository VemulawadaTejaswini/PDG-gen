import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long[][] ncr = new long[2001][2001];
        ncr[0][0] = 1;
        for (int i = 1; i <= 2000; i++) {
            ncr[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                ncr[i][j] = (ncr[i - 1][j - 1] + ncr[i - 1][j]) % mod;
            }
        }

        for (int i = 1; i <= k; i++) {
            int m = n - k - i + 1;
            System.out.println(ncr[m + i][i] * ncr[k - 1][i - 1] % mod);
        }
    }
}