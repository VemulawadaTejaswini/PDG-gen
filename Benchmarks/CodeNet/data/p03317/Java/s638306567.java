import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC101_C solver = new ABC101_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC101_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            int[] array = new int[n];
            int minIndex = 0;
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
                if (array[i] == 1) {
                    minIndex = i;
                }
            }

            int ans = 0;

            while ((k - 1) * ans + 1 < n) {
                ans++;
            }


//        if (minIndex <= k - 1) {
//            ans++;
//            minIndex = k - 1;
//        } else {
//            ans += minIndex / (k - 1);
//            if ((minIndex % (k - 1)) != 0) {
//                ans++;
//                minIndex += minIndex % (k - 1);
//            }
//        }
//
//        if (minIndex != n - 1) {
//            ans += (n - 1 - minIndex) / (k - 1);
//            if ((n - 1 - minIndex) % (k - 1) != 0) {
//                ans++;
//            }
//        }

            out.print(ans);
        }

    }
}

