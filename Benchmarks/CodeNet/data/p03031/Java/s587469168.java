import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        CSwitches solver = new CSwitches();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSwitches {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long ans = 0;
            ArrayList<Integer> a[] = new ArrayList[m];
            for (int i = 0; i < m; i++) a[i] = new ArrayList<Integer>();
            int p[] = new int[m];
            for (int i = 0; i < m; i++) {
                int k = in.nextInt();
                for (int j = 0; j < k; j++) a[i].add(in.nextInt() - 1);
            }
            for (int i = 0; i < m; i++) p[i] = in.nextInt();
            int x = (int) Math.pow(2, n);
            for (int i = 0; i < x; i++) {
                int l = 0;
                for (int j = 0; j < m; j++) {
                    int count = 0;
                    for (int k = 0; k < a[j].size(); k++) {
                        if ((i & (1 << a[j].get(k))) > 0) count++;
                    }
                    if (count % 2 == p[j]) l++;
                }
                if (l == m) {
                    ans++;
                }
            }
            out.println(ans);
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

