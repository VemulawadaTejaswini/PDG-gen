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
        APC001B solver = new APC001B();
        solver.solve(1, in, out);
        out.close();
    }

    static class APC001B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long aSum = 0;
            long bSum = 0;
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                aSum += a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                bSum += b[i];
            }

            if (aSum > bSum) {
                out.println("No");
                return;
            }

            long count = bSum - aSum;
            int filled = 0;
            long countA = count;

            while (countA > 0) {
                if (filled < n) {
                    if (a[filled] < b[filled]) {
                        a[filled] += 2;
                        countA--;
                    } else {
                        filled++;
                    }
                } else {
                    a[0] += 2;
                    countA--;
                }
            }

            filled = 0;
            while (count > 0) {
                if (filled < n) {
                    if (b[filled] < a[filled]) {
                        b[filled] += 1;
                        count--;
                    } else {
                        filled++;
                    }
                } else {
                    b[0] += 1;
                    count--;
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
        }

    }
}

