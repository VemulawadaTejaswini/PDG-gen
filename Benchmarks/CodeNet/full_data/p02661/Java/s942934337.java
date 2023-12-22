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
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                b[i] = Integer.parseInt(in.next());
            }
            int ans = 0;
            Arrays.sort(a);
            Arrays.sort(b);

            if (n % 2 == 0) {
                ans = (b[(n / 2) - 1] + b[n / 2]) - (a[(n / 2) - 1] + a[n / 2]) + 1;
            } else {
                ans = b[n / 2] - a[n / 2] + 1;
            }
            // 出力
            out.println(ans);

        }

    }
}

