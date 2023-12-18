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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            char[] c = in.next().toCharArray();
            long k = in.nextLong();
            for (int i = 0; i < c.length; i++) {
                if (i < c.length - 1) {
                    int need = ('z' - c[i] + 1) % 26;
                    if (k >= need) {
                        k -= need;
                        c[i] = 'a';
                    }
                } else {
                    k = k % 26;
                    c[i] = (char) ((int) (c[i] + k - 'a') % 26 + 'a');
                }
            }

            String s = new String(c);
            out.println(s);


        }

    }
}

