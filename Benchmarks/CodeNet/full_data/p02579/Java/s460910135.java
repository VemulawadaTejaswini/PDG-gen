import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lucasr
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWizardInMaze solver = new DWizardInMaze();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWizardInMaze {
        static int[] di = {0, 0, 1, -1};
        static int[] dj = {1, -1, 0, 0};
        static int INF = 100000000;
        static int H;
        static int W;

        public void solve(int testNumber, MyScanner sc, PrintWriter out) {
            H = sc.nextInt();
            W = sc.nextInt();
            int fromFirst = sc.nextInt() - 1;
            int fromSecond = sc.nextInt() - 1;
            int toFirst = sc.nextInt() - 1;
            int toSecond = sc.nextInt() - 1;
            char[][] table = sc.nextTable(H);
            ArrayDeque<int[]> queue = new ArrayDeque<>();
            int[][] dist = new int[H][W];
            for (int i = 0; i < H; i++) {
                Arrays.fill(dist[i], INF);
            }
            queue.add(new int[]{fromFirst, fromSecond});
            dist[fromFirst][fromSecond] = 0;
            while (!queue.isEmpty()) {
                int[] tmp = queue.pollFirst();
                int i = tmp[0];
                int j = tmp[1];
                int curDist = dist[i][j];
                for (int k = 0; k < 4; k++) {
                    int ni = i + di[k];
                    int nj = j + dj[k];
                    if (in(ni, nj) && table[ni][nj] == '.' && dist[ni][nj] > curDist) {
                        dist[ni][nj] = curDist;
                        queue.addFirst(new int[]{ni, nj});
                    }
                }
                for (int a = -2; a <= 2; a++) {
                    for (int b = -2; b <= 2; b++) {
                        int ni = i + a;
                        int nj = i + b;
                        if (in(ni, nj) && table[ni][nj] == '.' && dist[ni][nj] > curDist + 1) {
                            dist[ni][nj] = curDist + 1;
                            queue.addFirst(new int[]{ni, nj});
                        }
                    }
                }
            }
            int ret = dist[toFirst][toSecond];
            if (ret >= INF) {
                ret = -1;
            }
            out.println(ret);
        }

        static boolean in(int a, int b) {
            return 0 <= a && a < H && 0 <= b && b < W;
        }

    }

    static class MyScanner {
        private BufferedReader br;
        private StringTokenizer tokenizer;

        public MyScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public char[][] nextTable(int rows) {
            char[][] ret = new char[rows][];
            for (int i = 0; i < rows; i++) {
                ret[i] = next().toCharArray();
            }
            return ret;
        }

    }
}

