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
            long sum = LongStream.of(a).sum();
            if (sum < k) {
                System.out.println(n);
            } else {
                System.out.println(LongStream.of(a).filter(x -> sum - x >= k).count());
            }
        }
    }

    void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
