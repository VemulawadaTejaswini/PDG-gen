import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }
            int x = (n + 1) * n / 2, y = min(a), z = a[y] / x;
            for (int i = 0; i < n; ++i) {
                a[i] -= n * z;
            }
            System.out.println(ok(n, a) ? "YES" : "NO");
        }
    }

    boolean ok(int n, int a[]) {
        while (true) {
            int i = min(a);
            if (a[i] < 0) return false;
            if (a[i] == 0) return !IntStream.of(a).filter(x -> x != 0).findFirst().isPresent();
            int d = Math.max((a[(i + n - 1) % n] - a[i]) / n, 1);
            for (int j = 0; j < n; ++j) {
                a[(i + j) % n] -= (j + 1) * d;
            }
        }
    }

    int min(int a[]) {
        int index = -1, value = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; ++i) {
            if (value > a[i]) {
                value = a[i];
                index = i;
            }
        }
        return index;
    }

    void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
