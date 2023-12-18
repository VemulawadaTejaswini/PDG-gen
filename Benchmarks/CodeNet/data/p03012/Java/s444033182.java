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
            int w[] = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = Integer.parseInt(in.next());
            }

            int b = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                int s1 = 0;
                int s2 = 0;
                for (int j = 0; j < i; j++) {
                    s1 += w[j];
                }
                for (int j = i; j < n; j++) {
                    s2 += w[j];
                }
                b = Math.min(b, Math.abs(s2 - s1));
            }
            out.println(b);
        }

    }
}

