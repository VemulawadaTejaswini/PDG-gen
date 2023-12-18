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
        abc159_a solver = new abc159_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc159_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int buf[] = new int[101];

            int cntM = 0;
            int cntN = 0;

            for (int i = 1; i <= 100; i++) {
                if ((i % 2) == 0) {
                    if (cntN < N) {
                        cntN++;
                        buf[i] = i;
                    }
                } else {
                    if (cntM < M) {
                        cntM++;
                        buf[i] = i;
                    }
                }
            }

            int cnt = 0;
            for (int i = 1; i <= 100; i++) {
                for (int j = i + 1; j <= 100; j++) {
                    if ((buf[i] != 0) && (buf[j] != 0)) {
                        if ((buf[i] + buf[j]) % 2 == 0) {
                            cnt++;
                        }
                    }
                }
            }
            out.println(cnt);
        }

    }
}

