import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author bcools
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextInt();
            long a = in.nextInt();
            long b = in.nextInt();
            long res = 0;
            if (n < 1 || a > b) {
                res = 0;
            } else if (n == 1 && a == b) {
                res = 1;
            } else if (n == 1) {
                res = 0;
            } else {
                long min = a + b + (n - 2) * a;
                long max = a + b + (n - 2) * b;
                res = max - min + 1;
            }
            out.println(res);
        }

    }
}

