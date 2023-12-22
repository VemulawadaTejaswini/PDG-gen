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
        abc166_b solver = new abc166_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc166_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int sunuke[] = new int[N];
            for (int i = 0; i < K; i++) {
                int d = in.nextInt();
                for (int j = 0; j < d; j++) {
                    int sunuidx = in.nextInt() - 1;
                    sunuke[sunuidx]++;
                }
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (sunuke[i] == 0) {
                    count++;
                }
            }
            out.println(count);

        }

    }
}

