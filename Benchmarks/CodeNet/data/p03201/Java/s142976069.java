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
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPowersOfTwo solver = new BPowersOfTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPowersOfTwo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // input
            int n = in.nextInt();
            int[] a = new int[n];
            int[] jump = new int[n];

            int ans = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            Arrays.fill(jump, 0);
            for (int i = a.length - 1; i >= 1; i--) {
                // 二分探索で一つ上のを探す
                // 一回当たりlogNだから全体で N*logN が上界
                int target = 1;
                while (target <= a[i]) {
                    target *= 2;
                }
                target -= a[i];
                // targetを二分探索で探す

                int low = 0;
                int high = i - 1;
                int mid = (low + high) / 2;
                while (high != low) {
                    if (a[mid] < target) {
                        low = mid + 1;
                    } else if (a[mid] > target) {
                        high = mid - 1;
                    } else {
                        high = mid;
                    }
                    mid = (low + high) / 2;
                }

                if (a[high] == target && a[high + jump[high]] == target) {
                    jump[high]++;
                    ans++;
                }

            }
            out.println(ans);


        }

    }
}

