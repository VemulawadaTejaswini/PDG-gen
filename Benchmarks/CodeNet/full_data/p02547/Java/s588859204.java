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
        BGoToJail solver = new BGoToJail();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGoToJail {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int cnt = 0;
            int rencnt = 0;
            for (int i = 0; i < n; i++) {
                int d1 = Integer.parseInt(in.next());
                int d2 = Integer.parseInt(in.next());
                if (d1 == d2) {
                    cnt++;
                    rencnt++;
                } else {
                    if (rencnt < 3) rencnt = 0;
                }
            }

            boolean ok = false;
            if (rencnt >= 3 && cnt >= 3) ok = true;
            out.println(ok ? "Yes" : "No");

        }

    }
}

