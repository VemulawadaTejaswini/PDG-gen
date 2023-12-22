import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        new TaskAdapter().run();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            DMovingPiece solver = new DMovingPiece();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DMovingPiece {
        boolean[] vis;
        ArrayList<Integer>[] a;
        int[] p;
        int[] c;
        int par;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt();
            p = new int[n];
            c = new int[n];
            vis = new boolean[n];
            a = new ArrayList[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<>();
            for (int i = 0; i < n; i++) p[i] = s.nextInt() - 1;
            for (int i = 0; i < n; i++) c[i] = s.nextInt();
            long res = Long.MIN_VALUE;
            for (int i = 0; i < n; i++)
                if (!vis[i]) {
                    par = i;
                    dfs(i);
                    long sum = 0, t;
                    for (int j = 0; j < a[i].size(); j++) sum += c[a[i].get(j)];
                    int cyc = k / a[i].size();
                    t = sum;
                    sum *= cyc;
                    int len = k % a[i].size();
                    for (int j = 0; j < a[i].size(); j++) {
                        long cur = 0;
                        for (int m = j, l = 0; l < Math.min(a[i].size(), k); l++, m++, m %= a[i].size()) {
                            cur += c[a[i].get(m)];
                            res = Math.max(res, cur);
                        }
                    }
                    for (int j = 0; j < a[i].size(); j++) {
                        long cur = 0;
                        for (int m = j, l = 0; l < len; l++, m++, m %= a[i].size()) {
                            cur += c[a[i].get(m)];
                            res = Math.max(res, sum + cur);
                        }
                    }
                    if (cyc > 0) {
                        sum -= t;
                        for (int j = 0; j < a[i].size(); j++) {
                            long cur = 0;
                            for (int m = j, l = 0; l < a[i].size(); l++, m++, m %= a[i].size()) {
                                cur += c[a[i].get(m)];
                                res = Math.max(res, sum + cur);
                            }
                        }
                    }
                }
            w.println(res);
        }

        void dfs(int i) {
            vis[i] = true;
            a[par].add(i);
            if (!vis[p[i]]) dfs(p[i]);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

