import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.ArrayList;

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
        CKnotPuzzle solver = new CKnotPuzzle();
        solver.solve(1, in, out);
        out.close();
    }

    static class CKnotPuzzle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int len = in.nextInt();
            long[] a = new long[n];
            long sum = 0;
            int l = 0;
            int r = n - 1;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                sum += a[i];
            }
            ArrayList<Integer> res = new ArrayList<>();

            while (l < r) {
                if (sum < len) {
                    System.out.println("Impossible");
                    return;
                }
                if (a[l] < a[r]) {
                    sum -= a[l];
                    l++;
                    res.add(l);
                } else {
                    sum -= a[r];
                    res.add(r);
                    r--;
                }
            }

            out.println("Possible");
            for (Integer i : res) {
                out.println(i);
            }

        }

    }
}

