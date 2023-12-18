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
        Candles solver = new Candles();
        solver.solve(1, in, out);
        out.close();
    }

    static class Candles {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            long result = 0;
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
            }

            // start
            long distance = Math.min(Math.abs(x[0]), Math.abs(x[k - 1]));
            for (int i = 0; i < k - 1; i++) {
                distance += Math.abs(x[i] - x[i + 1]);
            }

            result = distance;
            int pos = 0;
            while (pos + k < x.length) {
                distance -= Math.abs(x[pos] - x[pos + 1]);
                distance -= Math.min(Math.abs(x[pos]), Math.abs(x[pos + k - 1]));

                distance += Math.abs(x[pos - 1 + k] - x[pos + k]);
                distance += Math.min(Math.abs(x[pos + 1]), Math.abs(x[pos + k]));

                result = Math.min(result, distance);
                pos++;
            }
            out.print(result);


        }

    }
}

