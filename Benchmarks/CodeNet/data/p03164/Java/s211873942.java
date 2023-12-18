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
	static int n;
	static int W;
	static int v[],w[];
	static int dp[][];
	
	public static int recUtil(int cn,int we,int sum)
	{	
		if(dp[cn][we] != 0) return dp[cn][we];
		
		int left = 0;
		int right = 0;
		
		if(we == W)
		{
			return sum;
		}
		if(we+w[cn] < W && cn < n-1)
		//left = recUtil(*,we+w[cn],sum+v[cn]);
		
		if(cn < n-1)
		right = recUtil(cn+1,we,sum);
		
		dp[cn][we] = Math.max(left,right);
		return dp[cn][we];
	}
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        n = sc.nextInt();
        W = sc.nextInt();
        v = new int[n];
        w = new int[n];
        
        dp = new int[n][W];
        for(int i = 0; i < n; i++)
        {
        	w[i] = sc.nextInt();
        	v[i] = sc.nextInt();
        }
        
        recUtil(0,0,0);
	}

}
