import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FLCS solver = new FLCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLCS {
        public void solve(int testNumber, Reader in, PrintWriter out) {
            String s = in.readLine();
            String t = in.readLine();
            int n = s.length();
            int m = t.length();
            FLCS.Triplet[][] dp = new FLCS.Triplet[n + 1][m + 1];
            for (int i = 0; i <= n; ++i) {
                for (int j = 0; j <= m; ++j) {
                    dp[i][j] = new FLCS.Triplet(0, 0, 0);
                }
            }
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= m; ++j) {
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = new FLCS.Triplet(i - 1, j - 1, 1 + dp[i - 1][j - 1].c);
                    } else {
                        if (dp[i - 1][j].c > dp[i][j - 1].c) {
                            dp[i][j] = new FLCS.Triplet(i - 1, j, dp[i - 1][j].c);
                        } else {
                            dp[i][j] = new FLCS.Triplet(i, j - 1, dp[i][j - 1].c);
                        }
                    }
                }
            }
//        String res = "";
            StringBuilder res = new StringBuilder("");
            int i = n;
            int j = m;
            while (i != 0 && j != 0) {
                FLCS.Triplet p = dp[i][j];
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    res.append(s.charAt(i - 1));
                }
                i = p.a;
                j = p.b;
            }
            out.println(res.reverse());
        }

        static class Triplet {
            int a;
            int b;
            int c;

            Triplet(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

        }

    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public Reader(InputStream in) {
            din = new DataInputStream(in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) {
            try {
                din = new DataInputStream(new FileInputStream(file_name));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() {
            byte[] buf = new byte[1000005]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    break;
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        private void fillBuffer() {
            try {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1) {
                    buffer[0] = -1;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private byte read() {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }
}

