import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BAlgae solver = new BAlgae();
        solver.solve(1, in, out);
        out.close();
    }

    static class BAlgae {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long r = in.nextLong();
            long d = in.nextLong();
            long x = in.nextLong();
            for (int i = 0; i < 10; i++) {
                long xnew = r * x - d;
                x = xnew;
                out.println(xnew);
            }
        }

    }
}

