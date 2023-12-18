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
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());

            int s[] = new int[m];
            int c[] = new int[m];
            for (int i = 0; i < m; i++) {
                s[i] = Integer.parseInt(in.next());
                c[i] = Integer.parseInt(in.next());
            }

            int lp = 0;
            int el = 0;
            if (n == 1) {
                lp = 0;
                el = 9;
            }
            if (n == 2) {
                lp = 10;
                el = 99;
            }
            if (n == 3) {
                lp = 100;
                el = 999;
            }
            int flg = 0;
            for (int i = lp; i <= el; i++) {
                String t = Integer.toString(i);
                flg = 0;
                for (int j = 0; j < m; j++) {
                    if (String.valueOf(t.charAt(s[j] - 1)).equals(String.valueOf(c[j]))) {
                        ++flg;
                    }
                }
                if (flg == m) {
                    out.println(t);
                    return;
                }
            }
            out.println(-1);
        }

    }
}

