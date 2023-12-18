import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		long m = fs.nextLong();
		long a[] = fs.nextLongArray(n);
		long ans = 1;
		for(int i=0;i<n;i++) {
			if(a[i]%2==1) {
				System.out.println(0);
				return;
			}else {
				long g = gcd(a[i], ans);
				ans = (long)a[i]*ans;
				ans /= g;
			}
		}
		
		if (ans > m) {
			System.out.println(0);
			return;
		}
		long t = ans/2;
		long result = m / t;
		long answ = ( result + 1 )/ 2;
//		long res = ((long)m + ans - 1) / ans;
//		System.out.println(res);
		System.out.println(answ);
		
	}
	static long gcd(long x, long y) {
        return y==0? x : gcd(y,x%y);
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