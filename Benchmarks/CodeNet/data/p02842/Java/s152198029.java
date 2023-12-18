import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

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
        sumitrust2019B solver = new sumitrust2019B();
        solver.solve(1, in, out);
        out.close();
    }

    static class sumitrust2019B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            int n = Integer.parseInt(in.next());
            String ans = ":(";
            String[] x = new String[2];
            String[] x2 = new String[2];

            x = String.valueOf(n / 1.08).split(Pattern.quote("."), 0);
            x2 = String.valueOf((Integer.valueOf(x[0]) * 1.08)).split(Pattern.quote("."), 0);

            if (String.valueOf(n).equals(x2[0])) {
                ans = x[0];
            } else {
                x2 = String.valueOf(((Integer.valueOf(x[0]) + 1) * 1.08)).split(Pattern.quote("."), 0);
                if (String.valueOf(n).equals(x2[0])) ans = String.valueOf(Integer.valueOf(x[0]) + 1);

            }

            // 出力
            out.println(ans);

        }

    }
}

