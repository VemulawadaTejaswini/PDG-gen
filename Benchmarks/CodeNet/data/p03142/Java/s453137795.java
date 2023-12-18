import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[] f = new int[n + m - 1];
            int[] t = new int[n + m - 1];
            int[] p = new int[n];
            for (int i = 0; i < n + m - 1; i++) {
                f[i] = in.nextInt() - 1;
                t[i] = in.nextInt() - 1;
                p[f[i]]++;
            }
            int[][] g = new int[n][];
            for (int i = 0; i < n; i++)
                g[i] = new int[p[i]];
            for (int i = 0; i < n + m - 1; i++)
                g[f[i]][--p[f[i]]] = t[i];

            int[] sorted = Sort.topologicalSort(g);
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                int cv = sorted[i];
                for (int ct : g[cv]) {
                    ans[ct] = cv + 1;
                }
            }

            for (int cv : ans)
                out.println(cv);
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }

    static class Sort {
        public static int[] topologicalSort(int[][] g) {
            int n = g.length;
            int[] inDegreeCount = new int[n];
            for (int[] f : g)
                for (int t : f)
                    inDegreeCount[t]++;

            int[] sorted = new int[n];
            int p = 0;
            for (int i = 0; i < n; i++)
                if (inDegreeCount[i] == 0)
                    sorted[p++] = i;

            for (int i = 0; i < p; i++) {
                int cv = sorted[i];
                for (int t : g[cv])
                    if (--inDegreeCount[t] == 0)
                        sorted[p++] = t;
            }
            return sorted;
        }

    }
}

