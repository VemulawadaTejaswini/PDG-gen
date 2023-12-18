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
        CGeTAC solver = new CGeTAC();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGeTAC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            String s = in.next();

            for (int i = 0; i < q; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                l--;
                r--;
                int cnt = 0;
                for (int ii = l; ii < r; ii++) {
                    if (s.charAt(ii) == 'A' && s.charAt(ii + 1) == 'C') {
                        cnt++;
                    }
                }
                out.println(cnt);
            }
        }

    }
}

