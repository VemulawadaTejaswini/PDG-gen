import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.util.SortedMap;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HossamDoma
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int n = in.nextInt();
            int[] a = new int[n];
            TreeMap<Integer, Integer> hs = new TreeMap<>();
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
                hs.put(a[i], !hs.containsKey(a[i]) ? 1 : hs.get(a[i]) + 1);
            }

            long bst = 1;
            int cnt = 0;

            for (Map.Entry<Integer, Integer> entry : hs.descendingMap().entrySet()) {
                if (entry.getValue() >= 2) {
                    bst *= entry.getKey();
                    if (entry.getValue() == 4) {
                        bst *= entry.getKey();
                        cnt++;
                    }
                    cnt++;
                }

                if (cnt == 2)
                    break;
            }

//        out.println(cnt);

            if (cnt != 2)
                bst = 0;

            out.println(bst);

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

