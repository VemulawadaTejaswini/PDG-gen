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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static final int SIZE = (int) 1e5 + 100;
        static boolean[] isPrime = new boolean[SIZE];
        static int[] similarCount = new int[SIZE];

        static {
            Arrays.fill(isPrime, true);
            isPrime[1] = false;
            for (int i = 2; i * i < SIZE; i++) {
                if (!isPrime[i]) continue;
                for (int j = 2, mul = j * i; mul < SIZE; j++, mul = j * i) {
                    isPrime[mul] = false;
                }
            }
            similarCount[0] = similarCount[1] = 0;
            for (int i = 3; i < SIZE; i += 2) {
                if (isPrime[i] && isPrime[(i + 1) / 2]) similarCount[i] = similarCount[i - 2] + 1;
                else similarCount[i] = similarCount[i - 2];
            }
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int l = in.nextInt(), r = in.nextInt();
                out.println(similarCount[r] - similarCount[Math.max(0, l - 2)]);
            }
        }

    }
}

