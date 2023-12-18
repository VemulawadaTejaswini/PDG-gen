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
        LinkedList<Integer> a4 = new LinkedList<>();
        LinkedList<Integer> a2 = new LinkedList<>();
        LinkedList<Integer> a1 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a % 4 == 0) {
                a4.add(4);
            } else if (a % 2 == 0) {
                a2.add(2);
            } else {
                a1.add(1);
            }
        }

        int p = 0;
        if (!a1.isEmpty()) {
            p = a1.remove();
        } else if (!a2.isEmpty()) {
            p = a2.remove();
        } else {
            out.println("Yes");
            return;
        }
        while (!a4.isEmpty() || !a2.isEmpty() || !a1.isEmpty()) {
            if (p == 4) {
                if (!a1.isEmpty()) {
                    p = a1.remove();
                } else if (!a2.isEmpty()) {
                    p = a2.remove();
                } else {
                    out.println("Yes");
                    return;
                }
            } else if (p == 2) {
                if (!a2.isEmpty()) {
                    p = a2.remove();
                } else {
                    if (a1.isEmpty()) {
                        out.println("Yes");
                        return;
                    } else if (a4.isEmpty()) {
                        out.println("No");
                        return;
                    } else {
                        p = a4.remove();
                    }
                }
            } else if (p == 1) {
                if (!a4.isEmpty()) {
                    p = a4.remove();
                } else {
                    out.println("No");
                    return;
                }
            }
        }
        out.println("Yes");
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