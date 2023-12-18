import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BRingosFavoriteNumbers solver = new BRingosFavoriteNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class BRingosFavoriteNumbers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int D = in.nextInt();
            int N = in.nextInt();

            int res = solve(D, N);
            out.println(res);


        }

        private int solve(int d, int n) {
            if (n == 100)
                n = 101;
            if (d == 0) {
                return n;
            }
            if (d == 1) {
                return n * 100;
            }
            if (d == 2)
                return n * 10000;
            throw new RuntimeException("!");
        }

    }
}

