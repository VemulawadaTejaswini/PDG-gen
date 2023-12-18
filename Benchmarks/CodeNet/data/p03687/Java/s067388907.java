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
        String s = next();
        int res = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) continue;
            int max = 0;
            int l = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) l = -1;
                l++;
                max = Math.max(max, l);
            }
            res = Math.min(res, max);
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
