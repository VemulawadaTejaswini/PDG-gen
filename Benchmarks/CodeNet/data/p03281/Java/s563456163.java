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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = Integer.parseInt(in.next());
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) continue;
                int cnt = 0;
                for (int j = 1; j <= N; j++) {
                    if (i % j == 0) cnt++;
                }
                if (cnt == 8) {
                    ans++;
                }
            }
            out.println(ans);
        }

    }
}

