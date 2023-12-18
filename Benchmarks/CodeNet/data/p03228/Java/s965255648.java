import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BExchange solver = new BExchange();
        solver.solve(1, in, out);
        out.close();
    }

    static class BExchange {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    //t -> a
                    b += a / 2;
                    a /= 2;
                } else {
                    a += b / 2;
                    b /= 2;
                }
            }
            out.println(a + " " + b);
        }

    }
}

