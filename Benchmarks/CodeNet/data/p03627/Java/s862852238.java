import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            long mx1 = 0;
            long mx2 = 0;
            Arrays.sort(a);
            for (int i = a.length - 1; i > 0; i--) {
                if (a[i] == a[i - 1]) {
                    if (mx1 == 0) {
                        mx1 = a[i];
                        i--;
                    } else {
                        mx2 = a[i];
                        break;
                    }
                }
            }
            out.println(mx1 * mx2);
        }

    }
}

