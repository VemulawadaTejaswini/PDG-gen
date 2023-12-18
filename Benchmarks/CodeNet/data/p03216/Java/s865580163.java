import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
        Dowango_C solver = new Dowango_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class Dowango_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            String str = in.next();
            int q = in.nextInt();
            int[] klist = new int[q];
            ArrayList<DMC> dmcList = new ArrayList<DMC>();
            for (int i = 0; i < q; i++) {
                klist[i] = in.nextInt();
            }
            for (int left = 0; left < n; ++left) {
                int right = left;
                while (right < n && (right - left) < n) {
                    if (2 <= (right - left)) {
                        String subStr = str.substring(left, right + 1);
                        if (subStr.charAt(0) == 'D' &&
                                subStr.charAt(subStr.length() - 1) == 'C') {
                            int count = 0;
                            for (int i = 0; i < subStr.length(); i++) {
                                if (subStr.charAt(i) == 'M') {
                                    count++;
                                }
                            }
                            if (count >= 1) {
                                DMC dmc = new DMC(left, right, count);
                                dmcList.add(dmc);
                            }
                        }
                    }
                    ++right;
                }
            }

            for (int k : klist) {
                long ans = 0;
                for (DMC dmc : dmcList) {
                    if (dmc.length() < k) {
                        ans += dmc.m;
                    }
                }
                out.println(ans);
            }

        }

        public class DMC {
            int left;
            int right;
            int m;

            DMC(int left, int right, int m) {
                this.left = left;
                this.right = right;
                this.m = m;
            }

            int length() {
                return right - left;
            }

        }

    }
}

