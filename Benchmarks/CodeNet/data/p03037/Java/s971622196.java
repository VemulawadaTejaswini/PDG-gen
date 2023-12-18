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
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int lr[][] = new int[m][2];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                lr[i][0] = Integer.parseInt(in.next());
                lr[i][1] = Integer.parseInt(in.next());
                min = Math.min(min, lr[i][0]);
                max = Math.max(max, lr[i][1]);
            }
            int ans = 0;
            int correct = 0;

            for (int i = min; i <= max; i++) {
                for (int j = 0; j < m; j++) {
                    if (i >= lr[j][0] && i <= lr[j][1]) correct++;
                }
                if (correct == m) ans++;
                correct = 0;
            }

            // 出力
            out.println(ans);

        }

    }
}

