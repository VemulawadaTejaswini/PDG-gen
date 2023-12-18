// 作者：杨成瑞先生
import java.io.*;
import java.util.*;

public class frog1 {

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
        long[] h = new long[n];
        for(int i=0;i<n;i++) h[i] = sc.nextLong();
        pw.println(Arrays.toString(h));

        long[] dp = new long[n];
        dp[n-2] = Math.abs(h[n-2] - h[n-1]);
        for(int i=n-3;i>=0;i--) {
            dp[i] = Math.min(Math.abs(h[i] - h[i+1]) + dp[i+1], Math.abs(h[i] - h[i+2]) + dp[i+2]);
        }
        
        pw.println(dp[0]);
        pw.close();
	}

}