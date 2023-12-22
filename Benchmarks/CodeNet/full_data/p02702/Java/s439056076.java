import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MultipleOf2019 solver = new MultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class MultipleOf2019 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            char[] chars = in.next().toCharArray();
            long[] count = new long[2019];

            int base = 1;
            int pre = 0;
            for (int i = chars.length - 1; i >= 0; i--) {
                int a = Character.getNumericValue(chars[i]);
                int current = (a * base + pre) % 2019;
                count[current]++;
                pre = current;
                base = (base * 10) % 2019;
            }
            long ans = 0;
            for (long c : count) {
                ans += (c * (c - 1) / 2);
            }
            if (count[0] > 0) {
                ans += count[0];
            }
            out.append(String.valueOf(ans));
        }

    }
}

