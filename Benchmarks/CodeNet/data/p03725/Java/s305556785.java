import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Pavel Mavrin
 */
public class Main {

    private void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        char[][] a = new char[n][];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        int sx = 0;
        int sy = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 'S') {
                    sx = i;
                    sy = j;
                }
            }
        }
        int[] qqx = new int[n * m];
        int[] qqy = new int[n * m];
        int[] qx = new int[n * m];
        int[] qy = new int[n * m];
        int[][] d = new int[n][m];
        for (int[] ints : d) {
            Arrays.fill(ints, -1);
        }
        d[sx][sy] = 0;
        qx[0] = sx;
        qy[0] = sy;
        int h = 0;
        int t = 1;
        int st = 0;
        int[] dx = new int[]{-1, 0, 0, 1};
        int[] dy = new int[]{0, -1, 1, 0};
        while (t > h || st > 0) {
            if (t == h || d[qx[h]][qy[h]] > k) {
                while (st > 0) {
                    qx[t] = qqx[st - 1];
                    qy[t] = qqy[st - 1];
                    st--;
                    t++;
                }
            }
            int x = qx[h];
            int y = qy[h];
            h++;
            if (x == 0 || y == 0 || x == n - 1 || y == m - 1) {
                out.println((d[x][y] + k - 1) / k);
                return;
            }
            for (int i = 0; i < 4; i++) {
                int xx = x + dx[i];
                int yy = y + dy[i];
                if (d[xx][yy] == -1) {
                    if (a[xx][yy] == '.' || d[x][y] >= k) {
                        qx[t] = xx;
                        qy[t] = yy;
                        t++;
                        d[xx][yy] = d[x][y] + 1;
                    } else {
                        qqx[st] = xx;
                        qqy[st] = yy;
                        st++;
                        d[xx][yy] = k + 1;
                    }
                }
            }
        }
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
