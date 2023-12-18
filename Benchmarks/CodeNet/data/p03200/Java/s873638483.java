import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

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
            int ans = 0;
            List<Integer> sum = new ArrayList<>();
            Integer s = 0;

            sum.add(0);
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'B') {
                    s++;
                } else {
                    sum.add(sum.get(sum.size() - 1) + s);
                }
            }
            Collections.sort(sum, Comparator.reverseOrder());
            ans = sum.get(0);
            // 出力
            out.println(ans);

        }

    }
}

