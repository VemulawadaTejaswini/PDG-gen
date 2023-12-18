import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CPoll solver = new CPoll();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPoll {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            HashMap<String, Integer> count = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String s = in.next();
                count.merge(s, 1, Integer::sum);
            }
            int max = 0;
            for (int c : count.values())
                max = Math.max(max, c);

            List<String> answer = new ArrayList<>();
            for (Map.Entry<String, Integer> e : count.entrySet()) {
                if (e.getValue() == max)
                    answer.add(e.getKey());
            }
            Collections.sort(answer);

            for (String s : answer) {
                out.println(s);
            }
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

