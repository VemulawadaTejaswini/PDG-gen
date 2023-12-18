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

        int max = 100000;
		int n = sc.nextInt();
        int[] arr = new int[n], dp = new int[n];
        Arrays.fill(dp, max);

        dp[0] = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i>0)
            	dp[i] = Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]), dp[i]);
            if(i>1)
            	dp[i] = Math.min(dp[i-2]+Math.abs(arr[i]-arr[i-2]), dp[i]);
        }

        out.println(dp[n-1]);
        out.close();
	} 
} 
