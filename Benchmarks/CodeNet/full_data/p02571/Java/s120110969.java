import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author test
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc177_b solver = new abc177_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc177_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            String T = in.next();

            int mincnt = 1001;
            for (int i = 0; i < (S.length() - T.length()) + 1; i++) {
                int umcnt = 0;
                for (int j = 0; j < T.length(); j++) {
                    if (S.charAt(i + j) != T.charAt(j)) {
                        umcnt++;
                    }
                }
                mincnt = Integer.min(mincnt, umcnt);
            }
            out.println(mincnt);
        }

    }
}

