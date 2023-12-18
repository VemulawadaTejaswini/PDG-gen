import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBackfront solver = new BBackfront();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBackfront {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.NextInt();
            int[] a = in.NextIntArray(n, -1);
            int[] maxSequenseTillThisElement = new int[n];
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    maxSequenseTillThisElement[a[i]] = 1;
                } else
                    maxSequenseTillThisElement[a[i]] = maxSequenseTillThisElement[a[i] - 1] + 1;
            }
            out.println(n - ArraysExtention.GetMax(maxSequenseTillThisElement));
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

        public int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() + offset;
            }
            return a;
        }

    }

    static class ArraysExtention {
        public static int GetMax(int[] ar) {
            int max = Integer.MIN_VALUE;
            for (int a : ar) {
                max = Math.max(max, a);
            }
            return max;
        }

    }
}

