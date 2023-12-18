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
            int takahasi = Integer.parseInt(in.next());
            int aoki = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            boolean flg = true;

            for (int i = 0; i < k; i++) {
                if (flg) {
                    aoki += q(takahasi);
                    takahasi = q(takahasi);
                    flg = !flg;
                } else {
                    takahasi += q(aoki);
                    aoki = q(aoki);
                    flg = !flg;

                }
            }
            // 出力
            out.printf("%d %d\n", takahasi, aoki);

        }

        public static int q(int mine) {
            int tmp = 0;
            if (mine % 2 != 0) mine--;
            tmp = mine / 2;
            return tmp;
        }

    }
}

