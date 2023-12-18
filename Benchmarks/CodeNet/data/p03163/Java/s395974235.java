import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

class Solution {
	public static void main(String[] args)
	{
		FastScanner in=new FastScanner();
		int n=in.nextInt();
		int w=in.nextInt();
		int[] wt=new int[n];
		long[] val=new long[n];
		for(int i=0;i<n;i++)
		{
			wt[i]=in.nextInt();
			val[i]=in.nextLong();
		}
		long[] dp=new long[w+1];
		for(int i=0;i<n;i++)
		{
			for(int j=w;j>=0;j--)
			{
				if(wt[i]<=j)
					dp[j]=Math.max(dp[j], dp[j-wt[i]]+val[i]);
			}
		}
		System.out.println(dp[w]);
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