import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AB116_2 solver = new AB116_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class AB116_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int S = in.nextInt();
            int count = 0;
            int n = 0;
            int a = S;

            while (a != 4) {
                a = ff(a);
                n++;
            }
            a = ff(a);
            n++;
            while (a != 4) {
                a = ff(a);
                n++;
            }
            out.println(n + 1);
        }

        public int ff(int n) {
            if (n == 0 || ((n % 2) == 0)) {
                return n / 2;
            } else {
                return 3 * n + 1;
            }

        }

    }
}

