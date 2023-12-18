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
        ABC126_a solver = new ABC126_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC126_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            String S = in.next();

            char low = S.charAt(K - 1);
            String s = String.valueOf(low).toLowerCase();
            for (int i = 0; i < S.length(); i++) {
                if (i == K - 1) {
                    out.print(s);
                } else {
                    out.print(S.charAt(i));
                }
            }
        }

    }
}

