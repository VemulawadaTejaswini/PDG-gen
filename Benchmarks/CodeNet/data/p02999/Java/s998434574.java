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
        ARounding solver = new ARounding();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARounding {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int x = Integer.parseInt(in.next());
            int a = Integer.parseInt(in.next());
            int ans = 0;
            if (x >= a) ans = 10;

            // 出力
            out.println(ans);

        }

    }
}

