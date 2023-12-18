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
        SumOfLargeNumbers solver = new SumOfLargeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class SumOfLargeNumbers {
        public static int MOD = (int) (Math.pow(10, 9) + 7);

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long result = 0;
            for (long i = k; i <= n + 1; i++) {
                long min = i * (i - 1) / 2;
                long max = (2 * n - i + 1) * i / 2;
                long add = max - min + 1;
                result = (result + add) % MOD;
            }
            out.append(String.valueOf(result));
        }

    }
}

