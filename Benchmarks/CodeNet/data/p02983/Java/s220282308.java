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
        CRemainderMinimization2019 solver = new CRemainderMinimization2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRemainderMinimization2019 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int l = in.nextInt();
            int r = in.nextInt();
            long res = Long.MAX_VALUE;
            for (int i = l; i <= r && i < l + 2019; i++) {
                for (int j = l + 1; j <= r && j < l + 1 + 2019; j++) {
                    res = Math.min(res, (i * j) % 2019);
                }
            }
            out.println(res);
        }

    }
}

