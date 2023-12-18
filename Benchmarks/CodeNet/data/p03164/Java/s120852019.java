// 作者：杨成瑞先生
import java.io.*;
import java.util.*;

public class cf {

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

    static int mod = 1000000007;
    static long oo = Long.MAX_VALUE;

	public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out); 
        
        int n = sc.nextInt();
        int W = sc.nextInt();

        int[] w = new int[n];
        int[] v = new int[n];

        int maxValue = 0;
        for(int i=0;i<n;i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            maxValue += v[i];
        }

        long[] dp = new long[maxValue+1];
        Arrays.fill(dp, oo);

        for(int i=0;i<n;i++) {
            for(int j=maxValue;j>=v[i];j--) {
                if(dp[j-v[i]] != oo) {
                    dp[j] = Math.min(dp[j], dp[j-v[i]] + w[i]);
                }
            }
        }

        int ans = 0;
        for(int i=maxValue;i>=0;i--) {
            if(dp[i] <= W) {
                ans = i;
                break;
            }
        }

        pw.println(ans);
        pw.close();
    }

}

	/*	long[] dp=new long[x+1];
		for (int i=1;i<=x;++i) dp[i]=Long.MAX_VALUE;
		for (int i=0;i<n;++i)
			for (int j=x;j>=v[i];--j) if (dp[j-v[i]]!=Long.MAX_VALUE)
				dp[j]=Math.min(dp[j],dp[j-v[i]]+w[i]);
		int res=0;
		for (int i=x;i>=0;--i) if (dp[i]<=W) {
			res=i;
			break;
		}
		System.out.println(res);
	}*/