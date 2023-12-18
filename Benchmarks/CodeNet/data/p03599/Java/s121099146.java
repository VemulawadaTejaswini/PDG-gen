import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt();
		int d = fs.nextInt(), e = fs.nextInt(), f = fs.nextInt();
		
		if(a>b) {
			int t = a;
			a = b;
			b = t;
		}
		if(c>d) {
			int t = c;
			c = d;
			d = t;
		}
		
		//水の入れ方
		TreeSet<Integer> ws = new TreeSet<>();
		int war[] = new int[3010];
		war[0]=1;
		for(int i=0;i<3005;i++) {
			if(i-100*a>=0) {
				if(war[i-100*a]==1) {
					war[i]=1;
					ws.add(i);
				}
			}
			if(i-100*b>=0) {
				if(war[i-100*b]==1) {
					war[i]=1;
					ws.add(i);
				}
			}
		}
		
		//砂糖の入れ方
		TreeSet<Integer> ss = new TreeSet<>();
		int sar[] = new int[3010];
		sar[0]=1;
		ss.add(0);
		for(int i=0;i<3005;i++) {
			if(i-c>=0) {
				if(sar[i-c]==1) {
					sar[i]=1;
					ss.add(i);
				}
			}
			if(i-d>=0) {
				if(sar[i-d]==1) {
					sar[i]=1;
					ss.add(i);
				}
			}
		}
		
		int total = 0;
		int sugar = 0;
		double con = 0;
		
		for(int water:ws) {
			int slim = water/100*e;
			int rem = f - water;
			if(rem < 0)continue;
			slim = Math.min(slim, rem);
			if(ss.floor(slim)==null)continue;
			int smax = ss.floor(slim); 
			double tcon = (double)100*smax/(water + smax);
			if(tcon >= con) {
				con = tcon;
				total = water + smax;
				sugar = smax;
			}
		}
		System.out.println(total + " " + sugar);
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