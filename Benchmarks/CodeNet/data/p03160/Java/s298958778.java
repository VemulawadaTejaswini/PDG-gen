import java.io.*;
import java.util.*;
import java.math.*;
     
public class Main{
	public static void main(String[] args) throws Exception {
	IO io = new IO();
	PrintWriter out = new PrintWriter(System.out);
	Solver sr = new Solver();
	sr.solve(io,out);
	out.flush();
	out.close();
    	}

	static class Solver
	{
        void solve(IO io, PrintWriter out)
        {
            int t = 1;
            while(t-->0)
            {
                int n = io.nextInt();
              	int[] ar = new int[n];
              	for(int i=0 ; i<n ; i++)
                  ar[i] = io.nextInt();
              	int dp[] = new int[n];
              	Arrays.fill(dp,Integer.MAX_VALUE);
              	dp[0]=0;
              	int end=0;
              	for( ; end<n-1; end++)
                {
                  dp[end+1] = Math.min(dp[end+1],dp[end]+Math.abs(ar[end]-ar[end+1]));
                  if(end+2<n)
                  	dp[end+2] = Math.min(dp[end+2],dp[end]+Math.abs(ar[end]-ar[end+2]));
                  //out.println(dp[end]);
                }
              	out.print(dp[n-1]);
            }
	    }
	}
	//Special thanks to Petr (on codeforces) who inspired me to implement IO class!
	static class IO
	{
    	private static final int BUF_SIZE = 2048;
        BufferedReader br;
        private IO() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        private boolean isSpace(char c) {
            return c == '\n' || c == '\r' || c == ' ';
        }
        String next() {
            try {
                StringBuilder sb = new StringBuilder();
                int r;
                while ((r = br.read()) != -1 && isSpace((char) r));
                if (r == -1) {
                    return null;
                }
                sb.append((char) r);
                while ((r = br.read()) != -1 && !isSpace((char) r)) {
                    sb.append((char) r);
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
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
	}
}