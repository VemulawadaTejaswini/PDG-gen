package eduDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args)
	{
		FastReader in = new FastReader();
		int n = in.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++)
		{
			h[i] = in.nextInt();
		}
		int[] dp = new int[n];
		dp[1] = Math.abs(h[0]-h[1]);
		for(int i = 2; i < n; i++)
		{
			dp[i] = Math.min(dp[i-1]+Math.abs(h[i-1]-h[i]), dp[i-2]+Math.abs(h[i-2]-h[i]));
		}
		System.out.println(dp[n-1]);
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
