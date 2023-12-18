import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        TaskGC solver = new TaskGC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskGC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            int[] inp = new int[n];
            for (int i = 0; i < n; i++) {
                inp[i] = in.nextInt();
            }

            int[] sorted = new int[n];
            for (int i = 0; i < n; i++) {
                sorted[i] = inp[i];
            }
            Arrays.sort(sorted);

            int numOps = 0;
            for (int i = 0; i < n; i++) {
                int a = inp[i];
                int idx = Arrays.binarySearch(sorted, a);

                int diff = Math.abs(idx - i);
                if (diff % 2 != 0) {
                    numOps++;
                }
            }
            out.println(numOps / 2);
        }
    }
}
