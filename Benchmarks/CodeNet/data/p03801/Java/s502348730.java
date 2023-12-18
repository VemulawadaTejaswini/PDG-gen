import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * @author Pavel Mavrin
 */
public class Main {

    private void solve() throws IOException {
        int n = nextInt();
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        Integer[] p = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
        }
        Arrays.sort(p, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                if (a[x] != a[y]) {
                    return -Long.compare(a[x], a[y]);
                } else {
                    return Integer.compare(x, y);
                }
            }
        });
        long[] res = new long[n];
        int c = p[0];
        long s = a[p[0]];
        for (int i = 1; i < n; i++) {
            if (p[i] < c) {
                res[c] = s - i * a[p[i]];
                s = (i + 1) * a[p[i]];
                c = p[i];
            } else {
                s += a[p[i]];
            }
        }
        res[c] = s;
        for (int i = 0; i < n; i++) {
            out.println(res[i]);
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
