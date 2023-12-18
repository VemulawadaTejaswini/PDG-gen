import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		for(int i=0;i<n;i++) {
			a[i] -= (i+1);
		}
		Arrays.sort(a);
		long sum[] = new long[n+1]; //絶対値の累積和
		for(int i=0;i<n;i++)sum[i+1]=sum[i]+a[i];
		
		long ans = Long.MAX_VALUE/2;
		
		if(n==1) {
			System.out.println(0);
			return;
		}
		
		for(int i=1;i<n;i++) {
			long sumL = sum[i];
			long sumR = sum[n] - sum[i];
			long tmp = sumR - sumL;
			int b1 = a[i-1];
			int b2 = a[i];
			int min = Integer.MAX_VALUE/2;
			if((long)b1 * b2 < 0)min = 0;
			else min = Math.min(b1, b2);
			int max = Math.max(b1, b2);
			if((long)2*i-n >= 0) {
				tmp = tmp + ((long)2*i - n) * min;
			}else {
				tmp = tmp + ((long)2*i - n) * max;
			}
			ans = Math.min(ans, tmp);
		}
		
		System.out.println(ans);
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}