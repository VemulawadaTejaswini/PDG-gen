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
        long C(int n, int k) {
            int min = Math.min((n - k), k);
            int max = Math.max((n - k), k);
            long acc = 1;
            for (int i = n; i > max; i--) {
                acc *= i;
            }
            for (int i = min; i > 1; i--) {
                acc /= i;
            }
            return acc;
        }

        long anyEvens(int e) {
            long res = 0;
            for (int i = e; i > 0; i--) {
                res += C(e, i);
            }
            return res + 1;
        }

        long ctOdds(int e, int p) {
            long res = 0;
            for (int i = 1; i <= e; i++) {
                if ((i) % 2 == p % 2) res += C(e, i);
            }
            if (0 == p % 2) res++;
            return res;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int P = in.nextInt();
            int odds = 0;
            int evens = 0;
            for (int i = 0; i < N; i++) {
                int a = in.nextInt();
                if (0 == a % 2) evens++;
                else odds++;
            }
            long result;
            //  if (0 == odds && 1 == P % 2) result = 0;
            //   else
            result = anyEvens(evens) * ctOdds(odds, P);

            out.println(result);


        }

    }
}

