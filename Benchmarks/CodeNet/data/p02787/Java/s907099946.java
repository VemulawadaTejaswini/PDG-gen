import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] spell = new int[n][2];
        for(int i = 0; i < n; i++) {
            spell[i][0] = scanner.nextInt();
            spell[i][1] = scanner.nextInt();
        }
        int max = 30_000;
        int[] dp = new int[max];
        Arrays.fill(dp, Integer.MAX_VALUE/3);
        dp[0] = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < max - spell[i][0]; j++) {
                dp[j + spell[i][0]] = Math.min(dp[j + spell[i][0]], dp[j] + spell[i][1]);
            }
        }
        int best= Integer.MAX_VALUE;
        for(int i = h; i < dp.length; i++) {
            best = Math.min(best, dp[i]);
        }
        out.println(best);
        out.flush();
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
