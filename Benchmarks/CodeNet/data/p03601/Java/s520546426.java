import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CodeMonk
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt(), f = in.nextInt();
            int x, y, a1 = 0, a2 = 0;
            for (int i = 0; i < 4000; i++) {
                for (int j = 0; j < 4000; j++) {
                    if ((100 * a * i + 100 * b * j < f) && (c * i + d * j) < f) {
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            out.println(100 * a * a1 + 100 * b * a2 + c * a1 + d * a2 + " " + (c * a1 + d * a2));
        }

    }
}

