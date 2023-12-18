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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int a[] = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = Integer.parseInt(in.next());
            }

            for (int i = 0; i < m; i++) {
                n -= a[i];
            }

            // 出力
            if (n < 0) {
                out.println(-1);
            } else {
                out.println(n);
            }

        }

    }
}

