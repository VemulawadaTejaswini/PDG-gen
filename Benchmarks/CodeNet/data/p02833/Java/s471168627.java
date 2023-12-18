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
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            long n = Long.parseLong(in.next());
            long df = 0L;
            int ans = 0;

            df = doublefactorial(n);

            for (int i = 0; i < String.valueOf(df).length(); i++) {
                if (String.valueOf(df).charAt(String.valueOf(df).length() - 1 - i) == 0) ans++;
            }
            // 出力
            out.println(ans);

        }

        static long doublefactorial(long n) {
            if (n == 0 || n == 1)
                return 1L;

            return n * doublefactorial(n - 2L);
        }

    }
}

