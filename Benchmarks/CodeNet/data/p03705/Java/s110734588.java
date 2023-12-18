import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Gary Ye
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

            if (a == b) {
                out.println(1);
            } else if (n == 1 || a > b) {
                out.println(0);
            } else {
                long smallest = a * (n - 1) + b;
                long largest = a + (n - 1) * b;
                long result = largest - smallest + 1;
                out.println(result);
            }
        }

    }
}

