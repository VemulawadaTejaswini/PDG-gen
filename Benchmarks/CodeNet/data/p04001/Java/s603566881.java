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
            String S = in.next();
            long ans = 0;

            int n = S.length();
            char s[] = S.toCharArray();
            int ptr = n;

            // {0, 1, ..., n-1} の部分集合の全探索
            for (int bit = 0; bit < (1 << n - 1); ++bit) {
                /* bit で表される集合の処理を書く */

                // 整数値 bit から、「いくつか選ぶ方法」を復元
                long tmp = 0;
                tmp = s[0] - '0';
                for (int i = 1; i < n; ++i) {

                    if ((bit & (1 << i - 1)) > 0) {
                        ans += tmp;
                        tmp = s[i] - '0';
                    } else {
                        tmp *= 10;
                        tmp += s[i] - '0';
                    }
                }
                ans += tmp;

            }

            // 出力
            out.println(ans);

        }

    }
}

