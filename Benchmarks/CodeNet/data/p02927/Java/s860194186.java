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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int M = Integer.parseInt(in.next());
            int D = Integer.parseInt(in.next());
            int ans = 0;

            if (D <= 21 || M <= 3) {
                out.println(0);
                return;
            }
            for (int i = 4; i <= M; i++) {
                for (int j = 22; j <= D; j++) {
                    int d1 = j % 10;
                    int d10 = j / 10;
                    if (d1 >= 2 && d10 >= 2 && d1 * d10 == i) ans++;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

