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
        ESumEqualsXor solver = new ESumEqualsXor();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESumEqualsXor {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int n = s.length();
            ModInt[] safe = new ModInt[n];
            ModInt[] giri = new ModInt[n];

            safe[0] = new ModInt(1);
            giri[0] = new ModInt(2);

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == '0') {
                    safe[i] = safe[i - 1].mul(3);
                    giri[i] = giri[i - 1];
                } else {
                    safe[i] = safe[i - 1].mul(3).add(giri[i - 1]);
                    giri[i] = giri[i - 1].mul(2);
                }
            }

            out.println(safe[n - 1].add(giri[n - 1]).getVal());


        }

    }

    static class ModInt {
        int val;
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

        public int getVal() {
            return val;
        }

    }
}

