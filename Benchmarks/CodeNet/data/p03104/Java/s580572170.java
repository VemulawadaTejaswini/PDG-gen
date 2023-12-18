import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		long a = fs.nextLong(), b = fs.nextLong();
		
		int as[] = new int[50];
		if(a != 0) as = xorsum(a-1);
		int bs[] = xorsum(b);
		
		long res = 0;
		for(int i=0;i<50;i++) {
			if(as[i]!=bs[i]) res += pow(2,i); 
		}
		System.out.println(res);
	}
	
	static int[] xorsum(long x) {
		//各桁の1の数を数える
		int a[] = new int[50];
		for(int i=0;i<50;i++) {
			if(i==0) {
				a[i] = (int)(((x + 1)/2)%2);
			}
			else {
				long t = pow(2, i+1);
				long u = pow(2, i);
				long rem = (x+1) % t;
				if(rem <= u)a[i] = 0;
				else a[i] = (int)((rem - u) % 2);
			}
		}
		return a;
	}
	
	static long pow(long x, long p) {
		if(p == 0) return 1;
		if(p%2!=0) return x * pow(x, p-1);
		long t = pow(x, p/2);
		return t * t; 
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