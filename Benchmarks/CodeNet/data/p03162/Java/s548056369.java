import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)
	{
		FastReader in = new FastReader();
		int n = in.nextInt();
		int[][] h = new int[n][3];
		for(int i = 0; i < n; i++)
		{
			h[i][0] = in.nextInt();
			h[i][1] = in.nextInt();
			h[i][2] = in.nextInt();
		}
		int[][] dp = new int[2][3];
		dp[0][0] = h[0][0];
		dp[0][1] = h[0][1];
		dp[0][2] = h[0][2];
		for(int i = 1; i < n; i++)
		{
			dp[1][0] = Math.max(dp[0][1], dp[0][2]) + h[i][0];
			dp[1][1] = Math.max(dp[0][0], dp[0][2]) + h[i][1];
			dp[1][2] = Math.max(dp[0][1], dp[0][0]) + h[i][2];
			
			dp[0][0] = dp[1][0];
			dp[0][1] = dp[1][1];
			dp[0][2] = dp[1][2];
		}
		
		System.out.println(Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2])));
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
