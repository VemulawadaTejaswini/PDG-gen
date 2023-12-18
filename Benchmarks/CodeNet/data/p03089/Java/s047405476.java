import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        InputStreamScanner in = new InputStreamScanner(System.in);
        new Main().solve(in, out);
        out.flush();
    }

    private void solve(InputStreamScanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        ArrayDeque<Act> q = new ArrayDeque<>();
        q.push(new Act(new int[0], a));
        List<Act> memo = new ArrayList<>();

        while (!q.isEmpty()) {
            Act x = q.pop();
            if (x.r[0] == 0) {
                for (int i = x.p.length - 1; i >= 0; i--) {
                    out.println(x.p[i]);
                }
                return;
            }

            for (int i = x.r.length - 1; i >= 0; i--) {
                if (x.r[i] == 0) {
                    continue;
                }
                if (x.r[i] == i + 1) {
                    int[] p = Arrays.copyOf(x.p, x.p.length + 1);
                    p[x.p.length] = i + 1;
                    int[] r = Arrays.copyOf(x.r, n + 1);
                    for (int j = i; j < n; j++) {
                        r[j] = r[j + 1];
                    }
                    Act na = new Act(p, r);
                    if (!memo.contains(na)) {
                        memo.add(na);
                        q.push(new Act(p, r));
                        break;
                    }
                }
            }
        }

        out.println(-1);
    }

    static class Act {
        int[] p;
        int[] r;

        Act (int[] p, int[] r) {
            this.p = p;
            this.r = r;
        }

        @Override
        public boolean equals(Object obj) {
            Act o = (Act)obj;
            return Arrays.equals(this.r, o.r);
        }
    }

    static class InputStreamScanner {

        private InputStream in;

        private byte[] buf = new byte[1024];
        private int len = 0;
        private int off = 0;

        InputStreamScanner(InputStream in)	{
            this.in = in;
        }

        String next() {
            StringBuilder sb = new StringBuilder();
            for (int b = skip(); !isSpace(b);){
                sb.appendCodePoint(b);
                b = read();
            }
            return sb.toString();
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

        char nextChar() {
            return (char)skip();
        }

        int skip() {
            for (int b; (b = read()) != -1;) {
                if (!isSpace(b)) {
                    return b;
                }
            }
            return -1;
        }

        private boolean isSpace(int c) {
            return c < 33 || c > 126;
        }

        private int read() {
            if (len == -1) {
                throw new InputMismatchException("End of Input");
            }
            if (off >= len){
                off = 0;
                try {
                    len = in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException(e.getMessage());
                }
                if (len <= 0) {
                    return -1;
                }
            }
            return buf[off++];
        }
    }
}