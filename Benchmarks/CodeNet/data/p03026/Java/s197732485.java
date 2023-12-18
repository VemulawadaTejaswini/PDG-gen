import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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

            int[][] line = new int[N - 1][2];
            int[][] count = new int[N + 1][2];
            for (int i = 0; i < N - 1; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (b < a) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                line[i] = new int[]{a, b};
                if (count[a][0] == 0) {
                    count[a] = new int[]{a, 1};
                } else {
                    count[a][1]++;
                }
                if (count[b][0] == 0) {
                    count[b] = new int[]{b, 1};
                } else {
                    count[b][1]++;
                }
            }
            Arrays.sort(count, Comparator.comparingInt(a -> a[1]));

            int[] c = new int[N];
            for (int i = 0; i < N; i++) {
                c[i] = in.nextInt();
            }
            Arrays.sort(c);

            int[] values = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                values[count[i][0]] = c[i - 1];
            }

            int[] anss = new int[N + 1];
            for (int i = 0; i < N - 1; i++) {
                int a = line[i][0];
                int b = line[i][1];
                anss[i] = Math.min(values[a], values[b]);
            }

            out.println(Arrays.stream(anss).sum());
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                sb.append(values[i]).append(' ');
            }
            out.println(sb.toString().trim());
        }

    }
}

