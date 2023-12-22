import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Hamadneh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BMinorChange solver = new BMinorChange();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMinorChange {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String r = in.next();
            long c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != r.charAt(i))
                    c++;
            }
            out.print(c);
        }

    }
}

