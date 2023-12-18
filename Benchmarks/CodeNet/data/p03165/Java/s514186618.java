/*input
abracadabra
avadakedavra
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author masterbios
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinovaAndKingdom solver = new CLinovaAndKingdom();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinovaAndKingdom {

        final int MAXN = (int) 1e5 + 10;
       
        long dp[][] = new long[3002][3002];
        char s[], t[];

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            
            s = in.next().toCharArray();
            t = in.next().toCharArray();
            for (int i = 0; i <= s.length; i++) {
                for (int j = 0; j <= t.length; j++) dp[i][j] = -1;
            }
            solve(s.length, t.length);

            StringBuilder sb = new StringBuilder();

            int x = s.length, y = t.length;

            while (x > 0 && y > 0) {
                if (s[x - 1] == t[y - 1]) {
                    sb.append(s[x - 1]);
                    x--; y--;
                } else if (dp[x - 1][y] > dp[x][y - 1]) {
                    x--;
                } else {
                    y--;
                }
            }

            out.println(sb.reverse().toString());

        }

        public long solve(int i, int j) {
            if (i == 0 || j == 0) return 0;
            if (dp[i][j] != -1) return dp[i][j];
            long ans = 0;
            if (s[i - 1] == t[j - 1]) {
                ans = max(ans, solve(i - 1, j - 1) + 1);
            } else {
                ans = max(solve(i - 1, j), solve(i, j - 1));
            } 
            return dp[i][j] = ans;
        }


        public int max(int ...a) {
            int max = Integer.MIN_VALUE;
            for (int i : a) max = Math.max(max, i);
            return max;
        }

        public int min(int ...a) {
            int min = Integer.MAX_VALUE;
            for (int i : a) min = Math.min(min, i);
            return min;
        }

        public long max(long ...a) {
            long max = Long.MIN_VALUE;
            for (long i : a) max = Math.max(max, i);
            return max;
        }

        public long min(long ...a) {
            long min = Long.MAX_VALUE;
            for (long i : a) min = Math.min(min, i);
            return min;
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
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
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

