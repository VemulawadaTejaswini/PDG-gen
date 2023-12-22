import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;

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
            BigDecimal a = new BigDecimal(in.next());
            BigDecimal b = new BigDecimal(in.next());
            BigDecimal ans = a.multiply(b);
            BigDecimal ans2 = ans.setScale(0, RoundingMode.DOWN);

            // 出力
            out.println(ans2.toPlainString());

        }

    }
}

