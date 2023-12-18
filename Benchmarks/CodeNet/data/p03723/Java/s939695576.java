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
        long a = nextInt();
        long b = nextInt();
        long c = nextInt();
        for (int i = 0; i < 1000; i++) {
            if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
                out.println(i);
                return;
            }
            long aa = (b + c) / 2;
            long bb = (a + c) / 2;
            long cc = (a + b) / 2;
            a = aa;
            b = bb;
            c = cc;
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
