import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final void main(String args[]) throws Exception {
        new Main().solve();
    }

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            long x = in.nextLong();
            long y = in.nextLong();
            System.out.println(x > 8 || y > 8 || dfs(false, x, y) ? "Alice" : "Brown");
        }
    }

    boolean dfs(boolean b, long i, long j) {
        if (i < 2 && j < 2) return b;
        boolean win = false;
        for (long k = 1; k * 2 <= i; ++k) {
            win |= dfs(!b, i - k * 2, j + k);
        }
        for (long k = 1; k * 2 <= j; ++k) {
            win |= dfs(!b, i + k, j - k * 2);
        }
        return win;
    }

    void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}