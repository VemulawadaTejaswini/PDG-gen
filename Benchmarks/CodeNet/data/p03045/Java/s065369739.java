import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    boolean[][] map;
    int count = 0;

    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        map = new boolean[n + 2][n + 2];
        for (boolean[] a : map) {
            Arrays.fill(a, false);
        }

        Set<Integer> set = new HashSet<>(n);
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }

        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            in.nextInt();

            set.remove(x);
            set.remove(y);

            map[x][y] = map[y][x] = true;
            map[x][x] = map[y][y] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (map[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }

        int ans = set.size();
        out.println(ans + count);
    }

    void dfs(int i, int j) {
        if (map[i][j] == false) {
            return;
        }

        map[i][j] = false;

        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);
    }
}

class InputReader implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);

    String next() {
        return this.sc.next();
    }

    int nextInt() {
        return Integer.parseInt(this.sc.next());
    }

    long nextLong() {
        return Long.parseLong(this.sc.next());
    }

    double nextDouble() {
        return Double.parseDouble(this.sc.next());

    }

    @Override
    public void close() {
        this.sc.close();
    }
}
