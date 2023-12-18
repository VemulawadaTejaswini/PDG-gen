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
        ABC133_a solver = new ABC133_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC133_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();

            if ((A * N) > B) {
                out.println(B);
            } else {
                out.println(A * N);

            }
        }

    }
}

