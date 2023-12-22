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
        ABC170_d1 solver = new ABC170_d1();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC170_d1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int A[] = new int[N];
            int computed[] = new int[1000005];

            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            for (int x : A) {
                if (computed[x] != 0) {
                    computed[x] = 2;
                    continue;
                }
                for (int i = x; i < 1000005; i += x) {
                    computed[i]++;
                }
            }
            int ans = 0;
            for (int x : A) {
                if (computed[x] == 1) {
                    ans++;
                }
            }
            out.println(ans);

        }

    }
}

