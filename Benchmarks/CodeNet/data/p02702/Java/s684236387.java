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
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long[] mod = new long[2019];
            String s = in.next();
            long n = 0;
            mod[0]++;
            int pow = 1;
            for (int i = 0; i < s.length(); i++) {
                n = (n + (s.charAt(s.length() - 1 - i) - '0') * pow) % 2019;
                mod[(int) n]++;
                pow = pow * 10 % 2019;
            }
            long sum = 0;
            for (long l : mod) {
                sum += l * (l - 1) / 2;
            }
            out.println(sum);
        }

    }
}

