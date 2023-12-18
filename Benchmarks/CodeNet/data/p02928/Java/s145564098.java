import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] inv = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] > a[j]) {
                    inv[i]++;
                }
            }
        }
        final int MOD = 1_000_000_007;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (k % 2 == 0) {
                ans += ((inv[i] * k / 2) % MOD) * (k + 1);
            } else {
                ans += ((inv[i] * (k + 1) / 2) % MOD) * k;
            }
            ans %= MOD;

            int dup = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (inv[i] > inv[j]) {
                    dup++;
                }
            }
            ans -= dup * k;
        }
        System.out.println(ans);
    }
}
