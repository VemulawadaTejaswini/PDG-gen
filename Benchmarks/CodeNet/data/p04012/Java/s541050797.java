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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String w = in.next();
            int cnt[] = new int[26];

            for (int i = 0; i < w.length(); i++) {
                cnt[w.charAt(i) - 'a']++;
            }
            // 出力
            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if (cnt[i] % 2 != 0) ok = false;
            }
            if (ok) {
                out.println("Yes");
            } else {
                out.println("No");
            }

        }

    }
}

