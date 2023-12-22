import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
	
	static long m=(long)1e9+7;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		
		int n=sc.nextInt();
		long dp[]=new long[n+1];
		
		for(int i=3;i<=n;i++) dp[i]=1;
		
		for(int i=3;i<=n;i++) {
			for(int j=3;j<=i-3;j++) {
				if(i-j>=3)
				dp[i]=(dp[i]+ (dp[i-j]))%m;
			}
			//System.out.println(dp[i]);
		}
		System.out.println(dp[n]);
		
		
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
