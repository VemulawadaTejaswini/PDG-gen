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
        RGBTriplets solver = new RGBTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class RGBTriplets {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] strings = in.next().toCharArray();

            int r = 0;
            int g = 0;
            int b = 0;
            for (int i = 0; i < n; i++) {
                if (strings[i] == 'R') {
                    r++;
                }
                if (strings[i] == 'G') {
                    g++;
                }
                if (strings[i] == 'B') {
                    b++;
                }
            }
            long result = r * g * b;
            for (int i = 0; i < n; i++) {
                char ci = strings[i];

                for (int j = i + 1; j < n; j++) {
                    char cj = strings[j];
                    if (ci == cj) {
                        continue;
                    }
                    int k = 2 * j - i;
                    if (strings.length <= k) {
                        continue;
                    }

                    char ck = strings[k];
                    if (ci == ck || cj == ck) {
                        continue;
                    }
                    result--;
                }
            }

            out.append(String.valueOf(result));
        }

    }
}

