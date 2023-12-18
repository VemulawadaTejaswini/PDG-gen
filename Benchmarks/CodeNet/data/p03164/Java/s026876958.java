import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
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
	static long INF = (Long.MAX_VALUE/2);
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        
        int n = sc.nextInt();
        int w = sc.nextInt();
        
        long dp[] = new long[n*1000+1];
        Arrays.fill(dp,INF);
        dp[0] = 0;
        for(int i = 0; i < n; i++)
        {	
        	long cw = sc.nextLong();
        	int v = sc.nextInt();
        	for(int val = n*1000-v; val >= 0; val--)
        	{
        		dp[val+v] = Math.min(dp[val+v],dp[val]+cw);
        	}
        }
        long ans = 0;
        for(int val = 0; val <= n*1000; val++)
        {
        	if(dp[val] <= w)
        	{
        		ans = Math.max(ans,val);
        	}
        }
        out.println(ans);
        out.close();
	}

}
