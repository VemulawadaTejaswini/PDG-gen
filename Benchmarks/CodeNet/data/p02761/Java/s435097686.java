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
        GuessTheNumber solver = new GuessTheNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class GuessTheNumber {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] num = new int[n + 1];

            for (int i = 0; i < m; i++) {
                int s = in.nextInt();
                int c = in.nextInt();
                if (num[s] != 0 && num[s] != c) {
                    out.print(-1);
                    return;
                }
                num[s] = c;
            }
            long result = 0;
            for (int i = 1; i < num.length; i++) {
                result += pow(10, n - i) * num[i];
            }
            if (String.valueOf(result).length() != n) {
                out.print(-1);
                return;
            }
            out.print(result);
        }

        static long pow(long x, long n) {

            if (n == 0) {
                return 1;
            }
            long result = pow(x, n / 2);

            if (n % 2 == 0) {
                return (result * result);
            }
            return ((result * result)) * x;
        }

    }
}

