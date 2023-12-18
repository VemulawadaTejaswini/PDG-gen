import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CStrangeBank solver = new CStrangeBank();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStrangeBank {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int res = n;
            for (int i = 0; i <= n; i++) {
                int cc = 0;
                int t = i;
                while (t > 0) {
                    cc += t % 6;
                    t /= 6;
                }
                t = n - i;
                while (t > 0) {
                    cc += t % 9;
                    t /= 9;
                }
                res = Math.min(res, cc);
            }
            out.println(res);
        }

    }
}

