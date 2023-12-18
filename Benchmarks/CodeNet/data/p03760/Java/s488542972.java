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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String o = in.next();
            String e = in.next();
            int idx = 0;
            if (o.length() >= e.length()) {
                idx = o.length() * 2;
            } else {
                idx = e.length() * 2 + 1;
            }
            char oarr[] = new char[idx];
            char earr[] = new char[idx];
            oarr = o.toCharArray();
            earr = e.toCharArray();

            char ans[] = new char[idx];

            int j = 0;
            for (int i = 0; i < o.length(); i++) {
                ans[j] = oarr[i];
                j += 2;
            }
            j = 1;
            for (int i = 0; i < e.length(); i++) {
                ans[j] = earr[i];
                j += 2;
            }

            out.println(String.valueOf(ans).trim());
        }

    }
}

