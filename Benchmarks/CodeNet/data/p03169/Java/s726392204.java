import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jenish
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        JSushi solver = new JSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class JSushi {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int count[] = new int[4];
            for (int i = 0; i < n; i++) ++count[in.scanInt()];
            double pro[][][] = new double[305][305][305];
            double ex[][][] = new double[305][305][305];
            pro[count[1]][count[2]][count[3]] = 1;
            for (int c = n; c >= 0; --c) {
                for (int b = n; b >= 0; b--) {
                    for (int a = n; a >= 0; a--) {
                        if (a == 0 && b == 0 && c == 0) continue;
                        if (a + b + c > n) continue;


                        double p_waste = (double) (n - (a + b + c)) / n;

                        double ex_value = p_waste / (1 - p_waste);

                        ex[a][b][c] += ex_value * pro[a][b][c];

                        if (a != 0) {
                            double p = (double) a / (a + c + b);
                            pro[a - 1][b][c] += pro[a][b][c] * p;
                            ex[a - 1][b][c] += ex[a][b][c] * p;
                        }


                        if (b != 0) {
                            double p = (double) b / (a + c + b);
                            pro[a + 1][b - 1][c] += pro[a][b][c] * p;
                            ex[a + 1][b - 1][c] += ex[a][b][c] * p;
                        }


                        if (c != 0) {
                            double p = (double) c / (a + c + b);
                            pro[a][b + 1][c - 1] += (double) pro[a][b][c] * p;
                            ex[a][b + 1][c - 1] += ex[a][b][c] * p;
                        }
                    }
                }
            }


            out.println(ex[0][0][0] + count[1] + 2 * count[2] + 3 * count[3]);
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int INDEX;
        private BufferedInputStream in;
        private int TOTAL;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (INDEX >= TOTAL) {
                INDEX = 0;
                try {
                    TOTAL = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TOTAL <= 0) return -1;
            }
            return buf[INDEX++];
        }

        public int scanInt() {
            int I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

