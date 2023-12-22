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
        AizuGCD solver = new AizuGCD();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuGCD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();

            out.printf("%d\n", gcd(x, y));
        }

        private int gcd(int x, int y) {
            while (y != 0) {
                int t = x % y;
                x = y;
                y = t;
            }

            return x;
        }

    }
}


