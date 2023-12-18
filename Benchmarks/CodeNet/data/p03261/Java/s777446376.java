import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BShiritori solver = new BShiritori();
        solver.solve(1, in, out);
        out.close();
    }

    static class BShiritori {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            TreeSet<String> t = new TreeSet<>();
            String s = in.next();

            for (int i = 1; i < n; i++) {
                t.add(s);
                char c = s.charAt((s.length() - 1));
                String nextword = in.next();
                if (t.contains(nextword) || (c != nextword.charAt(0))) {
                    out.println("No");
                    return;
                }
                s = nextword;
            }
            out.println("Yes");
        }

    }
}

