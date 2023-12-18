import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Echizen
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
            long n = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            if (n == 1 && a != b) {
                out.println(0);
            } else if (n == 1 && a == b) {
                out.println(1);
            } else if (n > 1 && a > b) {
                out.println(0);
            } else {
                out.println((n - 2) * (b - a) + 1);
            }
        }

    }
}
