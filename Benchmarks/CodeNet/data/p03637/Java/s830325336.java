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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            boolean ok = false;
            int odd = 0;
            int mo4 = 0;
            int one = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) one++;
                if (a[i] % 2 != 0) odd++;
                if (a[i] % 4 == 0) mo4++;
            }
            if (mo4 != 0 && ((n - mo4) == one || odd == mo4)) ok = true;

            out.println(ok ? "Yes" : "No");

        }

    }
}

