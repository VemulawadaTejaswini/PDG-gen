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
        CToInfinity solver = new CToInfinity();
        solver.solve(1, in, out);
        out.close();
    }

    static class CToInfinity {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            long k = in.nextLong() - 1;
            int i = 0;
            for (; k > 0; i++) {
                if (s[i] == '1') {
                    k--;
                } else {
                    break;
                }
            }
            out.println(s[i]);
        }

    }
}

