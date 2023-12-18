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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            long[] cnt = new long[5];
            String march = "MARCH";
            for (int i = 0; i < N; i++) {
                char ini = in.next().charAt(0);
                int find = march.indexOf(ini);
                if (find > -1) {
                    cnt[find]++;
                }
            }
            long ans = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 5; j++) {
                    for (int k = j + 1; k < 5; k++) {
                        ans += cnt[i] * cnt[j] * cnt[k];
                    }
                }
            }
            out.println(ans);
        }

    }
}

