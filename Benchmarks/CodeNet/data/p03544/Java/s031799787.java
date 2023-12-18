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
            // 整数の入力
            int N = Integer.parseInt(in.next());
            long[] L = new long[N + 1];
            L[0] = 2;
            L[1] = 1;
            for (int i = 2; i < N + 1; i++) {
                L[i] = L[i - 2] + L[i - 1];
            }

            // 出力
            out.println(L[N]);

        }

    }
}

