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
        SccPuzzle solver = new SccPuzzle();
        solver.solve(1, in, out);
        out.close();
    }

    static class SccPuzzle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            long m = in.nextLong();

            long result = 0;
            if (2 * n < m) {
                result += n;
                m -= 2 * n;
            }

            result += m / 4;

            out.println(result);
        }

    }
}

