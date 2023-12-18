// 作者：杨成瑞先生
import java.io.*;
import java.util.*;

public class Main {

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

	public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int knapsack = sc.nextInt();

        int[] weights = new int[n];
        int[] values = new int[n];

        for(int i=0;i<n;i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }

        long[][] dp = new long[n][knapsack+1];

        // initial weight
        for(int i=weights[0];i<knapsack+1;i++) {
            dp[0][i] = values[0];
        }
        for(int i=1;i<n;i++) {
            for(int j=1;j<knapsack+1;j++) {
                dp[i][j] = j >= weights[i] ? Math.max(dp[i-1][j-weights[i]] + values[i], dp[i-1][j]) : dp[i-1][j];
            }
        }

        pw.println(dp[n-1][knapsack]);
        pw.close();
	}

}