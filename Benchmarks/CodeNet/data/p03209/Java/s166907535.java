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
        ABC115_D solver = new ABC115_D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC115_D {
        static private long cnted = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextLong();

//        height(n, height);
//        paties(n, paties);

            long ans = 0;

            ans = answer(n, ans, x);
            out.print(ans);
        }

        private long answer(int n, long ans, long x) {
            if (n == 0) {
                return ans++;
            }

            cnted++;
            if (cnted >= x) {
                return ans;
            }


            ans += answer(n - 1, ans, x);

            cnted++;
            if (cnted == x) {
                return ans++;
            } else {
                if (cnted > x) {
                    return ans;
                }
            }

            ans += answer(n - 1, ans, x);

            cnted++;
            if (cnted == x) {
                return ans;
            } else {
                if (cnted > x) {
                    return ans;
                }
            }

            return ans;
        }

    }
}

