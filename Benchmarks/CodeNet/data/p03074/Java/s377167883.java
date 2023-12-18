import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.next();
            ArrayList<Integer> zero = new ArrayList<>();
            ArrayList<Integer> ichi = new ArrayList<>();
            int zc = 0;
            int zi = 0;
            int max = 0;
            if (s.charAt(0) == '0') {
                ichi.add(0);
            }
            for (int i = 0; i < s.length(); i++) {
                final boolean f = i > 0 && s.charAt(i) != s.charAt(i - 1);
                if (s.charAt(i) == '0') {
                    zc++;
                    if (f) {
                        ichi.add(zi);
                        zi = 0;
                    }
                } else {
                    zi++;
                    if (f) {
                        zero.add(zc);
                        zc = 0;
                    }
                }
            }
            if (zi != 0) {
                ichi.add(zi);
            } else {
                zero.add(zc);
            }

            if (s.charAt(s.length() - 1) == '0') {
                ichi.add(0);
            }

            if (zero.size() <= k) {
                out.println(n);
            } else {
                // out.println(zero.toString());
                // out.println(ichi.toString());
                int sum = 0;
                for (int i = 0; i < k; i++) {
                    sum += zero.get(i);
                    sum += ichi.get(i);
                }
                sum += ichi.get(k);
                max = sum;
                //out.println(sum);
                for (int i = k; i < zero.size(); i++) {
                    sum -= zero.get(i - k) + ichi.get(i - k);
                    sum += zero.get(i) + ichi.get(i + 1);
                    max = Math.max(max, sum);
                    //out.println(sum);
                }
                out.println(max);

            }

        }

    }
}

