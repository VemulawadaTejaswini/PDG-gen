import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BCollectingBallsEasyVersion solver = new BCollectingBallsEasyVersion();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCollectingBallsEasyVersion {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) x[i] = in.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int mn = Math.min(x[i], k - x[i]);
                sum += 2 * mn;
            }
            out.println(sum);
        }

    }
}

