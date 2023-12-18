import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            String S = in.next();

            int res = shortSolve2(S, K);
            out.println(res);
        }

        private int shortSolve2(String s, int K) {
            int n = s.length();
            int i = 0;
            int j = 0;
            int res = 0;
            int k = 0;
            while (j < n) {
                while (j < n && s.charAt(j) == '1')
                    j++;
                res = Math.max(res, j - i);

                while (j < n && s.charAt(j) == '0')
                    j++;
                while (j < n && s.charAt(j) == '1')
                    j++;
                k++;
                if (k > K) {
                    while (i < n && s.charAt(i) == '1')
                        i++;
                    while (i < n && s.charAt(i) == '0')
                        i++;
                }
                res = Math.max(res, j - i);
            }
            return res;
        }

    }
}

