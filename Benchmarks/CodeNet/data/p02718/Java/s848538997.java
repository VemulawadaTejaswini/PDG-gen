import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Hernan
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();
            double rank = 1.0 / (4.0 * m);

            boolean ans = true;

            double total = 0;
            double[] items = new double[n];

            for (int i = 0; i < n; ++i) {
                items[i] = in.nextDouble();
                total += items[i];
            }

            int counter = 0;

            for (int i = 0; i < n; ++i) {
                double currentRank = items[i] / total;

                if (currentRank > rank) {
                    counter++;
                }

            }
            out.println((counter >= m && counter > 0) ? "Yes" : "No");


        }

    }
}

