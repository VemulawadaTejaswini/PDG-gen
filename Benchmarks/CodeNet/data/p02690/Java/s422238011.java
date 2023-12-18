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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int x = Integer.parseInt(in.next());
            int ans1 = 0;
            int ans2 = 0;

            for (int i = 0; i < 200; i++) {
                for (int j = -200; j < 200; j++) {
                    if ((int) Math.pow(i, 5.0) - (int) Math.pow(j, 5.0) == x) {
                        ans1 = i;
                        ans2 = j;
                    }
                }
            }
            // 出力
            out.println(ans1 + " " + ans2);

        }

    }
}

