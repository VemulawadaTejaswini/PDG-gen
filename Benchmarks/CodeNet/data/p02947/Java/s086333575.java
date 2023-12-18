import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Hashtable;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
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
            Hashtable<String, Integer> table = new Hashtable<>();
            for (int i = 0; i < n; i++) {
                String s = in.next();
                int len = s.length();
                Character[] ar = new Character[len];
                for (int j = 0; j < len; j++)
                    ar[j] = s.charAt(j);
                Arrays.sort(ar);
                StringBuilder s2 = new StringBuilder();
                for (int j = 0; j < len; j++)
                    s2.append(ar[j]);
                String str = new String(s2);
                if (!table.containsKey(str)) {
                    table.put(str, 1);
                } else {
                    int old = table.get(str);
                    table.replace(str, old + 1);
                }
            }
            long ans = 0;
            for (String s : table.keySet()) {
                long rep = table.get(s);
                ans += (rep * (rep - 1)) / 2;
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

