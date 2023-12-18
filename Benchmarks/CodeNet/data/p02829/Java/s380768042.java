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
        ABC148_a solver = new ABC148_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC148_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();

            if ((A == 1 && B == 2) || (A == 2 && B == 1)) {
                out.println(3);
            } else if ((A == 2 && B == 3) || (A == 3 && B == 2)) {
                out.println(1);
            } else if ((A == 1 && B == 3) || (A == 3 && B == 1)) {
                out.println(2);
            }
        }

    }
}

