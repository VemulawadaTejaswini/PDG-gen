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
        PrintWriter out = new PrintWriter(System.out); 

        int n = sc.nextInt();
        int w = sc.nextInt();
        long[][] arr = new long[n+1][2], dp = new long[n+1][w+1];
        
        for(int i=1;i<=n;i++){
        	for(int j=0;j<2;j++){
        		arr[i][j] = sc.nextLong();	
        	}
        }

        
        for(int i=1;i<=n;i++){
        	for(int wt=0;wt<=w;wt++){
            	if(arr[i][0]<=wt)
            		dp[i][wt] = Math.max(dp[i-1][wt], dp[i-1][wt-(int)arr[i][0]]+arr[i][1]);
            	else
            		dp[i][wt] = dp[i-1][wt];
        	}
        }

        long ans = 0L;
        for(int wt=0;wt<=w;wt++)
        	ans = Math.max(ans, dp[n][wt]);

        out.println(ans);
        out.close();
	} 
} 
