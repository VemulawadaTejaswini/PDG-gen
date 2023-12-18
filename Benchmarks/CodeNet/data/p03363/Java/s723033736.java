import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

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
        AZeroSumRanges solver = new AZeroSumRanges();
        solver.solve(1, in, out);
        out.close();
    }

    static class AZeroSumRanges {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            HashMap<Long, Integer> hm = new HashMap<>();
            long ad = 0;
            long res = 0;
            hm.put(ad, 1);
            for (int i = 0; i < n; i++) {
                ad += in.nextLong();
                hm.merge(ad, 1, Integer::sum);
            }


            for (int i : hm.values()) {
                long j = i;
                res += (j * j - j) / 2;
            }
            out.println(res);

        }

    }
}

