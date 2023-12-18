import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC114_2 solver = new ABC114_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC114_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            int Diff = Integer.MAX_VALUE;
            for (int i = 0; i < S.length() - 2; i++) {
                int three = Integer.parseInt(S.substring(i, i + 3));
                if (Diff > Math.abs(753 - three)) {
                    Diff = Math.abs(753 - three);
                }
            }
            out.println(Diff);
        }

    }
}

