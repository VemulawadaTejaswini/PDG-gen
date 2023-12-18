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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            int N = in.nextInt();
            int[] colors = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                colors[i] = in.nextInt();
            }
            int[][] ans = new int[H][W];
            int i = 0, j = 0;
            int incj = 1;
            for (int k = 1; k <= N; k++) {
                if (colors[k] > 0) {
                    while (colors[k]-- > 0) {
                        ans[i][j] = k;
                        j += incj;
                        if (j == -1 || j == W) i = (i + 1) % H;
                        if (j == W) {
                            j--;
                            incj = -1;
                        } else if (j == -1) {
                            j++;
                            incj = 1;
                        }
                    }
                }
            }
            for (i = 0; i < H; i++) {
                for (j = 0; j < W; j++) {
                    if (j > 0) out.print(" ");
                    out.print(ans[i][j]);
                }
                out.println();
            }
        }

    }

    static class InputReader {
        private int lenbuf = 0;
        private int ptrbuf = 0;
        private InputStream in;
        private byte[] inbuf = new byte[1024];

        public InputReader(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = in.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public int nextInt() {
            int num = 0, b;
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

