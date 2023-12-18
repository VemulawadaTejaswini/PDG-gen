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

        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();

        int[][] dp = new int[a.length+1][b.length+1];

        for(int i=1;i<=a.length;i++){
        	for(int j=1;j<=b.length;j++){
        		if(a[i-1]==b[j-1])
        			dp[i][j] = dp[i-1][j-1]+1;
        		else
        			dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        	}
        }

        int x = a.length, y = b.length;
        StringBuilder ans = new StringBuilder();
        //dp[x][y];
        while(x>0 && y>0){
        	if(a[x-1] == b[y-1]){
        		ans.append(""+a[x-1]);
        		x--;
        		y--;
        	}
        	else{
        		if(dp[x][y]==dp[x-1][y]) x--;
	        	 else y--;
        	}
        }

        System.out.println(ans.reverse().toString());
        
	}
}
