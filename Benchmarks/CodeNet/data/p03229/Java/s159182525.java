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
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TPBC_3 solver = new TPBC_3();
        solver.solve(1, in, out);
        out.close();
    }

    static class TPBC_3 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int A[] = new int[N];
            int ANSWK[] = new int[N];
            int ans = 0;
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            Arrays.sort(A);

            if (A.length == 3) {
                ANSWK[0] = A[1];
                ANSWK[1] = A[0];
                ANSWK[2] = A[2];
                out.println(summary(ANSWK));
                return;
            }

            int counter = 1;
            for (int i = 1; i < N; i += 2) {
                ANSWK[i] = A[A.length - counter];
                counter++;
            }
            for (int k = 0; k < N; k += 2) {
                int counterB = 0;
                for (int i = k; i < N + k; i += 2) {
                    if (i >= N) {
                        if (N % 2 == 1) {
                            ANSWK[i - N - 1] = A[counterB];
                        } else {
                            ANSWK[i - N] = A[counterB];
                        }
                    } else {
                        ANSWK[i] = A[counterB];
                    }
                    counterB++;
                }
                if (ans < summary(ANSWK)) {
                    ans = summary(ANSWK);
                }
            }
            out.println(ans);

        }

        private int summary(int arr[]) {
            int sum = 0;
            for (int i = 1; i < arr.length; i++) {
                sum += Math.abs(arr[i] - arr[i - 1]);
            }
            return sum;
        }

    }
}

