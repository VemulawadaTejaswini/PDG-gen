import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] barr = new int[n];
        for(int i = 0; i < n; i++) {
            barr[i] =scanner.nextInt();
        }
        int sz = 51;
        int maxMask = 1 << n;
        int[][] dp = new int[maxMask][sz];
        for(int[] dd: dp) Arrays.fill(dd, Integer.MAX_VALUE/3);
        int[][] swapVals = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j< n; j++) {
                swapVals[i][j] = (i % 2 == j % 2) ? arr[j] : barr[j];
            }
        }
        dp[0][0] = 0;
        for(int mask = 0; mask < maxMask; mask++) {
            //position corresponds the number of bits that are highlighted in the mask
            int ind = Integer.bitCount(mask);
            for(int val = 0; val < sz; val++) {
                int cost = 0;
                for(int i = 0;i < n; i++) {
                    if(((1 << i) & mask) > 0) continue;
                    //which face is the card that i can put here?
                    //and is it greater than my prev?
                    if (swapVals[ind][i] >= val) dp[mask | (1 << i)][swapVals[ind][i]] = Math.min(dp[mask][val] + cost, dp[mask|(1<<i)][swapVals[ind][i]]);
                    cost++;
                }
            }
        }
        int ans = Integer.MAX_VALUE/3;
        maxMask--;
        for(int i = 0; i < sz; i++) {
            ans= Math.min(ans, dp[maxMask][i]);
        }
        out.println(ans == Integer.MAX_VALUE/3 ? -1 : ans);
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
