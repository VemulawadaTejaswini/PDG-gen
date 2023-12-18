import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    List<Integer>[] g;

    int[] maxDist;
    int[] firstEdgeS;

    void go(int v, int p, int curMaxDist, int firstEdge) {
        dfsOrder.add(v);
        maxDist[v] = curMaxDist;
        firstEdgeS[v] = firstEdge;
        for (int to : g[v]) {
            if (to == p) {
                continue;
            }
            if (v > curMaxDist) {
                go(to, v, v, to);
            } else {
                go(to, v, curMaxDist, firstEdge);
            }
        }
    }

    int getCnt(int v, int shouldBeLess, int p) {
        int res = 1;
        for (int to : g[v]) {
            if (to == p || to >= shouldBeLess) {
                continue;
            }
            res += getCnt(to, shouldBeLess, v);
        }
        return res;
    }

    List<Integer> dfsOrder = new ArrayList<>();

    void solve() {
        int n = in.nextInt();
        g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i + 1 < n; i++) {
            int fr = in.nextInt() - 1;
            int to = in.nextInt() - 1;
            g[fr].add(to);
            g[to].add(fr);
        }
        maxDist = new int[n];
        firstEdgeS = new int[n];
        go(0, -1, -1, -1);
        int[] ans = new int[n];
        ans[0] = 1;
        for (int startV : dfsOrder) {
            if (startV == 0) {
                continue;
            }
            int goTo = maxDist[startV];
            ans[startV] = ans[goTo] + getCnt(startV, goTo, -1);
            int u = firstEdgeS[startV];
            int next = maxDist[goTo];
            if (u < next) {
                ans[startV] -= getCnt(u, next, -1);
            }
        }
        for (int v = 1; v < n; v++) {
            out.print((ans[v] - 1) + " ");
        }
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}