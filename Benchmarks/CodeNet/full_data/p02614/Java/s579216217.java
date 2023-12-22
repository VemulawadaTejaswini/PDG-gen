import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    private static String readToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        final int BLACK = 1;
        final int RED = 0;
        final int H = readInt();
        final int W = readInt();
        final int K = readInt();
        final int[][] g = new int[H][W];
        for (int i = 0; i < H; i++) {
            String line = readToken();
            for (int j = 0; j < W; j++) {
                if (line.charAt(j) == '#') g[i][j] = BLACK;
            }
        }

        int ways = 0;
        for (int rowSet = 0, rLimit = 1 << H; rowSet < rLimit; rowSet++) {  // unselected rows
            for (int colSet = 0, cLimit = 1 << W; colSet < cLimit; colSet++) { // unselected columns
                int blackCount = 0;
                for (int r = 0; r < H; r++) {
                    if ((rowSet & (1 << r)) > 0) {
                        for (int c = 0; c < W; c++) {
                            blackCount += g[r][c] & ((colSet & (1 << c)) >> c);
                        }
                    }
                }
                if (blackCount == K) {
                    ways++;
                }
            }
        }

        pw.println(ways);
        pw.close();
    }
}
