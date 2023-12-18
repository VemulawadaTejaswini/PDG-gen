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
        int m = nextInt();
        char[][] a = new char[n][];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        if (a[0][0] == '.' || a[n - 1][m - 1] == '.') {
            out.println("Impossible");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) if (a[i][j] == '#'){
                if (i < n - 1 || j < m - 1) {
                    int r = 0;
                    if (i < n - 1 && a[i + 1][j] == '#') r++;
                    if (j < m - 1 && a[i][j + 1] == '#') r++;
                    if (r != 1) {
                        out.println("Impossible");
                        return;
                    }
                }
                if (i > 0 || j > 0) {
                    int r = 0;
                    if (i > 0 && a[i - 1][j] == '#') r++;
                    if (j > 0 && a[i][j - 1] == '#') r++;
                    if (r != 1) {
                        out.println("Impossible");
                        return;
                    }
                }
            }
        }
        out.println("Possible");
    }


    private BufferedReader br;
    private PrintWriter out;
    private StringTokenizer st;

    String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

}
