import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Niyaz Nigmatullin
 */
public class Main {
    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            @Override
            public void run() {
                InputStream inputStream = System.in;
                OutputStream outputStream = System.out;
                FastScanner in = new FastScanner(inputStream);
                FastPrinter out = new FastPrinter(outputStream);
                TaskD solver = new TaskD();
                solver.solve(1, in, out);
                out.close();
            }
        }, "", 1 << 22).start();
    }

    static class TaskD {
        static List<Integer>[] edges;
        static int[] kill;
        static int[] left;
        static int k;

        public void solve(int testNumber, FastScanner in, FastPrinter out) {
            int n = in.nextInt();
            k = in.nextInt();
            int[] a = in.readIntArray(n);
            for (int i = 0; i < n; i++) --a[i];
            int ans = 0;
            if (a[0] != 0) {
                a[0] = 0;
                ans++;
            }
            edges = new List[n];
            for (int i = 0; i < n; i++) {
                edges[i] = new ArrayList<>();
            }
            for (int i = 1; i < n; i++) {
                edges[a[i]].add(i);
            }
            kill = new int[n];
            left = new int[n];
            dfs(0);
            out.println(kill[0] + ans);
        }

        static void dfs(int v) {
            kill[v] = 0;
            left[v] = 0;
            for (int it = 0; it < edges[v].size(); it++) {
                int to = edges[v].get(it);
                dfs(to);
                kill[v] += kill[to];
                if (left[to] == k - 1 && v != 0) {
                    kill[v]++;
                } else {
                    left[v] = Math.max(left[v], left[to] + 1);
                }
            }
        }

    }

    static class FastScanner extends BufferedReader {
        public FastScanner(InputStream is) {
            super(new InputStreamReader(is));
        }


        public int read() {
            try {
                int ret = super.read();
//            if (isEOF && ret < 0) {
//                throw new InputMismatchException();
//            }
//            isEOF = ret == -1;
                return ret;
            } catch (IOException e) {
                throw new InputMismatchException();
            }
        }

        static boolean isWhiteSpace(int c) {
            return c >= 0 && c <= 32;
        }

        public int nextInt() {
            int c = read();
            while (isWhiteSpace(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int ret = 0;
            while (c >= 0 && !isWhiteSpace(c)) {
                if (c < '0' || c > '9') {
                    throw new NumberFormatException("digit expected " + (char) c
                            + " found");
                }
                ret = ret * 10 + c - '0';
                c = read();
            }
            return ret * sgn;
        }

        public String readLine() {
            try {
                return super.readLine();
            } catch (IOException e) {
                return null;
            }
        }

        public int[] readIntArray(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

    }

    static class FastPrinter extends PrintWriter {
        public FastPrinter(OutputStream out) {
            super(out);
        }

        public FastPrinter(Writer out) {
            super(out);
        }

    }
}

