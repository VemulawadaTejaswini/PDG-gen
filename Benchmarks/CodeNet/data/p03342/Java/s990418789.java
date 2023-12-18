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
        DXorSum2 solver = new DXorSum2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXorSum2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 尺取りしていけばいい
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            long cnt = 0;
            long xor = 0;
            long sum = 0;
            int l = 0;
            for (int i = 0; i < n; i++) {
                xor = xor ^ a[i];
                sum = sum + a[i];
                while (xor != sum) {
                    xor = xor ^ a[l];
                    sum = sum - a[l];
                    l++;
                }
                cnt += i - l + 1;
            }
            out.println(cnt);

        }

    }
}

