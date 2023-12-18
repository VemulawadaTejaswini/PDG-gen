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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int T = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int cnt = 0;
            int max = A[N - 1];
            int diff = 0;
            for (int i = N - 2; i >= 0; i--) {
                if (A[i] > A[i + 1]) {
                    max = A[i];
                } else if (A[i] < A[i + 1]) {
                    if (diff == max - A[i]) {
                        cnt++;
                    } else if (diff < max - A[i]) {
                        diff = max - A[i];
                        cnt = 1;
                    }
                }
            }
            out.println(cnt);
        }

    }
}

