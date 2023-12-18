import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            }

            Arrays.sort(array);

            long ans = 0;
            if (array.length % 2 != 0) {
                int med = array.length / 2;

                for (long element : array) {
                    ans += Math.abs(element - array[med]);
                }

            } else {
                int med1 = array.length / 2;
                int med2 = array.length / 2 - 1;

                long ans1 = 0;
                long ans2 = 0;

                for (long element : array) {
                    ans1 += Math.abs(element - array[med1]);
                }

                for (long element : array) {
                    ans2 += Math.abs(element - array[med2]);
                }

                ans = Math.min(ans1, ans2);
            }


            out.print(ans);

        }

    }
}

