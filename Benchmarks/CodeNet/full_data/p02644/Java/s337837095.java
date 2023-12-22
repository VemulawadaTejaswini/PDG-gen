import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FPondSkater solver = new FPondSkater();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPondSkater {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt(), k = in.nextInt();
            int x1 = in.nextInt(), y1 = in.nextInt();
            int x2 = in.nextInt(), y2 = in.nextInt();

            boolean[][] blocked = new boolean[h + 2][w + 2];
            for (int i = 1; i <= h; i++) {
                char[] row = in.next().toCharArray();
                for (int j = 1; j <= w; j++) {
                    blocked[i][j] = row[j - 1] == '@';
                }
            }
            h += 2;
            w += 2;
            for (int i = 0; i < h; i++) {
                blocked[i][0] = blocked[i][w - 1] = true;
            }
            for (int j = 0; j < w; j++) {
                blocked[0][j] = blocked[h - 1][j] = true;
            }

            int[][] distance = new int[h][w];
            for (int[] row : distance)
                Arrays.fill(row, Integer.MAX_VALUE);
            distance[x1][y1] = 0;
            Queue<FPondSkater.S> q = new PriorityQueue<>(Comparator.comparingInt(p -> distance[p.first][p.second]));

            q.add(FPondSkater.S.of(x1, y1, 0));

            boolean[][] processed = new boolean[h][w];

            while (!q.isEmpty()) {
                FPondSkater.S cur = q.poll();
                if (processed[cur.first][cur.second])
                    continue;
                processed[cur.first][cur.second] = true;

                int d = distance[cur.first][cur.second];

                for (int i = 0, x = cur.first + 1, y = cur.second; i < k; i++, x++) {
                    if (blocked[x][y])
                        break;

                    distance[x][y] = Math.min(distance[x][y], d + 1);
                    q.add(FPondSkater.S.of(x, y, distance[x][y]));
                }
                for (int i = 0, x = cur.first - 1, y = cur.second; i < k; i++, x--) {
                    if (blocked[x][y])
                        break;

                    distance[x][y] = Math.min(distance[x][y], d + 1);
                    q.add(FPondSkater.S.of(x, y, distance[x][y]));
                }
                for (int i = 0, x = cur.first, y = cur.second + 1; i < k; i++, y++) {
                    if (blocked[x][y])
                        break;

                    distance[x][y] = Math.min(distance[x][y], d + 1);
                    q.add(FPondSkater.S.of(x, y, distance[x][y]));
                }
                for (int i = 0, x = cur.first, y = cur.second - 1; i < k; i++, y--) {
                    if (blocked[x][y])
                        break;

                    distance[x][y] = Math.min(distance[x][y], d + 1);
                    q.add(FPondSkater.S.of(x, y, distance[x][y]));
                }
            }

            if (distance[x2][y2] == Integer.MAX_VALUE) {
                out.println(-1);
                return;
            }

            out.println(distance[x2][y2]);
        }

        private static class S {
            public int first;
            public int second;
            public int distance;

            public S(int f, int s, int d) {
                first = f;
                second = s;
                distance = d;
            }

            public static FPondSkater.S of(int f, int s, int d) {
                return new FPondSkater.S(f, s, d);
            }

            public String toString() {
                return String.format("(%d, %d, %d)", first, second, distance);
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

