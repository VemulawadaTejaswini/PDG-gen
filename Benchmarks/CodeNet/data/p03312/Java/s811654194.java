import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqualCut solver = new DEqualCut();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqualCut {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            long[] sum = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (i == 0) {
                    sum[i] = a[i];
                } else {
                    sum[i] = sum[i - 1] + a[i];
                }
            }
            long d = Long.MAX_VALUE;
            for (int i = 1; i < n - 1; i++) {//i番目の後がQRの境
                long mdpr = Long.MAX_VALUE;
                long mdprm = 0, mdprx = 0;
                boolean br = false;
                for (int j = 0; j < i; j++) {//PQ
                    long p = sum[j];
                    long q = sum[i] - sum[j];
                    long dif = p - q;
                    if (dif > 0) {
                        if (br) {
                            break;
                        } else {
                            br = true;
                        }
                    } else {
                        dif = -dif;
                    }
                    if (dif < mdpr) {
                        mdpr = dif;
                        mdprm = p < q ? p : q;
                        mdprx = p < q ? q : p;
                    }
                }
                br = false;
                long mdrs = Long.MAX_VALUE;
                long mdrsm = 0, mdrsx = 0;
                for (int j = i + 1; j < n - 1; j++) {//rs
                    long r = sum[j] - sum[i];
                    long s = sum[n - 1] - sum[j];
                    long dif = r - s;
                    if (dif > 0) {
                        if (br) {
                            break;
                        } else {
                            br = true;
                        }
                    } else {
                        dif = -dif;
                    }
                    if (dif < mdrs) {
                        mdrs = dif;
                        mdrsm = r < s ? r : s;
                        mdrsx = r < s ? s : r;
                    }
                }
                d = Math.min(d, Math.max(mdprx, mdrsx) - Math.min(mdprm, mdrsm));
            }
            out.println(d);
        }

    }
}

