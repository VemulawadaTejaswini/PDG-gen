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
        XorSum2 solver = new XorSum2();
        solver.solve(1, in, out);
        out.close();
    }

    static class XorSum2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            long result = 0;
            for (int i = 0; i < n; i++) {
                long sum = a[i];
                long count = 1;
                for (int j = i + 1; j < n; j++) {
                    if ((sum + a[j]) == (sum ^ a[j])) {
                        sum += a[j];
                        count++;
                    } else {
                        break;
                    }
                }
                result += count;

            }
            out.print(result);
        }

    }
}

