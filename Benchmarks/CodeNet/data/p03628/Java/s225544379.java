import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        final long MOD = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String s1 = in.next();
            String s2 = in.next();

            long ans = 1;
            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    if (i == 0) {
                        ans = (ans * 3) % MOD;
                    } else if (s1.charAt(i - 1) == s2.charAt(i - 1)) {
                        ans = (ans * 2) % MOD;
                    }
                } else {
                    if (i == 0) {
                        ans = (ans * 6) % MOD;
                    } else if (s1.charAt(i) == s1.charAt(i - 1)) {
                        continue;
                    } else if (s1.charAt(i - 1) == s2.charAt(i - 1)) {
                        ans = (ans * 2) % MOD;
                    } else {
                        ans = (ans * 3) % MOD;
                    }
                }
            }

            out.println(ans);
        }

    }
}

