import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final void main(String args[]) throws Exception {
        new Main().solve();
    }

    void solve() {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            boolean x[][] = new boolean[n][n];
            for (int i = 0; i < n; ++i) {
                String s = in.next();
                for (int j = 0; j < n; ++j) {
                    x[i][j] = s.charAt(j) == '#';
                }
            }
            int c = dfs(x, 0);
            System.out.println(c == 6 ? -1 : c);
        }
    }

    int dfs(boolean[][] x, int c) {
        if (c > 6 || end(x)) return c;
        int n = x.length, r = 6;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int t = dfs(calc(x, i, j), c + 1);
                if (r > t) r = t;
            }
        }
        return r;
    }

    boolean[][] calc(boolean[][] x, int i, int j) {
        int n = x.length;
        boolean[][] t = copy(x);
        for (int k = 0; k < n; ++k) {
            t[k][j] = x[i][k];
        }
        return t;
    }

    boolean[][] copy(boolean[][] x) {
        int n = x.length;
        boolean[][] t = new boolean[n][];
        for (int i = 0; i < n; ++i) {
            t[i] = Arrays.copyOf(x[i], n);
        }
        return t;
    }

    boolean end(boolean[][] x) {
        for (boolean[] i : x) for (boolean j : i) if (!j) return false;
        return true;
    }
}