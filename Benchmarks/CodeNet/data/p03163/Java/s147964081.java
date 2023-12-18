import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)
	{
		FastReader in = new FastReader();
		int n = in.nextInt();
		int w = in.nextInt();
		int[][] wv = new int[n][2];
		for(int i = 0; i < n; i++)
		{
			wv[i][0] = in.nextInt();
			wv[i][1] = in.nextInt();
		}
		
		long[][] dp = new long[n+1][w+1];
		for(int i = 0; i < n+1; i++)
		{
			for(int j = 0; j < w+1; j++)
			{
				if(i == 0 || j == 0)
				{
					dp[i][j] = 0;
				}
				else if(wv[i-1][0] <= j)
				{
					dp[i][j] = Math.max(dp[i-1][j], wv[i-1][1] + dp[i-1][j-wv[i-1][0]]);
				}
				else
				{
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n][w]);
	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                }
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}
