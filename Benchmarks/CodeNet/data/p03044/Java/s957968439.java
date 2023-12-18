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
        EvenRelation solver = new EvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class EvenRelation {
        int[] result;
        long[][] route;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            route = new long[n + 1][n + 1];

            for (int i = 1; i < n; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                long w = in.nextLong();
                route[u][v] = w;
                route[v][u] = w;
            }
            result = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                if (result[i] == 0) {
                    dfs(i, 1);
                }
            }
            for (int i = 1; i <= n; i++) {
                if (result[i] == 1) {
                    out.println(1);
                } else {
                    out.println(0);
                }
            }
        }

        public void dfs(int v, int c) {
            result[v] = c;

            for (int i = 1; i < route.length; i++) {
                if (result[i] == 0) {
                    if (route[v][i] % 2 == 1) {
                        dfs(i, -c);
                    } else {
                        dfs(i, c);
                    }
                }
            }
        }

    }
}

