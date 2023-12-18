import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        AAirportBus solver = new AAirportBus();
        solver.solve(1, in, out);
        out.close();
    }

    static class AAirportBus {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 乗る人数
            int n = in.nextInt();
            // 乗せられる人数
            int c = in.nextInt();
            // 待てる時間
            int k = in.nextInt();
            int[] t = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = in.nextInt();
            }

            Arrays.sort(t);

            // out.println(Arrays.toString(t));

            int cnt = 0;
            int got = 0;
            long time = t[0] + k;
            while (got < n) {
                int ninzu = 0;
                cnt++;
                while (t[got] <= time) {
                    ninzu++;
                    got++;
                    if (got == n) {
                        out.println(cnt);
                        return;
                    }
                    if (ninzu == c) {
                        break;
                    }
                }
                // out.println(time + " " + got);
                time = t[got] + k;
            }


        }

    }
}

