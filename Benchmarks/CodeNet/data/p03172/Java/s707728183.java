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

	public static void main(String[] args) 
	{ 
        FastReader sc = new FastReader(); 
        //PrintWriter out = new PrintWriter(System.out); 

        int n = sc.nextInt();
        int k = sc.nextInt();
        long mod = 1000000007;
        long[] arr = new long[n+1];
        long[][] dp = new long[n+1][k+1];

        for(int i=0;i<n;i++){
        	arr[i] = sc.nextLong();
        }

        dp[0][0] = 1;
        for(int i=0;i<n;i++){
        	for(int j=0;j<=k;j++){
        		if(j>=arr[i]+1)
        			dp[i+1][j] = ( dp[i+1][j] + dp[i][j]- dp[i][j-(int)arr[i]-1] )%mod;
        		else
        			dp[i+1][j] = (dp[i+1][j] + dp[i][j]);
        	}

        	for(int j=1;j<=k;j++){
        		dp[i+1][j] = ( dp[i+1][j] + dp[i+1][j-1] )%mod;
        	}
        }

        // for(int i=0;i<=n;i++){
        // 	for(int j=0;j<=k;j++){
        // 		//System.out.print(dp[i][j]+" ");
        // 	}
        // 	//System.out.println("\n-------"+dp[i][0]+"---------   "+dp[i][k]);
        // }

        System.out.println( dp[n][k] );
	}
}
