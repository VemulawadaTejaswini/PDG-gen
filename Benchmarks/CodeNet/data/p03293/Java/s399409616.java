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
        BStringRotation solver = new BStringRotation();
        solver.solve(1, in, out);
        out.close();
    }

    static class BStringRotation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next(), t = in.next();
            for (int i = 0; i < s.length(); i++) {
                String u = s.substring(i, s.length()) + s.substring(0, i);
                if (t.equals(u)) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");
        }

    }
}

