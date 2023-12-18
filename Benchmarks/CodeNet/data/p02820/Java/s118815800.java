import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        DPredictionAndRestriction solver = new DPredictionAndRestriction();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPredictionAndRestriction {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int k = in.nextInt();
            int[] score = new int[3];
            boolean[] changed = new boolean[n];
            Arrays.fill(changed, false);
            score[1] = in.nextInt();
            score[2] = in.nextInt();
            score[0] = in.nextInt();
            String rsp = "rsp";
            String s = in.next();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i >= k && s.charAt(i) == s.charAt(i - k) && !changed[i - k]) {
                    changed[i] = true;
                    continue;
                }
                res += score[rsp.indexOf(s.charAt(i))];
            }
            out.println(res);

        }

    }
}

