import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.AbstractCollection;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.LinkedList;
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
        DLine solver = new DLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLine {
        int[][] G;
        int[] ans;

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int x = in.scanInt();
            int y = in.scanInt();
            int[] from = new int[n];
            int[] to = new int[n];
            ans = new int[n];
            for (int i = 0; i < n - 1; i++) {
                from[i] = i + 1;
                to[i] = i + 2;
            }
            from[n - 1] = x;
            to[n - 1] = y;
            G = CodeHash.packGraph(from, to, n, n);
            for (int i = 1; i <= n; i++) dijkstra(i, n);
            for (int i = 1; i < n; i++) out.print(ans[i] + " ");

        }

        private void dijkstra(int source, int n) {
            boolean[] visited = new boolean[n + 1];
            int[] distance = new int[n + 1];
            Arrays.fill(distance, 1000000000);
            LinkedList<int[]> ln = new LinkedList<>();
            distance[source] = 0;
            ln.add(new int[]{source, 0});
            while (!ln.isEmpty()) {
                int[] temp = ln.removeFirst();
                if (visited[temp[0]]) continue;
                visited[temp[0]] = true;
                for (int node : G[temp[0]]) {
                    if (distance[temp[0]] + 1 < distance[node]) {
                        distance[node] = distance[temp[0]] + 1;
                        ln.add(new int[]{node, distance[temp[0]] + 1});
                    }
                }
            }
            for (int i = source + 1; i <= n; i++) ans[distance[i]]++;
        }

    }

    static class CodeHash {
        public static int[][] packGraph(int[] from, int[] to, int n, int m) {
            int[][] g = new int[n + 1][];
            int p[] = new int[n + 1];
            for (int i = 0; i < m; i++) p[from[i]]++;
            for (int i = 0; i < m; i++) p[to[i]]++;
            for (int i = 0; i <= n; i++) g[i] = new int[p[i]];
            for (int i = 0; i < m; i++) {
                g[from[i]][--p[from[i]]] = to[i];
                g[to[i]][--p[to[i]]] = from[i];
            }
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

