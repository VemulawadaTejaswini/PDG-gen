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
            String S = in.next();

            //S の先頭の文字は大文字の A である。
            if (S.charAt(0) != 'A') {
                out.println("WA");
                return;
            }

            //S の先頭から3文字目と末尾から2文字目の間（両端含む）に大文字の C がちょうど1個含まれる。
            int cnt = 0;
            for (int i = 2; i < S.length() - 1; i++) {
                if (S.charAt(i) == 'C') cnt++;
            }
            if (cnt == 0 || cnt > 1) {
                out.println("WA");
                return;
            }

            //以上の A, C を除くSのすべての文字は小文字である。
            for (int i = 0; i < S.length(); i++) {
                if (('A' <= S.charAt(i) && S.charAt(i) <= 'Z') && (S.charAt(i) != 'A' && S.charAt(i) != 'C')) {
                    out.println("WA");
                    return;
                }
            }


            out.println("AC");

        }

    }
}

