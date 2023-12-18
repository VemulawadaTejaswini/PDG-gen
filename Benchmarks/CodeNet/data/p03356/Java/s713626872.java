import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEquals solver = new DEquals();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEquals {
        int[] a;
        int[] dsu;
        int n;

        void merge(int index1, int index2) {
            index1 = findParentIndex(index1);
            index2 = findParentIndex(index2);
            if (index1 != index2) {
                dsu[index1] = index2;
            }
        }

        int findParentIndex(int i) {
            if (dsu[i] != -1)
                return dsu[i] = findParentIndex(dsu[i]);
            return i;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.NextInt();
            int m = in.NextInt();
            a = in.NextIntArray(n);
            dsu = new int[n];
            Arrays.fill(dsu, -1);
            for (int i = 0; i < m; i++) {
                merge(in.NextInt() - 1, in.NextInt() - 1);
            }
            int[] realIndex = new int[n];
            for (int i = 0; i < n; i++) {
                realIndex[a[i] - 1] = i;
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (findParentIndex(i) == findParentIndex(realIndex[i])) {
                    res++;
                }
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
                a[i] = NextInt() - offset;
            }
            return a;
        }

    }
}

