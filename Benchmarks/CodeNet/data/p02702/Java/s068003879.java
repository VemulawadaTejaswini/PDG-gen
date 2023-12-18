import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String S = in.next();
            long ans = 0;

            if (S.length() < 4) {
                ans = 0;
            } else {
                for (int i = 0; i <= S.length() - 4; i++) {
                    for (int j = i + 4; j <= S.length(); j++) {
                        String tmp = S.substring(i, j);
                        BigDecimal t = new BigDecimal(tmp);
                        if (t.compareTo(new BigDecimal(0)) != 0 && t.remainder(new BigDecimal(2019)).compareTo(new BigDecimal(0)) == 0)
                            ans++;
                    }
                }

            }
            // 出力
            out.println(ans);

        }

    }
}

