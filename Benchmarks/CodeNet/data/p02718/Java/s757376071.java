import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPopularVote solver = new BPopularVote();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPopularVote {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int sum = 0;
            int cnt = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }

            int hoge = (sum - 1 + 4 * m) / (4 * m);
            for (int i = 0; i < n; i++) {
                if (a[i] < hoge) {
                    continue;
                }
                cnt++;
            }

            out.println(cnt >= m ? "Yes" : "No");
        }

    }
}

