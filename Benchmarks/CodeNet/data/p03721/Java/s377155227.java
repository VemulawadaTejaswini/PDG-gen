import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        CBigArray solver = new CBigArray();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBigArray {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();
            CBigArray.Pair[] pairs = new CBigArray.Pair[n];
            for (int i = 0; i < n; i++) {
                pairs[i] = new CBigArray.Pair(in.nextInt(), in.nextInt());
            }
            Arrays.sort(pairs);
            for (CBigArray.Pair p : pairs) {
                k -= p.b;
                if (k <= 0) {
                    out.println(p.a);
                    return;
                }
            }
        }

        private static class Pair implements Comparable<CBigArray.Pair> {
            int a;
            int b;

            public Pair(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public int compareTo(CBigArray.Pair o) {
                return Integer.compare(this.a, o.a);
            }

        }

    }
}

