import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

class Main {

	static long mod=(long)1e9+7;
	public static void main(String[] args)
	{
		FastScanner in=new FastScanner();
	    int h=in.nextInt();
		int w=in.nextInt();
		char[][] grid=new char[h][w];
		long dp[][]=new long[h][w];
		for(int i=0;i<h;i++) {
			String x=in.next();
			for(int j=0;j<w;j++) {
				grid[i][j]=x.charAt(j);
			}
		}
		dp[0][0]=1;
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<w;j++)
			{
				for(int row=i;row<=i+1;row++)
				{
					int col=j;
					if(row==i)
						col=j+1;
					if(row<h && col<w && grid[row][col]=='.') {
						dp[row][col]+=dp[i][j];
						dp[row][col]=dp[row][col]%mod;
					}
				}
			}
		}
		System.out.println(dp[h-1][w-1]);
	}
static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
