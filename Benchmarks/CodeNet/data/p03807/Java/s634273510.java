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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            int cntodd = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                if (a[i] % 2 != 0) cntodd++;
            }
            boolean ok = true;
            if (cntodd % 2 != 0) ok = false;
            out.println(ok ? "YES" : "NO");

        }

    }
}

