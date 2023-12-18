import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DXorSum4 solver = new DXorSum4();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXorSum4 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            long[] a = new long[n];
            int[] t = new int[61];
            int[] f = new int[61];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            for (int i = 0; i < n; i++) {
                long cmp = a[i];
                for (int j = 0; j < 61; j++) {
                    if (cmp % 2 == 1) {
                        t[j]++;
                    } else {
                        f[j]++;
                    }
                    cmp /= 2;
                }
            }

            ModInt ans = new ModInt(0);
            for (int i = 0; i < 61; i++) {
                ans = ans.add((long) t[i] * (long) f[i] * (long) Math.pow(2, i));
            }

            out.println(ans.getVal());

        }

    }

    static class ModInt {
        long val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (int) ((i + MOD) % MOD);
        }

        public ModInt add(long l) {
            return new ModInt(this.val + l);
        }

        public long getVal() {
            return val;
        }

    }
}
