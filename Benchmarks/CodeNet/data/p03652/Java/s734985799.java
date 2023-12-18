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
        int[][] a = new int[n][m];
        for (int i = 0; i< n; i++){
            for (int j = 0; j < m;j++) {
                a[i][j] = nextInt() - 1;
            }
        }
        boolean[] z = new boolean[m];
        int res = n;
        int[] d = new int[m];
        for (int xx = 0; xx < m; xx++) {
            Arrays.fill(d, 0);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!z[a[i][j]]) {
                        d[a[i][j]]++;
                        break;
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, d[i]);
            }
            res = Math.min(res, max);
            for (int i = 0; i < m; i++) {
                if (d[i] == max) {
                    z[i] = true;
                    break;
                }
            }
        }
        out.println(res);
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
