import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DTriangles solver = new DTriangles();
        solver.solve(1, in, out);
        out.close();
    }

    static class DTriangles {
        static void CountTriangles(int[] A) {
            int n = A.length;

            Arrays.sort(A);

            int count = 0;

            for (int i = n - 1; i >= 1; i--) {
                int l = 0, r = i - 1;
                while (l < r) {
                    if (A[l] + A[r] > A[i]) {

                        count += r - l;

                        r--;
                    } else // if not possible check for
                    {
                        l++;
                    }
                }
            }
            System.out.println(count);
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                int temp = in.nextInt();
                a[i] = temp;
//            t.insertElement(temp);
            }
            CountTriangles(a);
//        Collections.sort(
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

