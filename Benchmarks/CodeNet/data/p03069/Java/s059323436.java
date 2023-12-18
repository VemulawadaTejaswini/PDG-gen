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
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CStones solver = new CStones();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStones {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int white = 0;
            int black = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.') {
                    white++;
                } else {
                    black++;
                }
            }
            int curWhite = 0;
            int curBlack = 0;

            int ans = Math.min(white, black);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.') {
                    curWhite++;
                } else {
                    curBlack++;
                }
                int curCost = curBlack + (white - curWhite);
                if (curCost < ans) {
                    ans = curCost;
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

