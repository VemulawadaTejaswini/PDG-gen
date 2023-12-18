import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author EigenFunk
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BNiceShopping solver = new BNiceShopping();
        solver.solve(1, in, out);
        out.close();
    }

    static class BNiceShopping {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int M = in.nextInt();
            int[] as = new int[A];
            int minA = Integer.MAX_VALUE;
            for (int i = 0; i < A; i++) {
                as[i] = in.nextInt();
                minA = Math.min(as[i], minA);
            }
            int[] bs = new int[B];
            int minB = Integer.MAX_VALUE;
            for (int i = 0; i < B; i++) {
                bs[i] = in.nextInt();
                minB = Math.min(bs[i], minB);
            }
            int min = minA + minB;
            for (int i = 0; i < M; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int c = in.nextInt();
                min = Math.min(as[x - 1] + bs[y - 1] - c, min);
            }
            out.println(min);
        }

    }
}

