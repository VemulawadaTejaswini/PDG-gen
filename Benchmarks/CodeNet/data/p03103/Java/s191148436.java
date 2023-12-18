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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int N = Integer.parseInt(in.next());
            int M = Integer.parseInt(in.next());
            long[][] AB = new long[N][2];
            for (int i = 0; i < N; i++) {
                AB[i][0] = Long.parseLong(in.next());
                AB[i][1] = Long.parseLong(in.next());
            }
            Arrays.sort(AB, (x, y) -> Long.compare(x[0], y[0]));
            long ans = 0;
            for (int i = 0; i < N; i++) {
                long k = AB[i][1];
                M -= k;
                if (M > 0) {
                    ans += AB[i][0] * k;
                } else {
                    ans += AB[i][0] * (M + k);
                    break;
                }
            }
            // 出力
            out.println(ans);

        }

    }
}

