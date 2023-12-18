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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            long a = Long.parseLong(in.next());
            int k = digit(a);
            int c = (int) (a / Math.pow(10, k - 1));
            long tmp = (long) ((c + 1) * Math.pow(10, k - 1));
            int ans = (c - 1) + 9 * (k - 1);
            if (tmp - 1 <= a) {
                ans = c + 9 * (k - 1);
            }
            out.println(ans);
        }

        int digit(long n) {
            int res = 0;
            while (n > 0) {
                n /= 10;
                res++;
            }
            return res;
        }

    }
}

