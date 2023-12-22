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
        Shopping solver = new Shopping();
        solver.solve(1, in, out);
        out.close();
    }

    static class Shopping {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            Set<Integer> se = new HashSet<>();
            for (int i = 0; i < M; i++) {
                int c = in.nextInt() - 1;
                int d = in.nextInt() - 1;
                for (int j = c; j < d; j++) {
                    se.add(j);
                }
            }
            int ans = 0;
            for (int i = 0; i <= N; i++) {
                if (se.contains(i)) {
                    ans += 2;
                }
                ans++;
            }
            out.println(ans);
        }

    }
}


