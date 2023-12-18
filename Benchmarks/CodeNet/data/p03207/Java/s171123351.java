import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ABC115_B solver = new ABC115_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC115_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextInt();
            Long[] p = new Long[(int) n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextLong();
            }

            Arrays.sort(p);
            p[(int) n - 1] = p[(int) n - 1] / 2;
            long ans = 0;
            for (long ele : p) {
                ans += ele;
            }
            out.print(ans);
        }

    }
}

