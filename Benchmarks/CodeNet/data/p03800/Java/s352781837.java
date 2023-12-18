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
        String s = next();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = (s.charAt(i) == 'x') ? 1 : 0;
        }
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 2; b++) {
                int x = a;
                int y = b;
                for (int i = 0; i < n; i++) {
                    int z = (x + y + q[i]) % 2;
                    x = y;
                    y = z;
                }
                if (x == a && y == b) {
                    for (int i = 0; i < n; i++) {
                        out.print(y == 1 ? "W" : "S");
                        int z = (x + y + q[i]) % 2;
                        x = y;
                        y = z;
                    }
                    out.println();
                    return;
                }
            }
        }
        out.println(-1);

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
