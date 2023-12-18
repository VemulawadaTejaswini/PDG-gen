import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWideFlip solver = new DWideFlip();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWideFlip {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int res = s.length();
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    // i+1 <-> rest
                    res = Math.min(res, Math.max(i + 1, s.length() - i - 1));
                }
            }
            out.println(res);
        }

    }
}

