import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
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
            char[] s = in.next().toCharArray();
            int k = in.nextInt();

            for (int i = 0; i < s.length; i++) {
                if ('z' - s[i] < k) {
                    k -= 'z' + 1 - s[i];
                    s[i] = 'a';
                }
            }

            if (k > 0) {
                // 処理
                k = k % 26;
                if (s[s.length - 1] + k > 'z') {
                    s[s.length - 1] += k - 26;
                } else {
                    s[s.length - 1] += k;
                }
            }

            for (int i = 0; i < s.length; i++) {
                out.print(s[i]);
            }
            out.println();

        }

    }
}

