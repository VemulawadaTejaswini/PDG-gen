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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt() - 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i]]++;
        }
        int[][] d = new int[n + 1][n + 1];
        for (int iii = 0; iii < m; iii++) {
            int x = nextInt() - 1;
            int y = nextInt() - 1;
            b[a[x]]--;
            a[x] = y;
            b[a[x]]++;
            for (int[] ints : d) {
                Arrays.fill(ints, n + 1);
            }
            d[0][0] = 0;
//            System.out.println(Arrays.toString(b));
            for (int i = 0; i < n; i++) {
//                System.out.println(Arrays.toString(d[i]));
                for (int j = 0; j < d[i].length; j++) {
                    if (d[i][j] <= n) {
                        d[i + 1][j] = Math.min(d[i + 1][j], d[i][j]);
                        if (j + b[i] >= i + 1) {
//                            System.out.println(i + " " + j);
                            d[i + 1][i + 1] = Math.min(d[i + 1][i + 1], d[i][j]);
                        } else {
                            d[i + 1][i + 1] = Math.min(d[i + 1][i + 1], d[i][j] + (i + 1) - (j + b[i]));
                        }
                    }
                }
            }
            out.println(d[n][n]);
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
