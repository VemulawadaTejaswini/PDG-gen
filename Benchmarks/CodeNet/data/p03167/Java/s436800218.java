import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
 
public class Main {
	
	static int MOD = 1000000007;
	
	public static void main(String[] args) throws InterruptedException {
		FastScanner fs=new FastScanner();
		int h=fs.nextInt(), w=fs.nextInt();
		char [][] grid = new char[h][w];
		for(int i=0 ; i<h ; ++i) {
			char [] line = fs.next().toCharArray();
			for(int j=0 ; j<w ; ++j)
				grid[i][j] = line[j];
		}
		
		long [][] dp = new long[1000][1000];
		dp[0][0] = 1;
		for(int i=0 ; i<h ; ++i) {
			for(int j=0 ; j<w ; ++j) {
				if(grid[i][j] == '#') {
					dp[i][j] = 0;
					continue;
				}
				if(i > 0 && grid[i-1][j] == '.')dp[i][j] = dp[i-1][j];
				if(j > 0 && grid[i][j-1] == '.')dp[i][j] += dp[i][j-1];
				
				dp[i][j] %= MOD;
			}
		}
		
		System.out.println(dp[h-1][w-1]);
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i:a) list.add(i);
		Collections.sort(list);
		for (int i=0; i<a.length; i++) a[i]=list.get(i);
	}
	
	static String reverse(String str) {
	    StringBuilder sb=new StringBuilder(str);
	    sb.reverse();
	    return sb.toString();
	}
	
	static long maxElement(int [] arr) {
		return Arrays.stream(arr).max().getAsInt();
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