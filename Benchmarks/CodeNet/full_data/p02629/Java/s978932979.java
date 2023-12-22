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
            long n = Long.parseLong(in.next());
            char[] tmp = new char[100000000];
            int i = 0;
            StringBuilder sb = new StringBuilder();

            while (n > 0) {
                long mod = (long) (n - 1) % 26;
                tmp[i] = (char) ('a' + mod);
                sb.append(tmp[i]);
                i++;
                n = (n - mod) / 26;
            }

            // 出力
            out.println(sb.reverse());

        }

    }
}

