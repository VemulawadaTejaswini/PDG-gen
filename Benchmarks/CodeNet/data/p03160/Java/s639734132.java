import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AFrog1 solver = new AFrog1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFrog1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = in.nextInt();
            }

            int costPrev = Math.abs(h[1] - h[0]);
            int costPrevPrev = 0;
            for (int i = 2; i < N; i++) {
                int cost = Math.min(
                        costPrev + Math.abs(h[i] - h[i - 1]),
                        costPrevPrev + Math.abs(h[i] - h[i - 2]));
                costPrevPrev = costPrev;
                costPrev = cost;
            }
            out.println(costPrev);
        }

    }
}

