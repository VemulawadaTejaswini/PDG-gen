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
 * @author ankit
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
            int x[] = {1, 3, 5, 7, 8, 10, 12};
            int y[] = {4, 6, 9, 11};
            int z = 2;
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == z || b == z) {
                System.out.print("No");
                return;
            }
            boolean ok1 = false, ok2 = false, ok3 = false, ok4 = false;
            for (int i = 0; i < 7; i++) {
                if (a == x[i]) {
                    ok1 = true;
                }
                if (b == x[i]) {
                    ok2 = true;
                }
                if (ok1 && ok2) {
                    System.out.println("Yes");
                    return;
                }
            }
            for (int i = 0; i < 4; i++) {
                if (a == y[i]) {
                    ok3 = true;
                }
                if (b == y[i]) {
                    ok4 = true;
                }
                if (ok3 && ok4) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }

    }
}

