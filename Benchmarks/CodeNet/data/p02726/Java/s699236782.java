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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next()) - 1;
            int y = Integer.parseInt(in.next()) - 1;

            int cnt[] = new int[n];
//        Arrays.fill(cnt, 0);

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int dist = Math.min(j - i, Math.abs(x - i) + Math.abs(j - y) + 1);
//                int dist = j-i;
                    cnt[dist]++;
                }
            }
            for (int i = 1; i < n; i++) {
                out.println(cnt[i]);
            }

        }

    }
}

