import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aeroui
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
            int n = in.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; ++i) {
                arr[i] = in.nextInt();
            }

            boolean[] vis = new boolean[n + 1];
            int cur = 1;
            int ans = 0;
            while (cur != 2 && !vis[cur]) {
                vis[cur] = true;
                cur = arr[cur];
                ++ans;
            }

            out.println(cur != 2 ? -1 : ans);

        }

    }
}

