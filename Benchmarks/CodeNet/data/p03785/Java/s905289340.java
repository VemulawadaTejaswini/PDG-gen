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
        int c = nextInt();
        int k = nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = nextInt();
        }
        Arrays.sort(t);
        int res = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] > t[j] + k || i >= j + c) {
                res++;
                j = i;
            }
        }
        res++;
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
