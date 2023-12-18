import java.io.*; 
import java.util.*; 


public class Main{ 
	
	static class FastReader{ 
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
				catch (IOException e) 
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

	static int n, arr[][];
	static long mod = (long)1e9+7, dp[][];

	static long func(int i, int mask){
		if(i==n)
			return 1;

		if(dp[i][mask]!=-1)
			return dp[i][mask];

		long res = 0;
		for(int j=0;j<n;j++)
			if( arr[i][j]==1 && (mask&(1<<j))==0 )
				res = ( res + func(i+1, mask^(1<<j)) )%mod;

		return dp[i][mask] = res;
	}

	public static void main(String[] args) 
	{ 
        FastReader sc = new FastReader(); 
        //PrintWriter out = new PrintWriter(System.out); 

        n = sc.nextInt();
        arr = new int[n][n];
    	dp = new long[n][(1<<n)];
    	
    	for(int i=0;i<n;i++)
    		for(int j=0;j<(1<<n);j++)
    			dp[i][j] = -1;

        for(int i=0;i<n;i++)
        	for(int j=0;j<n;j++)
        		arr[i][j] = sc.nextInt();

        System.out.println( func(0, 0) );
	}
}
