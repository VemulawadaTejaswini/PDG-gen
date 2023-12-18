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
      	int dfs(int[][] ar, int i, int m, int n, int dp[][])
        {
          if(i>n)
            return 0;
          if(dp[i][m]!=-1)
            return dp[i][m];
          int max = -1;
          for(int j=1 ; j<=3 ; j++){
            if(j!=m)
            	max = Math.max(max,ar[i][j]+dfs(ar,i+1,j,n,dp));
          }
          return dp[i][m] = max;
        }
        void solve(IO io, PrintWriter out)
        {
            int t = 1;
            while(t-->0)
            {
                int n = io.nextInt();
              	int[][] ar = new int[n+1][4];
              	for(int i=1 ; i<=n ; i++)
                  for(int j=1 ; j<=3 ; j++)
                  	ar[i][j] = io.nextInt();
                
              	int dp[][] = new int[n+1][4];
              	for(int i=0 ; i<=n ; i++)
              		Arrays.fill(dp[i],-1);
              	
              	out.print(dfs(ar,1,0,n,dp));
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