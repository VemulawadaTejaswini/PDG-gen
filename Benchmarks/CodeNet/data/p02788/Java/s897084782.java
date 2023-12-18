import java.util.*;
import java.io.*;

class Mon{
	int x, h, cnt;

	public Mon(int x, int h, int cnt) {
		super();
		this.x = x;
		this.h = h;
		this.cnt = cnt;
	}
	
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		long d = fs.nextInt(), a = fs.nextInt();
		TreeSet<Mon> ts = new TreeSet<>((m1,m2)->m1.x - m2.x);
		for(int i=0;i<n;i++) {
			int tx = fs.nextInt();//x
			int th = fs.nextInt();//h
			ts.add(new Mon(tx,th,0));
		}

		long ans = 0;
		for(int i=0;i<n;i++) {
			if(ts.isEmpty())break;
			Mon tm = ts.pollFirst();
			long x = tm.x, h = tm.h;
			if(h <= 0)continue;
			long t = (h + a - 1) / a;
			ans += t;
			//2d以下のモンスター全部a * t減らす。
			while(!ts.isEmpty()) {
				Mon nm = ts.pollFirst();
				long nx = nm.x, nh = nm.h;
				if(nx>x+2*d) {
					ts.add(nm);
					break;
				}
				if(nh<=0)continue;
				nm.h -= t * a;
				if(nm.h>0)ts.add(nm);
			}
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