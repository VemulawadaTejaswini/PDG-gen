import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
            Set<Character> S = new HashSet<>();
            char[] a = in.next().toCharArray();
            for (int i = 0; i < a.length; i++) {
                S.add(a[i]);
            }
            int ans = S.size();

            // 出力
            boolean ok = false;
            if (ans == 2) ok = true;
            out.println(ok ? "Yes" : "No");

        }

    }
}

