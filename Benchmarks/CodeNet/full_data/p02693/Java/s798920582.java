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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int k = in.nextInt();
            in.nextLine();
            int A = in.nextInt();
            int B = in.nextInt();

            boolean ok = false;
            for (int i = A; i <= B; i++) {
                if (i % k == 0) {
                    out.println("OK");
                    ok = true;
                    break;
                }
            }
            if (!ok)
                out.println("NG");
        }

    }
}

