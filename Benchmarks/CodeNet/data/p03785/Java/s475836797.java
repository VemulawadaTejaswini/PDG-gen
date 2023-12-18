import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int c = in.nextInt();
            int k = in.nextInt();
            int t[] = new int[n];
            for (int i = 0; i < n; ++i) {
                t[i] = in.nextInt();
            }
            Arrays.sort(t);
            int x = 0, a = 0, b = 0;
            for (int i = 0; i < n; ++i) {
                if (a == 0 || b < t[i]) {
                    x++;
                    a = c - 1;
                    b = t[i] + k;
                } else {
                    a -= 1;
                }
            }
            System.out.println(x);
        }
    }

    void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
