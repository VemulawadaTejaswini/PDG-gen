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
        FastDivision solver = new FastDivision();
        solver.solve(1, in, out);
        out.close();
    }

    static class FastDivision {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int ans = -1;
            if (n == 0 || n == 2) {
                ans = 1;
            } else if (n == 1) {
                ans = 2;
            } else {
                ans = 0;
            }
            out.println(ans);
        }

    }
}