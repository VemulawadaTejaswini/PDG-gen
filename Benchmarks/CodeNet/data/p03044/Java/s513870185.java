import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.AbstractCollection;
import java.util.Scanner;
import java.util.LinkedList;

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
            int N = in.nextInt();
            int[][] lines = new int[N - 1][3];

            for (int i = 0; i < N - 1; i++) {
                int v1 = in.nextInt();
                int v2 = in.nextInt();
                long w = in.nextLong();
                lines[i] = new int[]{v1, v2, (int) (w % 2)};
            }
            Arrays.sort(lines, (x, y) -> {
                if (x[0] != y[0]) {
                    return Integer.compare(x[0], y[0]);
                }
                return Integer.compare(x[1], y[1]);
            });

            boolean[] black = new boolean[N + 1];
            Arrays.fill(black, false);
            LinkedList<Integer> que = new LinkedList<>();
            que.add(1);
            while (!que.isEmpty()) {
                int current = que.removeFirst();
                for (int i = 0; i < N - 1; i++) {
                    if (lines[i][0] == current) {
                        que.add(Integer.valueOf(lines[i][1]));
                        if (lines[i][2] == 1 && !black[current]) {
                            black[lines[i][1]] = true;
                        }
                    }
                }
            }
            for (int i = 1; i <= N; i++) {
                out.println(black[i] ? 1 : 0);
            }
        }

    }
}

