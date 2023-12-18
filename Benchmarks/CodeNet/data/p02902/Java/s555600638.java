import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Stack;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FPure solver = new FPure();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPure {
        boolean done = false;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            ArrayList<Integer>[] a = new ArrayList[n], tr = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                a[i] = new ArrayList<>();
                tr[i] = new ArrayList<>();
            }
            while (m-- > 0) {
                int u = s.nextInt() - 1, v = s.nextInt() - 1;
                a[u].add(v);
            }
            boolean[] vis = new boolean[n], stack = new boolean[n];
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (!vis[i]) {
                    dfs(i, vis, stack, a, s, w, st);
                }
            }
            if (!done) w.println(-1);
        }

        void dfs(int cur, boolean[] vis, boolean[] stack, ArrayList<Integer>[] a, FastReader s, PrintWriter w, Stack<Integer> st) {
            if (done) return;
            if (stack[cur]) {
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(cur + 1);
                while (st.peek() != cur) ans.add(st.pop() + 1);
                w.println(ans.size());
                for (int v : ans) w.println(v);
                done = true;
            }
            if (vis[cur]) return;
            st.push(cur);
            vis[cur] = true;
            stack[cur] = true;
            for (int i : a[cur]) dfs(i, vis, stack, a, s, w, st);
            stack[cur] = false;
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

