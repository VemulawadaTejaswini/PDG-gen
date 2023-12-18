import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.Vector;
import java.util.Stack;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * @author khokharnikunj8
 */

public class Main {
    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().solve();
            }
        }, "1", 1 << 26).start();
    }

    void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FPure solver = new FPure();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPure {
        int[][] G;
        Stack<Integer> st;
        boolean[] visited;
        boolean[] stack;
        ArrayList<Integer> ans;

        public void findIt(int node) {
            if (ans.size() != 0) return;
            if (visited[node]) return;
            visited[node] = true;
            stack[node] = true;
            st.push(node);
            for (int i : G[node]) {
                if (stack[i]) {
                    HashSet<Integer> st1 = new HashSet<>();
                    while (st.peek() != i) {
                        int nd = st.pop();
                        ans.add(nd);
                        st1.add(nd);
                    }
                    st1.add(i);
                    ans.add(i);
                    for (int j = 0; j < ans.size(); j++) {
                        int count = 0;
                        for (int temp : G[ans.get(j)]) {
                            if (st1.contains(temp)) {
                                count++;
                            }
                        }
                        if (count > 1) {
                            for (int jj = ans.size() - 2; jj >= 0; jj--) {
                                st.add(ans.get(jj));
                            }
                            ans = new ArrayList<>();
                            break;
                        }
                    }
                } else if (!visited[i])
                    findIt(i);
                if (ans.size() != 0) return;
            }
            st.pop();
            stack[node] = false;
        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int m = in.scanInt();
            int[] from = new int[m];
            int[] to = new int[m];
            for (int i = 0; i < m; i++) {
                from[i] = in.scanInt();
                to[i] = in.scanInt();
            }
            visited = new boolean[n + 1];
            stack = new boolean[n + 1];
            G = CodeHash.packGraphdirected(from, to, n, m);
            ans = new ArrayList<>();
            st = new Stack<>();
            for (int i = 1; i <= n; i++) {
                findIt(i);
                if (ans.size() != 0) {
                    out.println(ans.size());
                    for (int j : ans) out.println(j);
                    return;
                }
            }
            out.println(-1);

        }

    }

    static class CodeHash {
        public static int[][] packGraphdirected(int[] from, int[] to, int n, int m) {
            int[][] g = new int[n + 1][];
            int p[] = new int[n + 1];
            for (int i = 0; i < m; i++) p[from[i]]++;
            for (int i = 0; i <= n; i++) g[i] = new int[p[i]];
            for (int i = 0; i < m; i++) g[from[i]][--p[from[i]]] = to[i];
            return g;
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int index;
        private BufferedInputStream in;
        private int total;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (index >= total) {
                index = 0;
                try {
                    total = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (total <= 0) return -1;
            }
            return buf[index++];
        }

        public int scanInt() {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

