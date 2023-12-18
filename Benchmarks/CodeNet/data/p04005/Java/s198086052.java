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
        TaskATCG004A solver = new TaskATCG004A();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskATCG004A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();

            if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
                out.println(0);
            } else {
                long diff = Math.min(1l * C * A, Math.min(1l * A * B, 1l * B * C));
                out.println(diff);
            }
        }

    }
}
