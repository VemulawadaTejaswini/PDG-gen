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
            int k = Integer.parseInt(in.next());
            int ans = -1;
            int num = 7;
            for (int i = 1; i <= k; i++) {
                num = (10 * num + 7) % k;
                if (num == 0) {
                    ans = i + 1;
                    break;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

