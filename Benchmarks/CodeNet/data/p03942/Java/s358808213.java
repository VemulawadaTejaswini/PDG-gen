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
        String t = next();
        int j = n - 1;
        int k = n;
        int r = 0;
        int res = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (j > i) j = i;
            while (j >= 0 && s.charAt(j) != t.charAt(i)) j--;
            if (j < 0) {
                out.println(-1);
                return;
            }
            if (k > i) {
                if (j < i) {
                    k = j;
                    r = 1;
                    res = Math.max(res, r);
                }
            } else {
                if (j < k) {
                    k = j;
                    r++;
                    res = Math.max(res, r);
                }
            }
        }
        out.println(res);
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
