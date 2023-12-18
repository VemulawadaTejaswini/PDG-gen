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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        long C(long n, long k) {
            long min = Math.min((n - k), k);
            long max = Math.max((n - k), k);
            long acc = 1;
            for (long i = n; i > max; i--) {
                acc *= i;
            }
            for (long i = min; i > 1; i--) {
                acc /= i;
            }
            return acc;
        }

        long anyEvens(long e) {
            long res = 0;
            for (long i = 1; i <= e; i++) {
                res += C(e, i);
            }
            return res + 1;
        }

        long ctOdds(long e, long p) {
            long res = 0;
            for (long i = 1; i <= e; i++) {
                if ((i) % 2 == p % 2) res += C(e, i);
            }
            if (0 == p % 2) res++;
            return res;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextInt();
            long P = in.nextInt();
            long odds = 0;
            long evens = 0;
            for (long i = 0; i < N; i++) {
                long a = in.nextInt();
                if (0 == a % 2) evens++;
                else odds++;
            }
            long result;
            result = anyEvens(evens) * ctOdds(odds, P);

            out.println(result);


        }

    }
}

