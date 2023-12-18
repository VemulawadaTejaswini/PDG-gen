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
        DiceandCoin solver = new DiceandCoin();
        solver.solve(1, in, out);
        out.close();
    }

    static class DiceandCoin {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            double result = 0;
            for (int i = 1; i <= n; i++) {
                int t = i;
                double tmp = 1;
                while (t < k) {
                    tmp /= 2;
                    t *= 2;
                }
                result += tmp;
            }
            out.println(result / n);

        }

    }
}

