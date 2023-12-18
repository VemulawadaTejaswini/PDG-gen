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
            String S = in.next();
            //N:0,W:1,S:2,E:3
            int[] cnt = new int[4];
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'N') cnt[0]++;
                if (S.charAt(i) == 'W') cnt[1]++;
                if (S.charAt(i) == 'S') cnt[2]++;
                if (S.charAt(i) == 'E') cnt[3]++;
            }
            boolean ok = false;
            if (cnt[0] > 0 && cnt[2] > 0 && cnt[1] == 0 && cnt[3] == 0) ok = true;
            if (cnt[0] == 0 && cnt[2] == 0 && cnt[1] > 0 && cnt[3] > 0) ok = true;
            if (cnt[0] > 0 && cnt[2] > 0 && cnt[1] > 0 && cnt[3] > 0) ok = true;

            out.println(ok ? "Yes" : "No");

        }

    }
}

