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

    int[] p;

    int get(int x) {
        if (p[x] != x) p[x] = get(p[x]);
        return p[x];
    }


    private void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        if (m == n - 1) {
            out.println(0);
            return;
        }
        int[] a = new int[n];
        p = new int[n];
        for (int i = 0; i < n; i++) p[i] = i;
        for (int i = 0; i < n; i++) a[i] = nextInt();
        for (int i = 0; i < m; i++) {
            int x = nextInt();
            int y = nextInt();
            p[get(x)] = get(y);
        }
        int[] min = new int[n];
        Arrays.fill(min, -1);
        for (int i = 0; i < n; i++) {
            int j = get(i);
            if (min[j] == -1 || a[min[j]] > a[i]) min[j] = i;
        }
        long s = 0;
        int k = (n - m - 1) * 2;
        for (int i = 0; i < n; i++) {
            if (p[i] == i) {
//                System.out.println(i + " " + a[min[i]]);
                s += a[min[i]];
                k--;
                a[min[i]] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (k == 0) break;
            if (a[i] == Integer.MAX_VALUE) {
                out.println("Impossible");
                return;
            }
            s += a[i];
            k--;
        }
        out.println(s);
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
