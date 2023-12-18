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
        BAcrostic solver = new BAcrostic();
        solver.solve(1, in, out);
        out.close();
    }

    static class BAcrostic {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int w = in.nextInt();
            for (int i = 0; i < s.length(); i += w) {
                out.print(s.charAt(i));
            }
            out.println();
        }

    }
}

