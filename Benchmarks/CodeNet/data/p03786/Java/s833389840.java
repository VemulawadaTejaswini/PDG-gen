import java.util.Arrays;
import java.util.Scanner;

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
            Arrays.sort(a);
            int min = -1, max = n;
            while (max - min > 1) {
                int mid = (max + min) / 2;
                if (ok(a, mid)) max = mid;
                else min = mid;
            }
            System.out.println(n - max);
        }
    }

    boolean ok(int a[], int x) {
        int s = a[x];
        for (int i = 0; i < a.length; ++i) {
            if (i == x) continue;
            if (s * 2 < a[i]) return false;
            s += a[i];
        }
        return true;
    }

    void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
