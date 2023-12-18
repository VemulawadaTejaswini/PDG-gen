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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int L = Integer.parseInt(in.next());
            int R = Integer.parseInt(in.next());
            long ans = Long.MAX_VALUE;

            if (R - L + 1 >= 2019) {
                ans = 0;
            } else {

                for (int i = L; i <= R; i++) {
                    for (int j = i + 1; j <= R; j++) {
                        ans = Math.min(((i % 2019) * (j % 2019)) % 2019, ans);
                        if (ans == 0) break;
                    }
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

