import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CManyMedians solver = new CManyMedians();
        solver.solve(1, in, out);
        out.close();
    }

    static class CManyMedians {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = IntStream.range(0, n).map(o -> in.nextInt()).toArray();
            int[] s = Arrays.stream(x).sorted().toArray();
            int c = (n - 1) / 2;
            int m = s[c];
            for (int i = 0; i < n; i++) {
                if (x[i] > m) {
                    out.println(m);
                } else {
                    out.println(s[c + 1]);
                }
            }
        }

    }
}

