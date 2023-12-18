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
        int p = nextInt();
        int[]a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        long[] d = new long[2];
        d[0] = 1;
        for (int i = 0; i <n ; i++) {
            long[] dd = new long[2];
            dd[0] = d[0];
            dd[1] = d[1];
            dd[a[i] % 2] += d[0];
            dd[(a[i] + 1) % 2] += d[1];
            d = dd;
        }
        out.println(d[p]);
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
