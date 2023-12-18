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
            long r = Integer.parseInt(in.next());
            long g = Integer.parseInt(in.next());
            long b = Integer.parseInt(in.next());
            long n = Integer.parseInt(in.next());

            long ans = 0;
            for (int i = 0; i <= n / r; i++) {
                for (int j = 0; j <= n / g; j++) {
                    if (r * i + g * j > n) continue;
                    long rem = n - r * i - g * j;
                    if (rem % b != 0) continue;
                    ++ans;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

