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
            String S = in.next();
            int ans = 0;

            for (int i = 0; i < N - 2; i++) {
                if ('A' == S.charAt(i) && 'B' == S.charAt(i + 1) && 'C' == S.charAt(i + 2)) {
                    ans++;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

