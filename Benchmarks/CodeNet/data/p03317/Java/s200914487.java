import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMinimization solver = new CMinimization();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMinimization {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] arr = new int[N];
            int cur = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
                if (arr[i] == 1)
                    cur = i;
            }
            int res = 0;
            if (cur - K + 1 < 0)
                cur += -(cur - K + 1);
            int tmp = cur;
            while (tmp > 0) {
                tmp -= K - 1;
                res++;
            }
            tmp = cur;
            while (tmp <= N - 1 || arr[N - 1] != 1) {
                tmp += K - 1;
                res++;
            }
            out.println(res);
        }

    }
}

