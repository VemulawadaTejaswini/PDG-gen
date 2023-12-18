import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
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
	static int a[];
	static long dp[][];  //stores max possible from current position
	
	
	//dp(i,j) = Math.max(a[i]+Math.min(dp(i+2,j),dp(i+1,j-1)),a[j]+Math.min(dp(i+1,j-1),dp(i,j-2)))
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        int n = sc.nextInt();
        dp = new long[n][n];
        a = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++)
        {	
        	a[i] = sc.nextInt();
        	sum += a[i];
        }
        long x = 0, y = 0, z = 0;
        for(int gap = 0; gap < n; gap++)
        {
        	for(int i = 0, j = gap; j < n; i++, j++)
        	{
        		x = i+2<= j?dp[i+2][j]:0;
        		y = i+1<=j-1?dp[i+1][j-1]:0;
        		z = i<=j-2?dp[i][j-2]:0;
        		dp[i][j] = Math.max((long)a[i]+Math.min(y,x),(long)a[j]+Math.min(y,z));
        	}
        }
        x = dp[0][n-1];
        y = sum-x;
        out.println(x-y);
        out.close();
	}

}
