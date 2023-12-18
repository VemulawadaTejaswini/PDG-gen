import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int d = in.nextInt();
            int x = in.nextInt();
            int chocEaten = 0;
            for (int i = 0; i < n; ++i) {
                int a = in.nextInt();
                int day = 1;
                while (day <= d) {
                    chocEaten++;
                    day += a;
                }
            }
            System.out.println(chocEaten + x);
        }

    }
}