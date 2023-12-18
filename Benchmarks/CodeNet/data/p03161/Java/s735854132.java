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
        int k = sc.nextInt();
        long[] arr = new long[n], dp = new long[n];
        Arrays.fill(dp, -1);

        dp[0] = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
            int j = i-1;
            while(j>=0 && (i-j<=k)){
	            if(dp[i]==-1)
	            	dp[i] = dp[j]+Math.abs(arr[i]-arr[j]);
	            else
	            	dp[i] = Math.min(dp[j]+Math.abs(arr[i]-arr[j]), dp[i]);
	            j--;
        	}
        }

        out.println(dp[n-1]);
        out.close();
	} 
} 
