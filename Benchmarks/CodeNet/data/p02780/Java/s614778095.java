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
        DiceinLine solver = new DiceinLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DiceinLine {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] p = new int[n + 1];
            long max = 0;
            for (int i = 1; i <= n; i++) {
                p[i] = in.nextInt();
            }

            long a = 0;
            int pos = k;
            for (int j = 1; j <= k; j++) {
                a += p[j];
            }

            for (int i = k + 1; i <= n; i++) {
                a += p[i] - p[i - k];
                if (max < a) {
                    max = a;
                    pos = i;
                }
            }
            double result = 0;
            for (int i = 0; i < k; i++) {
                int v = p[pos - i];
                double sum;
                if (v % 2 == 0) {
                    int num = v / 2;
                    sum = (1 + v) * num;
                } else {
                    int num = v / 2;
                    sum = (1 + v) * num + num + 1;
                }
                result += (sum / v);
            }
            out.println(result);

        }

    }
}

