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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            String s[] = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = in.next();
            }
            char c[] = new char[10];
            for (int i = 0; i < n; i++) {
                c = s[i].toCharArray();
                Arrays.sort(c);
                s[i] = String.valueOf(c);
            }
            long ans = 0;
            long cnt = 0;
            Arrays.sort(s);
            String tmp = s[0];

            for (int i = 1; i < n; i++) {
                if (tmp.equals(s[i])) {
                    cnt++;
                    ans += cnt;
                } else {
                    cnt = 0;
                    tmp = s[i];
                }
            }
            // 出力
            out.println(ans);

        }

    }
}

