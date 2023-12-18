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
        ABC127_a solver = new ABC127_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC127_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();

            if (A <= 5) {
                out.println(0);
                return;
            }
            if (A >= 13) {
                out.println(B);
                return;
            }
            if (A <= 12) {
                out.print(B / 2);
                return;
            }
        }

    }
}

