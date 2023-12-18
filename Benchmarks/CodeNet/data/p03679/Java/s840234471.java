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
            int x, a, b;
            x = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            if (a > b) {
                out.println("delicious ");
            } else if (a < b && (x >= Math.abs(a - b))) {
                out.println("safe");
            } else {
                out.println("dangerous");
            }
        }

    }
}

