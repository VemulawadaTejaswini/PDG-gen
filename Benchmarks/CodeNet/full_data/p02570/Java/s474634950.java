import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

public class Main 
{ 
	static class FastScanner 
	{ 
		BufferedReader br; 
		StringTokenizer st; 
		
		public FastScanner() 
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

	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		int D=sc.nextInt();
		int T=sc.nextInt();
		int S=sc.nextInt();
		if(D<1 || T<1 || S<1)
		{
			System.out.print("No");
		}
		if(D>10000 || T>10000 || S>10000)
			System.out.print("No");
		if((S*T)>=D)
			System.out.print("Yes");
		else
			System.out.print("No");
	}

}
