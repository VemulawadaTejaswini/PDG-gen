import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGuessTheNumber solver = new CGuessTheNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGuessTheNumber {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] s = new int[m];
            char[] c = new char[m];
            for (int i = 0; i < m; i++) {
                s[i] = in.nextInt();
                c[i] = (char) (in.nextInt() + '0');
            }


            for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
                String test = Integer.toString(i);
                boolean f = true;
                for (int j = 0; j < m; j++) {
                    f = f && (test.charAt(s[j] - 1) == c[j]);
                }
                if (f) {
                    out.println(test);
                    return;
                }
            }

            out.println(-1);

        }

    }
}

