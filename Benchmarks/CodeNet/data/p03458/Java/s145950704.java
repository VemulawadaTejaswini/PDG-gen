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
 *
 * @author vikas.k
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int[][] white;
        int[][] black;
        int K;
        int[][] whiteBoard;
        int[][] blackBoard;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            K = in.nextInt();
            int m = 2 * K;
            white = new int[m + 1][m + 1];
            black = new int[m + 1][m + 1];
            whiteBoard = new int[m + 1][m + 1];
            blackBoard = new int[m + 1][m + 1];
            for (int i = 0; i < N; i++) {
                int x = in.nextInt();
                int y = in.nextInt();

                int z = in.next().charAt(0) == 'W' ? 1 : 2;
                if (z == 1) white[x % m + 1][y % m + 1] += 1;
                else black[x % m + 1][y % m + 1] += 1;
            }

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= m; j++) {
                    whiteBoard[i][j] += white[i][j];
                    if (j > 0) whiteBoard[i][j] += whiteBoard[i][j - 1];
                    if (i > 0) whiteBoard[i][j] += whiteBoard[i - 1][j];
                    if (i > 0 && j > 0) whiteBoard[i][j] -= whiteBoard[i - 1][j - 1];
                }
//            for(int j = 1; j <= m; j++) {
//                out.print(whiteBoard[i][j] + " ");
//            }
//            out.println();
            }
//        out.println();
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= m; j++) {
                    blackBoard[i][j] += black[i][j];
                    if (j > 0) blackBoard[i][j] += blackBoard[i][j - 1];
                    if (i > 0) blackBoard[i][j] += blackBoard[i - 1][j];
                    if (i > 0 && j > 0) blackBoard[i][j] -= blackBoard[i - 1][j - 1];
                }
//            for(int j = 1; j <= m; j++) {
//                out.print(blackBoard[i][j] + " ");
//            }
//            out.println();
            }

            int ans = 0;
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= m; j++) {
                    int count = foundAllBlackPoints(i, j, 2) + foundAllWhitePoints(i, j, 1);
                    //out.println(i + " " + j + " " + count);
                    ans = Math.max(count, ans);
                    count = foundAllBlackPoints(i, j, 1) + foundAllWhitePoints(i, j, 2);
                    ans = Math.max(count, ans);
                }
            }
            out.println(ans);
        }

        private int foundAllBlackPoints(int x, int y, int C) {
            int count = 0;
            int x1 = x + K - 1;
            int y1 = y + K - 1;
            count += countGrid(x, y, Math.min(2 * K, x1), Math.min(2 * K, y1), C);
//        System.out.println(x + " " + y + " " + x1 + " " + y1 + " " + count);

            int x2 = x - K;
            int y2 = y - K;
            count += countGrid(Math.max(x2, 1), Math.max(y2, 1), Math.max(x - 1, 0), Math.max(y - 1, 0), C);
//        System.out.println(x2 + " " + y2 + " " + (x-1) + " " + (y-1) + " " + count);

            int x3 = x + K;
            int y3 = y - K;
            int x4 = x + 2 * K - 1;
            int y4 = y;
            count += countGrid(Math.min(x3, 2 * K + 1), Math.max(y3, 1), Math.min(x4, 2 * K), Math.max(y4 - 1, 0), C);
//        System.out.println(x3 + " " + y3 + " " + x4 + " " + (y4-1) + " " + count);

            int x5 = x - K;
            int y5 = y + K;
            int x6 = x;
            int y6 = y + 2 * K - 1;
            count += countGrid(Math.max(x5, 1), Math.min(y5, 2 * K + 1), Math.max(x6 - 1, 0), Math.min(y6, 2 * K), C);
//        System.out.println(x5 + " " + y5 + " " + (x6-1) + " " + y6 + " " + count);

            count += countGrid(Math.min(x + K, 2 * K + 1), Math.min(y + K, 2 * K + 1), Math.min(x + 2 * K - 1, 2 * K), Math.min(y + 2 * K - 1, 2 * K), C);
//        System.out.println((x+K) + " " + (y+K) + " " + (x + 2*K - 1) + " " + (y+2*K - 1) + " " + count);
            return count;
        }

        private int foundAllWhitePoints(int x, int y, int C) {
            int count = 0;

            int x1 = x;
            int y1 = y - K;
            int x2 = x + K - 1;
            int y2 = y - 1;
            count += countGrid(x1, Math.max(y1, 1), Math.min(2 * K, x2), Math.max(y2, 0), C);
            //System.out.println(x1 + " " + y1 +  " " + x2 + " " + y2 +  " " + count);

            x1 = x - K;
            y1 = y;
            x2 = x - 1;
            y2 = y + K - 1;
            count += countGrid(Math.max(x1, 1), y1, Math.max(0, x2), Math.min(y2, 2 * K), C);
            //System.out.println(x1 + " " + y1 +  " " + x2 + " " + y2 + " " + count);

            x1 = x;
            y1 = y + K;
            x2 = x + K - 1;
            y2 = y + 2 * K - 1;
            count += countGrid(x1, Math.min(y1, 2 * K + 1), Math.min(2 * K, x2), Math.min(y2, 2 * K), C);
            //System.out.println(x1 + " " + y1 +  " " + x2 + " " + y2 + " " + count);

            x1 = x + K;
            y1 = y;
            x2 = x + 2 * K - 1;
            y2 = y + K - 1;
            count += countGrid(Math.min(x1, 2 * K + 1), y1, Math.min(2 * K, x2), Math.min(y2, 2 * K), C);
            //System.out.println(x1 + " " + y1 +  " " + x2 + " " + y2 + " " + count);
            return count;
        }

        private int countGrid(int tx, int ty, int bx, int by, int C) {
            if (tx > 2 * K || ty > 2 * K || bx < 1 || by < 1) return 0;
            if (C == 1) {
                return whiteBoard[bx][by] - whiteBoard[bx][ty - 1] - whiteBoard[tx - 1][by] + whiteBoard[tx - 1][ty - 1];
            }
            return blackBoard[bx][by] - blackBoard[bx][ty - 1] - blackBoard[tx - 1][by] + blackBoard[tx - 1][ty - 1];
        }

    }

    static class FastScanner {
        private BufferedReader bufferedReader;
        private StringTokenizer stringTokenizer;

        public FastScanner(InputStream inputStream) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

