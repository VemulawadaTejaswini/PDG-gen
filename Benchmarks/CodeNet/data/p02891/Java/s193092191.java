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
        AConnectionAndDisconnection solver = new AConnectionAndDisconnection();
        solver.solve(1, in, out);
        out.close();
    }

    static class AConnectionAndDisconnection {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int k = in.nextInt();
            if (s.length() == 1) {
                out.println(k / 2);
                return;
            }
            long ans = 0;
            for (int i = 1; i <= s.length(); i++) {
                if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                    ans += k;
                    i++;
                } else if (i == s.length() && s.charAt(s.length() - 1) == s.charAt(0)) {
                    ans += k - 1;
                }
            }
            out.println(ans);
        }

    }
}

