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
                        int[][] c = new int[3][3];
                        for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                        c[i][j] = in.i();
                                }
                        }
                        int a0 = 0;
                        int b0 = c[0][0];
                        int b1 = c[0][1];
                        int b2 = c[0][2];
                        int a1 = c[1][0] - b0;
                        int a2 = c[2][0] - b0;
                        int[] a = {a0, a1, a2};
                        int[] b = {b0, b1, b2};
                        for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                        if (c[i][j] != a[i] + b[j]) {
                                                out.println("No");
                                                return;
                                        }
                                }
                        }
                        out.println("Yes");
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

                public int i() {
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

