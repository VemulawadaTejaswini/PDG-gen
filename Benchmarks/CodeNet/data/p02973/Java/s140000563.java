import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Collections;
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
        ESequenceDecomposing solver = new ESequenceDecomposing();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESequenceDecomposing {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) a.add(in.nextInt());
            Collections.reverse(a);
            out.println(CustomList.longestIncreasingSubsequence(a));
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

    static class CustomList {
        public static int upperBound(List<Integer> a, int low, int high, int element) {
            while (low < high) {
                int middle = low + (high - low) / 2;
                if (a.get(middle) > element)
                    high = middle;
                else
                    low = middle + 1;
            }
            return low;
        }

        public static int longestIncreasingSubsequence(List<Integer> a) {

            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < a.size(); i++) {
                int x = upperBound(ans, 0, ans.size(), a.get(i));
                if (x + 1 > ans.size()) {
                    ans.add(a.get(i));
                } else
                    ans.set(x, a.get(i));
            }
            return ans.size();
        }

    }
}

