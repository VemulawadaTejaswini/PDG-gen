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
            long h = Long.parseLong(in.next());
            long w = Long.parseLong(in.next());

            if (h == 1 || w == 1) {
                out.println(1);
                return;
            }
            if (h % 2 == 0 && w % 2 == 0) {
                out.println((h * w) / 2);
                return;
            }

            long w2 = (w + 1) / 2;

            long ans = 0;
            for (int i = 0; i < h; i++) {
                if (w % 2 == 0 || i % 2 == 0) {
                    ans += w2;
                } else {
                    ans += w2 - 1;
                }
            }
            out.println(ans);
        }

    }
}

