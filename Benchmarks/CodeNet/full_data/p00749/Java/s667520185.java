import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Collection;
import java.util.Scanner;
import java.util.OptionalInt;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        private static final int[] DX = {1, -1, 0, 0};
        private static final int[] DY = {0, 0, -1, 1};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int w = in.nextInt(), h = in.nextInt();
            while (w != 0 || h != 0) {
                String[] b = new String[h + 1];
                boolean[][] visited = new boolean[h + 1][w];
                for (int i = 0; i < h; i++) {
                    b[i] = in.next();
                }
                b[h] = "00000000000000000000000000000000";

                boolean stable = true;
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (visited[i][j] || b[i].charAt(j) == '.') continue;

                        List<D.P> pattern = new ArrayList<>(4);
                        pattern.add(new D.P(j, i));
                        while (pattern.size() < 4) {
                            List<D.P> tmp = new ArrayList<>(4);
                            for (D.P p : pattern) {
                                for (int k = 0; k < 4; k++) {
                                    int nx = p.x + DX[k], ny = p.y + DY[k];
                                    if (nx < 0 || ny < 0 || nx >= w || ny >= h || b[ny].charAt(nx) != b[i].charAt(j))
                                        continue;
                                    D.P newPoint = new D.P(nx, ny);
                                    if (!pattern.contains(newPoint) && !tmp.contains(newPoint)) tmp.add(newPoint);
                                }
                            }
                            pattern.addAll(tmp);
                        }

                        boolean[][] v = new boolean[h][w];
                        for (D.P p : pattern) visited[p.y][p.x] = v[p.y][p.x] = true;
                        int minX = pattern.stream()
                                .filter(p -> b[p.y + 1].charAt(p.x) != '.' && b[p.y + 1].charAt(p.x) != b[p.y].charAt(p.x))
                                .mapToInt(p -> p.x).min().getAsInt();
                        int maxX = pattern.stream()
                                .filter(p -> b[p.y + 1].charAt(p.x) != '.' && b[p.y + 1].charAt(p.x) != b[p.y].charAt(p.x))
                                .mapToInt(p -> p.x).max().getAsInt() + 1;
                        long sumX = 0;
                        long count = 0;

                        Queue<D.P> q = new ArrayDeque<>(pattern);
                        while (!q.isEmpty()) {
                            D.P p = q.poll();
                            count += 2;
                            sumX += 2L * p.x + 1;
                            for (int k = 0; k < 4; k++) {
                                int nx = p.x + DX[k], ny = p.y + DY[k];
                                if (nx < 0 || ny < 0 || nx >= w || ny >= h || v[ny][nx] || b[ny].charAt(nx) == '.' || (k != 2 && b[p.y].charAt(p.x) != b[ny].charAt(nx)))
                                    continue;
                                q.offer(new D.P(nx, ny));
                                v[ny][nx] = true;
                            }
                        }
                        if ((count * maxX <= sumX) || (sumX <= count * minX)) {
                            //System.out.println("Reason: In " + pattern + ", sum="+sumX + " count="+count+" but sub=["+minX+", "+maxX+")");
                            stable = false;
                        }
                    }
                }
                out.println(stable ? "STABLE" : "UNSTABLE");
                w = in.nextInt();
                h = in.nextInt();
            }
        }

        private static class P {
            int x;
            int y;

            P(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                D.P p = (D.P) o;

                if (x != p.x) return false;
                return y == p.y;
            }

            public int hashCode() {
                int result = x;
                result = 31 * result + y;
                return result;
            }

            public String toString() {
                return "(" + x + ", " + y + ")";
            }

        }

    }
}


