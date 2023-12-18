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
            String S = in.next();
            long K = in.nextLong();

            if (S.length() == 1) {
                out.println(K / 2);
                return;
            }

            char[] cs = S.toCharArray();
            long cnt = 0;
            for (int i = 0; i < cs.length - 1; i++) {
                if (cs[i] == cs[i + 1]) {
                    cnt++;
                    i++;
                }
            }
            cnt *= K;
            out.println(cnt);
        }

    }
}

