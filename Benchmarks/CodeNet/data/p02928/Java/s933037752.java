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
        BKleeneInversion solver = new BKleeneInversion();
        solver.solve(1, in, out);
        out.close();
    }

    static class BKleeneInversion {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            long k = in.nextLong();
            int[] a = new int[n];
            ModInt fore = new ModInt(0);
            ModInt back = new ModInt(0);
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] < a[j]) fore = fore.add(1);
                    if (a[i] > a[j]) back = back.add(1);
                }
            }
            ModInt ans1 = fore.add(back).mul(k).mul(k - 1).div(2);
            ModInt ans2 = back.mul(k);
            out.println(ans1.add(ans2).getVal());

        }

    }

    static class ModInt {
        long val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (i + MOD) % MOD;
        }

        public ModInt add(long l) {
            return new ModInt(this.val + l);
        }

        public ModInt mul(long l) {
            return new ModInt(this.val * l);
        }

        public ModInt div(long l) {
            return this.mul(new ModInt(l).inv().val);
        }

        public ModInt add(ModInt m) {
            return new ModInt(this.val + m.getVal());
        }

        public ModInt inv() {
            return this.pow(MOD - 2);
        }

        public ModInt pow(long l) {
            ModInt res = new ModInt(1);
            ModInt v = new ModInt(this.val);
            while (l > 0) {
                if (l % 2 != 0) {
                    res = res.mul(v.val);
                }
                v = v.mul(v.val);
                l /= 2;
            }
            return res;
        }

        public long getVal() {
            return val;
        }

        public String toString() {
            return Long.toString(val);
        }

    }
}

