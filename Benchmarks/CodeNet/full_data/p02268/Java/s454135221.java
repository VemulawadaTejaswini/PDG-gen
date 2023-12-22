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
        binarySearch solver = new binarySearch();
        solver.solve(1, in, out);
        out.close();
    }

    static class binarySearch {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int q = in.nextInt();
            int cnt = 0;
            for (int i = 0; i < q; i++) {
                int key = in.nextInt();
                int ng = -1;
                int ok = a.length;
                while (Math.abs(ok - ng) > 1) {
                    int mid = (ok + ng) / 2;
                    if (a[mid] >= key) {
                        ok = mid;
                    } else {
                        ng = mid;
                    }
                }
                if (a[ok] == key) cnt++;
            }
            out.println(cnt);
        }

    }
}


