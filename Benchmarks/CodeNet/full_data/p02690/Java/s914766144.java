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
        IhateFactorization solver = new IhateFactorization();
        solver.solve(1, in, out);
        out.close();
    }

    static class IhateFactorization {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long x = in.nextLong();
            for (long a = -200; a <= 200; a++) {
                for (long b = -200; b <= 200; b++) {
                    if ((Math.pow(a, 5) - Math.pow(b, 5)) == x) {
                        out.append(String.valueOf(a) + " " + String.valueOf(b));
                        return;
                    }
                }
            }
        }

    }
}

