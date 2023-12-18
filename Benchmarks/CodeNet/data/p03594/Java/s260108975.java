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
        int d = nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = (i + j) % (2 * d);
                int y = (n + m - i - j) % (2 * d);
                if (x >= d) {
                    if (y >= d) {
                        out.print("R");
                    } else {
                        out.print("Y");
                    }
                } else {
                    if (y >= d) {
                        out.print("G");
                    } else {
                        out.print("B");
                    }
                }
            }
            out.println();
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
