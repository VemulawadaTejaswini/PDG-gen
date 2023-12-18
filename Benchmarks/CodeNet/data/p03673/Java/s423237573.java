import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author bcools
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] l = new int[n];
            int[] result = new int[n];
            for (int i = 0; i < n; ++i) {
                l[i] = in.nextInt();
            }
            int beginIndex = 0;
            int endIndex = n - 1;
            boolean putBegin = true;
            for (int i = n - 1; i >= 0; --i) {
                if (putBegin) {
                    result[beginIndex++] = l[i];
                } else {
                    result[endIndex--] = l[i];
                }
                putBegin = !putBegin;
            }
            for (int i = 0; i < n; ++i) {
                if (i > 0) out.print(" ");
                out.print(result[i]);
            }
        }

    }
}

