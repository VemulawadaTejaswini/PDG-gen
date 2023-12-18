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
        CRally solver = new CRally();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRally {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = new int[n];
            // 気合で
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
            }
            int sum = 100000000;
            for (int i = 1; i <= 100; i++) {
                // 中心はi
                int tmp = 0;
                for (int j = 0; j < n; j++) {
                    tmp += (i - x[j]) * (i - x[j]);
                }
                sum = Math.min(sum, tmp);
            }
            out.println(sum);
        }

    }
}

