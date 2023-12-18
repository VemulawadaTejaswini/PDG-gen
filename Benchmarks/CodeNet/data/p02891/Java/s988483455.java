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
            int from = -1;
            int to = s.length();
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    from = i;
                    break;
                }
            }
            if (from == -1) {
                long ans = 1L * s.length() * k / 2;
                out.println(ans);
                return;
            }
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    to = i + 1;
                }
            }
            long ans = 0;
            for (int i = from; i < to; i++) {
                if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                    ans += k;
                    i++;
                }
            }
            int pref = from;
            int suff = (s.length() - to);
            ans += pref / 2;
            ans += suff / 2;
            ans += 1L * (pref + suff) / 2 * (k - 1);


            out.println(ans);
        }

    }
}

