import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final void main(String args[]) throws Exception {
        new Main().solve();
    }

    private static int max = 6;

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int x[] = new int[n];
            for (int i = 0; i < n; ++i) {
                x[i] = in.nextInt();
            }
            x[0] = 1;
            for (int i = 1; i < n; ++i) {
                if (x[i] > x[i - 1] + 2) x[i] = x[i - 1] + 2;
            }
            long mod = 1000000007L;
            long a = 1;
            for (int i = 0, j = 1; i < n - 1; ++i) {
                int k = i == 0 ? 0 : 2;
                while (i == j || j + 1 < n && x[j] - x[j - 1] + k > 1) {
                    if (i != j && x[j] - x[j - 1] == 1) --k;
                    ++j;
                }
                a = (a * (j - i + 1)) % mod;
            }
            System.out.println(a);
        }
    }

    void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}