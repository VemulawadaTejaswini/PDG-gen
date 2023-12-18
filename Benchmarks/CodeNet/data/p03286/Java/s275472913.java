import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CBase2Number solver = new CBase2Number();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBase2Number {
        private static final long MASK = 0xAAAAAAAAAAAAAAAAL;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            out.println(Long.toString((n + MASK) ^ MASK, 2));
        }

    }
}

