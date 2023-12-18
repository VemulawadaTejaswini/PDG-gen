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
        RainFlowsintoDams solver = new RainFlowsintoDams();
        solver.solve(1, in, out);
        out.close();
    }

    static class RainFlowsintoDams {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] dams = new long[n];
            for (int i = 0; i < n; i++) {
                dams[i] = 2 * in.nextLong();
            }

            long mini = dams[0];
            int mini_pos = 0;
            for (int i = 1; i < n; i++) {
                if (mini > dams[i]) {
                    mini = dams[i];
                    mini_pos = i;
                }
            }

            for (long i = dams[mini_pos]; 0 <= i; i = i - 2) {
                long[] mountains = new long[n];
                mountains[mini_pos] = i;
                for (int j = 1; j < n; j++) {
                    int pos = mini_pos + j;
                    if (n - 1 < pos) {
                        pos -= n;
                    }
                    int pos2 = pos - 1;
                    if (pos2 < 0) {
                        pos2 += n;
                    }
                    mountains[pos] = dams[pos2] - mountains[pos2];
                }
                int pos3 = mini_pos - 1;
                if (pos3 < 0) {
                    pos3 += n;
                }
                if (mountains[pos3] == dams[pos3] - mountains[mini_pos]) {
                    for (int k = 0; k < n; k++) {
                        out.print(mountains[k] + " ");
                    }
                }
            }
        }

    }
}

