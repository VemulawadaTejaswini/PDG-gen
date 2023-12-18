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
        int m = nextInt();
        init(n, m);
        for (int i = 0; i < m; i++) {
            int x = nextInt() - 1;
            int y = nextInt() - 1;
            addEdge(x, y);
        }
        int[] p = new int[2 * n + 1];
        int h = n;
        int t = n + 1;
        p[h] = 0;
        p[t] = dst[head[0]];
        boolean[] z = new boolean[n];
        z[p[h]] = true;
        z[p[t]] = true;
        while (true) {
            boolean ok = false;
            int j = head[p[h]];
            while (j >= 0) {
                int y = dst[j];
                if (!z[y]) {
                    ok = true;
                    p[h - 1] = y;
                    z[y] = true;
                    h--;
                    break;
                }
                j = nx[j];
            }
            if (!ok) break;
        }
        while (true) {
            boolean ok = false;
            int j = head[p[t]];
            while (j >= 0) {
                int y = dst[j];
                if (!z[y]) {
                    ok = true;
                    p[t + 1] = y;
                    z[y] = true;
                    t++;
                    break;
                }
                j = nx[j];
            }
            if (!ok) break;
        }
        out.println(t - h + 1);
        for (int i = h; i <= t; i++) {
            out.print((p[i] + 1) + " ");
        }
        out.println();
    }

    void init(int n, int m) {
        m *= 2;
        this.n = n;
        this.m = m;
        last = 0;
        head = new int[n];
        nx = new int[m];
        dst = new int[m];
        src = new int[m];
        Arrays.fill(head, -1);
        z = new boolean[n];
    }

    void addEdge(int x, int y) {
        nx[last] = head[x];
        src[last] = x;
        dst[last] = y;
        head[x] = last;
        last++;
        nx[last] = head[y];
        src[last] = y;
        dst[last] = x;
        head[y] = last;
        last++;
    }

    int n, m;
    int[] head;
    int[] nx;
    int[] src;
    int[] dst;
    boolean[] z;
    int last;

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
