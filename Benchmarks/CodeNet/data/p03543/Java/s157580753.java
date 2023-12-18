import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GoodINteger solver = new GoodINteger();
        solver.solve(1, in, out);
        out.close();
    }

    static class GoodINteger {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            String s = in.next();
            int[] freq = new int[10];
            for (int i = 0; i < s.length(); i++) freq[s.charAt(i) - '0']++;
            for (int i = 0; i < 10; i++) {
                if (freq[i] >= 3) {
                    out.println("Yes");
                    return;
                }
            }
            out.println("No");
        }

    }

    static class FastReader {
        BufferedReader reader;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

    }
}

