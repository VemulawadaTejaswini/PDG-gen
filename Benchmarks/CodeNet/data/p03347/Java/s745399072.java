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
        CSequenceGrowingEasy solver = new CSequenceGrowingEasy();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSequenceGrowingEasy {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
            }
            long res = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    if (ar[0] != 0) {
                        res = -1;
                        break;
                    }
                } else {
                    if (ar[i] - ar[i - 1] > 1) {
                        res = -1;
                        break;
                    } else {
                        if (ar[i] - ar[i - 1] == 1) {
                            res++;
                        } else {
                            res += ar[i];
                        }
                    }
                }
            }
            out.println(res);
        }

    }
}

