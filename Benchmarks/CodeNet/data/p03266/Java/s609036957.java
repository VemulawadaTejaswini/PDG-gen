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
        ABC_108_C solver = new ABC_108_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_108_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int cnt = 0;
            long ans = 0;
            for (int i = 1; i <= n; i++) {
                if (i % k == 0) {
                    cnt++;
                }
            }

            if (k % 2 == 0) {
                int cnthalf = 0;
                for (int i = 1; i <= n; i++) {
                    if (i % k == (k / 2)) {
                        cnthalf++;
                    }
                }
                ans += (long) Math.pow(cnthalf, 3);
            }
            ans += (long) Math.pow(cnt, 3);

            out.print(ans);
        }

    }
}

