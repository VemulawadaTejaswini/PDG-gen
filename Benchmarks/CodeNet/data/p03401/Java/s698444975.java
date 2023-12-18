import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC092C solver = new ABC092C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC092C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            int sum = 0;
            int prev = 0;
            for (int i = 0; i < N; i++) {
                sum += Math.abs(prev - A[i]);
                prev = A[i];
            }
            sum += Math.abs(prev);
            for (int i = 0; i < N; i++) {
                int ans = sum;
                int p = 0;
                int n = 0;
                if (i != 0) {
                    p = A[i - 1];
                }
                if (i != N - 1) {
                    n = A[i + 1];
                }
                ans -= Math.abs(p - A[i]);
                ans -= Math.abs(n - A[i]);
                ans += Math.abs(p - n);
                out.println(ans);
            }
        }

    }
}

