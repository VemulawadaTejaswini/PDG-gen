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
                InputReader in = new InputReader(inputStream);
                PrintWriter out = new PrintWriter(outputStream);
                TaskC solver = new TaskC();
                solver.solve(1, in, out);
                out.close();
        }

        static class TaskC {
                public void solve(int testNumber, InputReader in, PrintWriter out) {
                        long n = in.l();
                        long m = in.l();
                        if (n == 1 && m == 1) {
                                out.println(1);
                                return;
                        }
                        if (n <= 2 && m <= 2 || n == 2 || m == 2) {
                                out.println(0);
                                return;
                        }
                        if (n == 1) {
                                out.println(m - 2);
                                return;
                        }
                        if (m == 1) {
                                out.println(n - 2);
                                return;
                        }
                        out.println(n * m - (2 * n + 2 * (m - 2)));
                }

        }

        static class InputReader {
                InputStream is;
                private byte[] inbuf = new byte[1024];
                public int lenbuf = 0;
                public int ptrbuf = 0;

                public InputReader(InputStream is) {
                        this.is = is;
                }

                private int readByte() {
                        if (lenbuf == -1) throw new InputMismatchException();
                        if (ptrbuf >= lenbuf) {
                                ptrbuf = 0;
                                try {
                                        lenbuf = is.read(inbuf);
                                } catch (IOException e) {
                                        throw new InputMismatchException();
                                }
                                if (lenbuf <= 0) return -1;
                        }
                        return inbuf[ptrbuf++];
                }

                public long l() {
                        long num = 0;
                        int b;
                        boolean minus = false;
                        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
                        if (b == '-') {
                                minus = true;
                                b = readByte();
                        }

                        while (true) {
                                if (b >= '0' && b <= '9') {
                                        num = num * 10 + (b - '0');
                                } else {
                                        return minus ? -num : num;
                                }
                                b = readByte();
                        }
                }

        }
}

