import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aeroui
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int N;
        int A;
        int B;
        int[] h;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            N = in.nextInt();
            A = in.nextInt();
            B = in.nextInt();

            h = new int[N];
            int max = 0;
            for (int i = 0; i < N; i++) {
                h[i] = in.nextInt();
                max = Math.max(h[i], max);
            }

            int left = 0;
            int right = max;
            int mid = 0;
            while (right - left > 1) {
                mid = (right + left) >> 1;
                if (!check(mid, out)) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }

            out.println(left);
        }

        private boolean check(int mid, PrintWriter out) {
            int value = 0;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                long tmp = h[i] - 1l * B * mid;

                if (tmp > 0) {
                    cnt++;
                    value = h[i];
                }

                //out.println(cnt + " "+mid);

                if (cnt >= 2) return false;
            }


            if (cnt == 0) return true;
            return (value - mid * A) <= 0;
        }

    }
}

