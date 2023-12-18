import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Pavel Mavrin
 */
public class Main {

    private void solve() throws IOException {
        int n = nextInt();
        int k = nextInt();
        int[][][] q = new int[2][2 * k + 1][2 * k + 1];
        for (int i = 0; i < n; i++) {
            int x = nextInt() % (2 * k);
            int y = nextInt() % (2 * k);
            int c = "BW".indexOf(next());
            q[c][x + 1][y + 1]++;
        }
        for (int c = 0; c < 2; c++) {
            for (int x = 1; x <= 2 * k; x++) {
                for (int y = 1; y <= 2 * k; y++) {
                    q[c][x][y] += q[c][x - 1][y] + q[c][x][y - 1] - q[c][x - 1][y - 1];
                }
            }
        }
        int res = Integer.MIN_VALUE;
        for (int x = 1; x <= k; x++) {
            for (int y = 1; y <= k; y++) {
                for (int c = 0; c < 2; c++) {
                    int s = calc(q[c], 0, 0, x, y) + calc(q[1 - c], x, 0, x + k, y) + calc(q[c], x + k, 0, 2 * k, y) +
                            calc(q[1 - c], 0, y, x, y + k) + calc(q[c], x, y, x + k, y + k) + calc(q[1 - c], x + k, y, 2 * k, y + k) +
                            calc(q[c], 0, y + k, x, 2 * k) + calc(q[1 - c], x, y + k, x + k, 2 * k) + calc(q[c], x + k, y + k, 2 * k, 2 * k);
                    res = Math.max(res, s);
                }
            }
        }
        out.println(res);
    }

    private int calc(int[][] q, int x1, int y1, int x2, int y2) {
        return q[x2][y2] + q[x1][y1] - q[x1][y2] - q[x2][y1];
    }

    // ------------------

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PrintWriter out = new PrintWriter(System.out);

    String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        solve();
        out.close();
    }

}
