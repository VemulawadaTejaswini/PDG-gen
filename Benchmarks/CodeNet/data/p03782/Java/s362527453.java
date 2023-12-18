import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            long k = in.nextLong();
            long a[] = new long[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextLong();
            }
            if (LongStream.of(a).sum() < k) {
                System.out.println(n);
                return;
            }
            Arrays.sort(a);
            long x = 0, y = 0;
            for (int i = 0; i < n && x < k; ++i) {
                x += a[i];
            }
            for (int i = 0; i < n && x - a[i] >= k; ++i) {
                ++y;
            }
            System.out.println(y);
        }
    }

    void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
