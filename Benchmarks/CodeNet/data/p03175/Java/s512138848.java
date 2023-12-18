/*input
10
8 5
10 8
6 5
1 5
4 8
2 10
3 6
9 2
1 7
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
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

        final int MAXN = (int) (1 << 21) + 10;
        final long mod = (long) (1e9) + 7;
        long dp[][] = new long[100005][2];
 		List<Integer>[] graph;       
        int n;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
            for (int i = 1; i < n; i++) {
            	int u = in.nextInt(), v = in.nextInt();
            	graph[u].add(v);
            	graph[v].add(u);
            }
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < 2; j++) dp[i][j] = 0;
            }
        	long ans = solve(1, -1, 1);
        	for (int i = 0; i <= n; i++) {
                for (int j = 0; j < 2; j++) dp[i][j] = 0;
            }
            out.println(add(ans, solve(1, -1, 0)));
        }

        public long solve(int node, int par, int color) {
        	// System.out.println(node + " " + par + " " + color);
        	if (dp[node][color] != 0) return dp[node][color];
            long sum = 1;
            for (int child : graph[node]) {
            	if (child == par) continue;
            	if (color == 0) { // white
            		long black = solve(child, node, 1 - color);
            		long white = solve(child, node, color);
            		// System.out.println("node=" + node + " " + black + " " + white);
            		sum = mul(sum, add(black, white));
            	} else if (color == 1) { // black
            		sum = mul(sum, solve(child, node, 1 - color));
            	}
            }
            return dp[node][color] = sum;
        } 


        public long mul(long a, long b) {
        	long ans = (a % mod) * (b % mod);
        	return ans % mod;
        }

        public long add(long a, long b) {
        	a += b;
        	if (a >= mod) a -= mod;
        	return a;
        }

        public long sub(long a, long b) {
        	a -= b;
        	if (a < 0) a += mod;
        	return a;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}


