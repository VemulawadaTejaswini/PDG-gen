import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Aupdown solver = new Aupdown();
        solver.solve(1, in, out);
        out.close();
    }

    static class Aupdown {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int[] ar = new int[s.length() + 1];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '<') ar[i + 1] = Math.max(ar[i + 1], ar[i] + 1);
            }
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '>') ar[i] = Math.max(ar[i], ar[i + 1] + 1);
            }
            long res = 0;
            for (int i = 0; i < ar.length; i++) {
                res += (long) ar[i];
            }
            out.println(res);
        }

    }
}

