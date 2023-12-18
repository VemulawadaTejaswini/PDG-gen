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
        int[]a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        int res = 0;
        boolean up = false;
        boolean down = false;
        for (int i = 0; i < n; i++) {
            if (i == 0 || (a[i] > a[i - 1] && down) || (a[i] < a[i - 1] && up)) {
                up = false;
                down = false;
                res++;
            } else {
                if (a[i] > a[i - 1]) up = true;
                if (a[i] < a[i - 1]) down = true;
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
