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
        ABC104_B solver = new ABC104_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC104_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String ans = "AC";
            if (s.charAt(0) != 'A') {
                ans = "WA";
            }

            String sub = s.substring(2, s.length() - 1);

            int cnt = 0;
            for (char c : sub.toCharArray()) {
                if (c == 'C') {
                    cnt++;
                }
            }
            if (cnt != 1) {
                ans = "WA";
            }


            for (char c : s.toCharArray()) {
                if (c != 'A' && c != 'C') {
                    if (!Character.isLowerCase(c)) {
                        ans = "WA";
                    }
                }
            }


            out.print(ans);

        }

    }
}

