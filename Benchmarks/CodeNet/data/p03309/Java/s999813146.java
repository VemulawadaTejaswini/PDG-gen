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
        int[] a = new int[n];
        long x = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            x += Math.abs(a[i] - (i + 1));
        }
        long y = 0;
        for (int i = 0; i < n; i++) {
            y += Math.abs(a[i] - (i + 2));
        }
        long z = 0;
        for (int i = 0; i < n; i++) {
            z += Math.abs(a[i] - i);
        }

        if (x <= y && x <= z) {
            out.println(x);
            return;
        }
        if (x < z) {
            if (x > y) {
                int q = 3;
                while (true) {
                    long w = 0;
                    for (int i = 0; i < n; i++) {
                        w += Math.abs(a[i] - (i + q));
                    }
                    if (y > w) {
                        y = w;
                        q++;
                    } else {
                        break;
                    }
                }
            }
            out.println(y);
            return;
        }
        if (x < y) {
            if (x > z) {
                int q = 1;
                while (true) {
                    long w = 0;
                    for (int i = 0; i < n; i++) {
                        w += Math.abs(a[i] - (i - q));
                    }
                    if (z > w) {
                        z = w;
                        q++;
                    } else {
                        break;
                    }
                }
            }
            out.println(z);
            return;
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