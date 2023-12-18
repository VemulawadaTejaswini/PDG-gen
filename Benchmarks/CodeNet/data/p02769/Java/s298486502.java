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
        ERoaming solver = new ERoaming();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoaming {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            ModInt mi = new ModInt(0);
            ModComb mc = new ModComb(2 * n);
            for (int i = 0; i <= Math.min(n - 1, k); i++) {
                mi = mi.add(mc.combFac(n, i).mul(mc.combFac(n - 1, i)));
            }
            out.println(mi.getVal());
        }

    }

    static class ModInt {
        long val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (int) ((i + MOD) % MOD);
        }

        public ModInt mul(long l) {
            return new ModInt(this.val * l);
        }

        public ModInt add(ModInt m) {
            return new ModInt(this.val + m.getVal());
        }

        public ModInt mul(ModInt m) {
            return new ModInt(this.val * m.getVal());
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

    }

    static class ModComb {
        private int size;
        private ModInt[] fac;
        private ModInt[] inv;

        public ModComb(int n) {
            size = n;
            fac = new ModInt[n + 1];
            inv = new ModInt[n + 1];
            makeFac();
        }

        private void makeFac() {
            for (int i = 0; i <= size; i++) {
                if (i == 0) {
                    fac[i] = new ModInt(1);
                } else {
                    fac[i] = fac[i - 1].mul(i);
                }
                inv[i] = fac[i].inv();
            }
        }

        public ModInt combFac(int n, int k) {
            if (n < k) {
                return new ModInt(0);
            }
            return fac[n].mul(inv[k].getVal()).mul(inv[n - k].getVal());
        }

    }
}

