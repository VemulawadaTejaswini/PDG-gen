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
            int n = Integer.parseInt(in.next());
            int ab[][] = new int[n][2];
            int playermin = 1100000000;
            int playermax = -1;
            int point = 1100000000;
            for (int i = 0; i < n; i++) {
                ab[i][0] = Integer.parseInt(in.next());
                ab[i][1] = Integer.parseInt(in.next());
                playermin = Math.min(playermin, ab[i][0]);
                playermax = Math.max(playermax, ab[i][0]);
                point = Math.min(point, ab[i][1]);
            }
            int ans = playermax - playermin + 1;
            for (int i = 1; i < playermin; i++) ans++;
            for (int i = 0; i < point; i++) ans++;

            // 出力
            out.println(ans);

        }

    }
}

