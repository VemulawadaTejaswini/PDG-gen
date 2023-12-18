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
        DInsertion solver = new DInsertion();
        solver.solve(1, in, out);
        out.close();
    }

    static class DInsertion {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int pre = 0;
            int open = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    open++;
                } else {
                    if (open == 0) {
                        pre++;
                    } else {
                        open--;
                    }
                }
            }
            for (int i = 0; i < pre; i++) {
                out.print('(');
            }
            out.print(s);
            for (int i = 0; i < open; i++) {
                out.print(')');
            }
            out.println();
        }

    }
}

