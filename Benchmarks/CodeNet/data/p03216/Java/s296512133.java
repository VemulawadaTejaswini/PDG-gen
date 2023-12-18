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

            for (int i = 0; i < q; i++) {
                klist[i] = in.nextInt();
            }

            for (int k : klist) {
                long ans = 0;
                for (int left = 0; left < n; ++left) {
                    int right = left;
                    while (right < n && (right - left) < k) {
                        if (2 <= (right - left)) {
                            String subStr = str.substring(left, right + 1);
                            if (subStr.charAt(0) == 'D' &&
                                    subStr.charAt(subStr.length() - 1) == 'C') {
                                int count = 0;
                                //out.println(left+","+right);
                                for (int i = 0; i < subStr.length(); i++) {
                                    if (subStr.charAt(i) == 'M') {
                                        count++;
                                    }
                                }
                                ans += count;
                            }
                        }
                        ++right;
                    }
                }
                out.println(ans);
            }


        }

    }
}

