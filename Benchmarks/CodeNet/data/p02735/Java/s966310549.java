import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        A_RangeFlipFindRoute solver = new A_RangeFlipFindRoute();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_RangeFlipFindRoute {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            char[][] s = new char[height][];
            for (int r = 0; r < height; r++) {
                s[r] = in.next().toCharArray();
            }
            int[][][] d = new int[2][height][width];
            final int infinity = (int) 1e9;
            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {
                    d[0][r][c] = infinity;
                    d[1][r][c] = infinity;
                }
            }
            if (s[0][0] == '.') {
                d[0][0][0] = 0;
            } else {
                d[1][0][0] = 1;
            }
            int ans = infinity;
            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {
                    for (int flip = 0; flip < 2; flip++) {
                        if (r == height - 1 && c == width - 1) {
                            ans = Math.min(ans, d[flip][r][c]);
                        }
                        for (int dir = 0; dir < 2; dir++) {
                            int nr = r + (dir);
                            int nc = c + (dir ^ 1);
                            if (nr >= height || nc >= width) {
                                continue;
                            }
                            int nflip = flip;
                            int cost = 0;
                            if (s[nr][nc] == '#') {
                                if (flip == 0) {
                                    nflip = 1;
                                    cost = 1;
                                }
                            } else {
                                if (flip == 1) {
                                    nflip = 0;
                                }
                            }
                            d[nflip][nr][nc] = Math.min(d[nflip][nr][nc], d[flip][r][c] + cost);
                        }
                    }
                }
            }
            out.println(ans);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

