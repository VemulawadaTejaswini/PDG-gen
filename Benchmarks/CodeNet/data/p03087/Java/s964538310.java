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

    private static final int MOD = 1_000_000_007;
    private static final char[] ACGT = new char[]{'A', 'C', 'G', 'T'};

    private void solve(InputStreamScanner in, PrintWriter out) {
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        // 0 1 2 3 4 5
        // T A C T A C
        // 0 0 1 1 1 2
        int[] sum = new int[n];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C' ? 1 : 0);
        }

        for (int i = 0; i < q; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            out.println(sum[end - 1] - sum[start - 1]);
        }
    }

    /**
     * AGC, ACG, GAC, A_GC, AG_C
     */
    private boolean ok(char[] a, char b) {
        if (b == 'T' || b == 'A') {
            return true;
        } else if (b == 'G') {
            if (a[1] == 'A' && a[2] == 'C') {
                return false;
            } else {
                return true;
            }
        } else if (b == 'C') {
            if ((a[1] == 'A' && a[2] == 'G')
                    || (a[1] == 'G' && a[2] == 'A')
                    || (a[0] == 'A' && a[2] == 'G')
                    || (a[0] == 'A' && a[1] == 'G')
            ) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    static class Status {
        int length;
        char[] last3;

        Status(int length, char[] last3) {
            this.length = length;
            this.last3 = last3;
        }

        @Override
        public boolean equals(Object obj) {
            Status s = (Status)obj;
            return length == s.length && Arrays.equals(last3, s.last3);
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
