import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BSimilarArrays solver = new BSimilarArrays();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSimilarArrays {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int[] a = new int[n];
            int res = (int) Math.pow(3, n);
            int min = 1;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (a[i] % 2 == 0) {
                    min *= 2;
                }
            }

            out.println(res - min);

        }

    }
}

