import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
 
public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		FastScanner fs=new FastScanner();
		String s=fs.next(), t=fs.next();
		int n=s.length(), m=t.length();
		
		int [][] dp = new int[n+1][m+1];
		for(int i=0 ; i<n+1 ; ++i) 
			for(int j=0 ; j<m+1 ; ++j)
				dp[i][j] = 0;
		
		for(int i=1 ; i<n+1 ; ++i) {
			for(int j=1 ; j<m+1 ; ++j) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				if(s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + 1);
				}
			}
		}
		
		String ans="";
		int x=n, y=m;
		while(x > 0 && y > 0) {
			if(dp[x-1][y] == dp[x][y])--x;
			else if(dp[x][y-1] == dp[x][y])--y;
			else {
				ans += s.charAt(x-1);
				--x;--y;
			}
		}
		
		System.out.println(reverse(ans));
	}
	
	void sort(int[] a) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i:a) list.add(i);
		Collections.sort(list);
		for (int i=0; i<a.length; i++) a[i]=list.get(i);
	}
	
	public static String reverse(String str) {
	    StringBuilder sb=new StringBuilder(str);
	    sb.reverse();
	    return sb.toString();
	}
	
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
			
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
		
		public long[] readLongArray(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
	}
 
}