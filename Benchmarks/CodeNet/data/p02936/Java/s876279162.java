import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author khokharnikunj8
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKi solver = new DKi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKi {
        int[][] G;
        int[] values;

        public void findIt(int node, int parent, int howmuch) {
            values[node] += howmuch;
            for (int i : G[node]) {
                if (i == parent) continue;
                findIt(i, node, values[node]);
            }
        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int q = in.scanInt();
            int[] from = new int[n - 1];
            int[] to = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                from[i] = in.scanInt();
                to[i] = in.scanInt();
            }
            values = new int[n + 1];
            G = CodeHash.packGraph(from, to, n);
            for (int i = 0; i < q; i++) {
                values[in.scanInt()] += in.scanInt();
            }
            findIt(1, -1, 0);
            for (int i = 1; i <= n; i++) out.print(values[i] + " ");


        }

    }

    static class CodeHash {
        public static int[][] packGraph(int[] from, int[] to, int n) {
            return packGraph(from, to, n, from.length);
        }

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

