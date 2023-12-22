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
            int ac = 0;
            int wa = 0;
            int tle = 0;
            int re = 0;

            for (int i = 0; i < n; i++) {
                String tmp = in.next();
                if (tmp.equals("AC")) ac++;
                if (tmp.equals("WA")) wa++;
                if (tmp.equals("TLE")) tle++;
                if (tmp.equals("RE")) re++;
            }
            // 出力
            out.println("AC x " + ac);
            out.println("WA x " + wa);
            out.println("TLE x " + tle);
            out.println("RE x " + re);

        }

    }
}

