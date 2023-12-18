import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args)
	{
		FastScanner in =new FastScanner();
		int n=in.nextInt();
		long W=in.nextLong();
		long[] w=new long[n];
		int[] v=new int[n];
		int nsum=0;
		for(int i=0;i<n;i++)
		{
			w[i]=in.nextLong();
			v[i]=in.nextInt();
			nsum+=v[i];
		}
		long[] dp=new long[nsum+1];
		Arrays.fill(dp,(long)1e18+5);
		dp[0]=0;
		for(int i=0;i<n;i++)
		{
			for(int j=nsum;j>=0;j--)
			{
				if(j-v[i]>=0)
					dp[j]=Math.min(dp[j], dp[j-v[i]]+w[i]);
			}
		}
//		System.out.println(Arrays.toString(dp));
		long max=0;
		for(int i=0;i<nsum+1;i++) {
			if(dp[i]<=W)
			max=Math.max(max, (long)i);
		}
		System.out.println(max);
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
