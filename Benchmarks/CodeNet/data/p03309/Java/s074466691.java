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
        ABC102_C solver = new ABC102_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC102_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] array = new long[n];

            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                array[i] = in.nextLong() - i;
                max = Math.max(array[i], max);
                min = Math.min(array[i], min);
            }

            long ans = Long.MAX_VALUE;


            for (long i = min; i <= max; i++) {
                long tmp = 0;
                for (long element : array) {
                    tmp += Math.abs(element - i);
                }
                ans = Math.min(ans, tmp);
            }

            out.print(ans);
        }

    }
}

