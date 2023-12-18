import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSpecialTrains solver = new CSpecialTrains();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSpecialTrains {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] c = new int[n - 1]; // 乗車時間
            int[] s = new int[n - 1]; // 開業時刻
            int[] f = new int[n - 1]; // 運転間隔
            for (int i = 0; i < n - 1; i++) {
                c[i] = in.nextInt();
                s[i] = in.nextInt();
                f[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                long time = 0;
                for (int j = i; j < n - 1; j++) {
                    if (time < s[j]) {
                        time = s[j];
                    }
                    time = (time + f[j] - 1) / f[j] * f[j];
                    time += c[j];
                }
                out.println(time);
            }
        }

    }
}

