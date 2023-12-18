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

        int n = sc.nextInt(), k = sc.nextInt();
        long[] h = new long[n];
        long[] dp = new long[n];
        for(int i=0;i<n;i++) {
            h[i] = sc.nextLong();
            dp[i] = Long.MAX_VALUE;
        }

        dp[0] = 0;
        for(int i=1;i<n;i++) {
            for(int j=Math.max(0, i-k);j<i;j++) {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(h[i] - h[j]));
            }
        }
        pw.println(dp[n-1]);
        pw.close();
	}

}