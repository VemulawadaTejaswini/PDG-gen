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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            int res = cnt_753(n, 0);


            out.println(res);
        }

        public static int cnt_753(int n, long x) {
            int res = 0;
            int[] _753 = {7, 5, 3};
            int[] cnt = new int[3];
            if (x > n) {
                return 0;
            }
            for (int i = 0; i < Integer.toString((int) x).length(); i++) {
                if (Integer.toString((int) x).charAt(i) == '3') {
                    cnt[0]++;
                }
                if (Integer.toString((int) x).charAt(i) == '5') {
                    cnt[1]++;
                }
                if (Integer.toString((int) x).charAt(i) == '7') {
                    cnt[2]++;
                }
            }
            if (cnt[0] > 0 && cnt[1] > 0 && cnt[2] > 0) {
                res++;
            }

            for (int i = 0; i < 3; i++) {
                res += cnt_753(n, x * 10 + _753[i]);
            }
            return res;
        }

    }
}

