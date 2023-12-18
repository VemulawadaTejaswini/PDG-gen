import java.util.Scanner;

public class Main {
    static final long MOD = 1000000007;
    public static void main(String[] args) {
        int n = 0, m = 0;
        long[] xs, ys;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        xs = new long[n];
        ys = new long[m];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextLong();
        }
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            ys[i] = sc.nextLong();
        }
        long ans1 = 0l;
        long ans2 = 0l;
        long tmp;
        for (int i = 0; i < n; i++) {
            tmp = (i * xs[i]) % MOD;
            tmp -= ((n - 1 - i) * xs[i]) % MOD;
            ans1 = (ans1 + tmp) % MOD;
        }
        for (int j = 0; j < m; j++) {
            tmp = (j * ys[j]) % MOD;
            tmp -= ((m - 1 - j) * ys[j]) % MOD;
            ans2 = (ans2 + tmp) % MOD;
        }
        System.out.println((ans1 *ans2) % MOD);
    }
}
