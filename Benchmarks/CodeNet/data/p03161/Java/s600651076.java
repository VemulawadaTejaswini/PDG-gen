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
		int k = in.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++)
		{
			h[i] = in.nextInt();
		}
		int[] dp = new int[n];
		for(int i = 1; i < n; i++)
		{
			int min = Integer.MAX_VALUE;
			for(int j = 1; j <= k && i-j >= 0; j++)
			{
				min = Math.min(dp[i-j]+Math.abs(h[i-j]-h[i]), min);
			}
			dp[i] = min;
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
