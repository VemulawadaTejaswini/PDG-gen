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
        long w = sc.nextLong();
        int maxv = 1000024;
        long[][] arr = new long[n+1][2], dp = new long[n+1][maxv+1];
        
        for(int i=1;i<=n;i++){
        	for(int j=0;j<2;j++){
        		arr[i][j] = sc.nextLong();	
        	}
        }

        for(int i=0;i<=n;i++)
        	for(int v=0;v<=maxv;v++)
        		if(v!=0)
        			dp[i][v] = -1;

        for(int i=1;i<=n;i++){
        	for(int v=0;v<=maxv;v++){
            	if(arr[i][1]<=v && dp[i-1][v-(int)arr[i][1]] != -1){
            		if(dp[i-1][v]!=-1)
            			dp[i][v] = Math.min( dp[i-1][v], dp[i-1][v-(int)arr[i][1]] + arr[i][0] );
            		else
            			dp[i][v] = dp[i-1][v-(int)arr[i][1]] + arr[i][0];
            	}
            	else{
            		dp[i][v] = dp[i-1][v];
            	}
        	}
        }

        long ans = 0L;
        for(int v=maxv;v>=0;v--)
        	if(dp[n][v]<=w && dp[n][v]!=-1){
        		ans = v;
        		break;
        	}

        System.out.println(ans);
        //out.close();
	}
}
