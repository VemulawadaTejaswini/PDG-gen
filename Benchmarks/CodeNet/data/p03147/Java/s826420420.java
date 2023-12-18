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
        ABC116_C solver = new ABC116_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC116_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int h[] = new int[n];
            int ans = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                h[i] = in.nextInt();
                max = Math.max(max, h[i]);
            }
            int startIndex = 0;
            int endIndex = h.length - 1;
            for (int i = startIndex; i <= endIndex; i++) {
                if (h[i] != 0) {
                    startIndex = i;
                    break;
                }
            }

            for (int i = endIndex; startIndex <= i; i--) {
                if (h[i] != 0) {
                    endIndex = i;
                    break;
                }
            }
            boolean repeatingZero = false;
            while (max > 0) {
                for (int i = startIndex; i <= endIndex; i++) {
                    if (h[i] == 0 && !repeatingZero) {
                        ans++;
                        repeatingZero = true;
                    }

                    if (h[i] != 0 && repeatingZero) {
                        repeatingZero = false;
                    }

                    if (h[i] > 0) {
                        h[i]--;
                    }
                }

                ans++;

                for (int i = startIndex; i <= endIndex; i++) {
                    if (h[i] != 0) {
                        startIndex = i;
                        break;
                    }
                }

                for (int i = endIndex; startIndex <= i; i--) {
                    if (h[i] != 0) {
                        endIndex = i;
                        break;
                    }
                }

                max--;
            }

            out.print(ans);

        }

    }
}

