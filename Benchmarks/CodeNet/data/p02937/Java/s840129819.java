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
        StringsofImpurity solver = new StringsofImpurity();
        solver.solve(1, in, out);
        out.close();
    }

    static class StringsofImpurity {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            char[] s = str.toCharArray();
            char[] t = in.next().toCharArray();

            int[] pos = new int[t.length];

            for (int i = 0; i < t.length; i++) {
                int loc = str.indexOf(String.valueOf(t[i]));
                if (loc == -1) {
                    out.print(-1);
                    return;
                }
                pos[i] = loc + 1;
            }

            long result = pos[0];
            long concat = 1;
            for (int i = 1; i < t.length; i++) {
                if (pos[i] <= pos[i - 1]) {
                    result += s.length;
                    concat++;
                }
                if (Math.pow(10, 100) < concat) {
                    out.print(-1);
                    return;
                }
                result += (pos[i] - pos[i - 1]);
            }
            out.print(result);

        }

    }
}

