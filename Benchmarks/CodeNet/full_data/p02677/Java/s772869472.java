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
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int h = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());

            double min = h * 60.0 + m;
            double rect = 5.5 * min;
            double ans = Math.sqrt(((double) a * (double) a) + ((double) b * (double) b) - 2.0 * (double) a * (double) b * Math.cos(Math.toRadians(rect)));
            out.printf("%.13f\n", ans);

        }

    }
}

