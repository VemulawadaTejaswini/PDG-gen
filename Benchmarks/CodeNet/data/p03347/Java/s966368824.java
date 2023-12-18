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
        CSequenceGrowingEasy solver = new CSequenceGrowingEasy();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSequenceGrowingEasy {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.NextInt();
            int[] a = in.NextIntArray(n);
            int res = 0;
            int needsToBeArLeast = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] < needsToBeArLeast || a[i] > i) {
                    out.println(-1);
                    return;
                }
                if (a[i] != needsToBeArLeast) {
                    res += a[i];
                }
                needsToBeArLeast = a[i];
                if (needsToBeArLeast != 0) needsToBeArLeast--;
            }
            out.println(res);
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

        public int[] NextIntArray(int n) {
            return NextIntArray(n, 0);
        }

        public int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() + offset;
            }
            return a;
        }

    }
}

