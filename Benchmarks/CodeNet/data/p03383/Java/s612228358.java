import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        char[][] a;
        int h;
        int w;
        int[] p;
        boolean[] used;
        boolean ans = false;

        void check() {
            if (ans) {
                return;
            }
            boolean[][] good = new boolean[w][w];
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < w; j++) {
                    good[i][j] = true;
                    for (int r = 0; r < h; r++) {
                        good[i][j] &= a[p[r]][i] == a[p[h - 1 - r]][j];
                    }
                }
            }

            boolean[] used = new boolean[w];
            boolean canUseCenter = (w % 2 == 1);
            for (int i = 0; i < w; i++) {
                if (used[i]) {
                    continue;
                }
                boolean found = false;
                for (int j = i + 1; j < w; j++) {
                    if (!used[j] && good[i][j]) {
                        used[i] = used[j] = true;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    if (good[i][i] && canUseCenter) {
                        used[i] = true;
                        canUseCenter = false;
                    } else {
                        return;
                    }
                }
            }
            ans = true;
        }

        void go(int l, int r) {
            if (l > r) {
                check();
                return;
            }
            int min = 0;
            while (min < used.length && used[min]) {
                min++;
            }
            p[l] = min;
            if (l == r) {
                check();
                return;
            }

            used[min] = true;
            for (int i = 0; i < h; i++) {
                if (!used[i]) {
                    used[i] = true;
                    p[r] = i;
                    go(l + 1, r - 1);
                    used[i] = false;
                }
            }
            used[min] = false;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            a = new char[h][w];
            for (int i = 0; i < h; i++) {
                String s = in.next();
                for (int j = 0; j < w; j++) {
                    a[i][j] = s.charAt(j);
                }
            }
            used = new boolean[h];
            p = new int[h];
            go(0, h - 1);
            out.println(ans ? "YES" : "NO");
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

