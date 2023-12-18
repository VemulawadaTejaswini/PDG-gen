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
		long lcm = 1;
		
		int mul = 0;
		while(a[0]%(2*(mul+1))==0) {
			mul++;
		}

		//全てのaが、2のmul乗で割り切れ、その後２で割れない条件でなければ答えは０
		long div = (long)Math.pow(2, mul);
		for(int i=0;i<n;i++) {
			
			if(! (a[i]%div==0&&a[i]%(div*2)!=0) ) {
				System.out.println(0);
				return;
			}
			else {
				long g = gcd(a[i], lcm);
				lcm = lcm / g * a[i];
				if(lcm > 2*m) {
					System.out.println(0);
					return;
				}
			}
		}
		
		long hlcm = lcm/2;
		
		long p = m - hlcm;
		long result = 1 + p / lcm;
		
		System.out.println(result);
		
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
