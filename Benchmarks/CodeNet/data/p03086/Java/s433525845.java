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
            String ACGT = "ACGT";
            boolean flg[] = new boolean[S.length() + 1];

            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < 4; j++) {
                    if (ACGT.charAt(j) == S.charAt(i)) {
                        flg[i] = true;
                        break;
                    }
                }
            }

            int ans = 0;
            for (int i = 0; i < flg.length; i++) {
                if (flg[i] == true && flg[i + 1] == true) {
                    ans++;
                }
            }
            out.print(++ans);

        }

    }
}

