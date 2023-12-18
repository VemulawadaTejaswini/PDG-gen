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
        abc162_c solver = new abc162_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc162_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int K = in.nextInt();
            long ans = 0;
            for (int a = 1; a <= K; a++) {
                for (int b = 1; b <= K; b++) {
                    for (int c = 1; c <= K; c++) {
                        ans += gcd(gcd(a, b), c);
                    }
                }

            }
            out.println(ans);
        }

        private long gcd(long m, long n) {
            if (m < n) return gcd(n, m);
            if (n == 0) return m;
            return gcd(n, m % n);
        }

    }
}

