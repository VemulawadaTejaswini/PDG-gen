import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
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
        ELeague solver = new ELeague();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELeague {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Integer> a[] = new ArrayList[n];
            int get[] = new int[n];
            HashSet<Integer> vis = new HashSet<>();
            for (int i = 0; i < n; i++) a[i] = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    a[i].add(in.nextInt() - 1);
                }
            }
            int count = 0;
            while (true) {
                vis.clear();
                for (int i = 0; i < n; i++) {
                    if (vis.contains(i)) {
                        continue;
                    }
                    if (get[i] < n - 1 && !vis.contains(a[i].get(get[i])) && i == a[a[i].get(get[i])].get(get[a[i].get(get[i])])) {
                        vis.add(i);
                        vis.add(a[i].get(get[i]));
                        get[a[i].get(get[i])]++;
                        get[i]++;
                    }
                }
                if (vis.size() == 0) break;
                count++;
                if (count > n * n) {
                    out.println(-1);
                    return;
                }
            }
            for (int i = 0; i < n; i++) {
                if (get[i] == n - 1) {
                    continue;
                } else {
                    out.println(-2);
                    return;
                }
            }
            out.println(count);
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

