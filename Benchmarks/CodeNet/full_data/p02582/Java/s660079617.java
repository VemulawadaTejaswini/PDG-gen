/*
 * author: Anuj Sahai
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    private static class Solution {
        void solve() {
            final String s = or.next();
            int maxCount = 0, count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    count += 1;
                } else {
                    maxCount = Math.max(maxCount, count);
                    count = 0;
                }
            }
            maxCount = Math.max(maxCount, count);
            pw.println(maxCount);
        }

        final PrintWriter pw; // pw.println(...);
        final OpReader or; // or.next...();

        Solution() {
            pw = new PrintWriter(System.out);
            or = new OpReader();
        }

        void tearDown() {
            pw.close();
        }
    }

    private static class OpReader {
        final BufferedReader br;
        StringTokenizer st;

        public OpReader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32 * 1024);
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    }

    public static void main(String[] args) {
        final Solution solution = new Solution();
        solution.solve();
        solution.tearDown();
    }
}
