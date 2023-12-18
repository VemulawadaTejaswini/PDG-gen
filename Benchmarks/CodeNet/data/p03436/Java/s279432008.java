import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DGridRepainting solver = new DGridRepainting();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGridRepainting {
        private static final int[] MVX = {0, 1, 0, -1, 0, 1, 1, -1, -1};
        private static final int[] MVY = {0, 0, 1, 0, -1, 1, -1, -1, 1};
        private static String[] board;
        private static int[][] distance;

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int h = in.ints(), w = in.ints();
            board = new String[h + 2];
            distance = new int[h + 2][w + 2];
            ArrayUtil.fill(distance, Integer.MAX_VALUE);
            distance[1][1] = 1;

            board[0] = "####################################################";
            board[h + 1] = "####################################################";
            int black = 0;
            for (int i = 1; i <= h; i++) {
                String s = in.string();
                black += s.chars().filter(c -> c == '#').count();
                board[i] = "#" + s + "#";
            }
            dfs(1, 1);
            if (distance[h][w] == Integer.MAX_VALUE) {
                out.println(-1);
            } else {
                out.println(h * w - black - distance[h][w]);
            }
        }

        public void dfs(int x, int y) {
            for (int i = 1; i <= 4; i++) {
                int nx = x + MVX[i];
                int ny = y + MVY[i];
                if (board[ny].charAt(nx) == '.' && distance[y][x] + 1 < distance[ny][nx]) {
                    distance[ny][nx] = distance[y][x] + 1;
                    dfs(nx, ny);
                }
            }
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(int[] a, int v) {
            Arrays.fill(a, v);
        }

        public static void fill(int[][] a, int v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

