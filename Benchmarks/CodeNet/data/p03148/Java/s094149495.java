import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            int N = in.nextInt();
            int K = in.nextInt();
            int[][] sushi = new int[N][2];
            for (int i = 0; i < N; i++) {
                sushi[i] = new int[]{in.nextInt(), in.nextInt()};
            }
            Arrays.sort(sushi, (a, b) -> Integer.compare(b[1], a[1]));

            int[] count = new int[N + 1];
            long kind = 0;
            long sum = 0;
            for (int i = 0; i < K; i++) {
                sum += sushi[i][1];
                count[sushi[i][0]]++;
                if (count[sushi[i][0]] == 1) {
                    kind++;
                }
            }

            long max = sum + kind * kind;
            for (int i = K; i < N; i++) {
                if (count[sushi[i][0]] == 0) {
                    int index = -1;
                    for (int j = 0; j < i; j++) {
                        if (count[sushi[j][0]] > 1) {
                            index = j;
                        }
                    }
                    if (index == -1) {
                        break;
                    }
                    count[sushi[index][0]]--;
                    sum += (sushi[i][1] - sushi[index][1]);
                    kind++;
                    max = Math.max(max, sum + kind * kind);
                }
            }

            out.println(max);
        }

    }
}

