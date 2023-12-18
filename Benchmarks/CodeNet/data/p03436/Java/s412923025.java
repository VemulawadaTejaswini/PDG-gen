import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DGridRepainting solver = new DGridRepainting();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGridRepainting {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int h = in.nextInt();
            int w = in.nextInt();
            int[] dx = {-1, 0, 0, 1};
            int[] dy = {0, -1, 1, 0};
            char[][] c = new char[h][w];
            boolean[][] b = new boolean[h][w];
            int[][] dp = new int[h][w];
            for (int i = 0; i < h; i++) {
                c[i] = in.next().toCharArray();
                Arrays.fill(b[i], false);
                Arrays.fill(dp[i], 0);
            }

            Deque<Pair<Integer, Integer>> dq = new ArrayDeque<>();
            dq.addLast(new Pair<>(0, 0));
            while (!dq.isEmpty()) {
                Pair<Integer, Integer> p = dq.poll();
                if (!b[p.t][p.u]) {
                    b[p.t][p.u] = true;
                    for (int i = 0; i < 4; i++) {
                        int nx = p.t + dx[i];
                        int ny = p.u + dy[i];
                        // System.out.println(nx + " " + ny);
                        if (0 <= nx && nx < h && 0 <= ny && ny < w) {
                            if (c[nx][ny] == '.' && !b[nx][ny]) {
                                dq.addLast(new Pair<>(nx, ny));
                                dp[nx][ny] = dp[p.t][p.u] + 1;
                            }
                        }

                    }
                }
            }

            int res = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (c[i][j] == '.') res++;
                }
            }

            out.println(res - dp[h - 1][w - 1] - 1);

        }

    }

    static class Pair<T, U> {
        public T t;
        public U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }

        public String toString() {
            return "Pair{" +
                    "t=" + t.toString() +
                    ", u=" + u.toString() +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(t, pair.t) &&
                    Objects.equals(u, pair.u);
        }

        public int hashCode() {
            return Objects.hash(t, u);
        }

    }
}

