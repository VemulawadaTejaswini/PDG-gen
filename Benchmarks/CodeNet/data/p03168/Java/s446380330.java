import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
	
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        int n = sc.nextInt();
        double p[] = new double[n];
        for(int i = 0; i < n; i++)
        {
        	p[i] = sc.nextDouble();
        }
        
        double dp[][] = new double[n+1][n+1];
        dp[0][0] = 1;
        for(int j = 1; j <= n; j++)
        	dp[0][j] = 0;
        
        for(int i = 1; i <= n; i++)
        {
        	for(int j = 0; j <= n; j++)
        	{
        		dp[i][j] = dp[i-1][j]*(1-p[i-1]);
        		if(j > 0) dp[i][j] += dp[i-1][j-1]*p[i-1];
        	}
        }
        
        double ans = 0;
        int heads = 0;
        int tails = 0;
        for(int i = 0; i <= n; i++)
        {
        	heads = i;
        	tails = n-i;
        	if(heads > tails)
        	{
        		ans += dp[n][i];
        	}
        }
        out.println(ans);
        out.close();
	}

}
