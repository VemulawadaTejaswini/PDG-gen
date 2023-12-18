
import java.util.Scanner;

public class Main {

    private static final int MOD = 1000000007;

    public static int sum(int[] x, int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += i * x[i] % MOD;
            s -= (n - 1 - i) * x[i] % MOD;
            s = (s + MOD) % MOD;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[m];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        for (int j = 0; j < m; j++) {
            y[j] = sc.nextInt();
        }

        System.out.println(sum(x, n) * sum(y, m) % MOD);
    }
}
