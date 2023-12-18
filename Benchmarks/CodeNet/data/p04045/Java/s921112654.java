import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static int n , k ,d[],min;
	static Set<Integer> set;
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt();
		k = fs.nextInt();
		d = fs.nextIntArray(k);
		set = new HashSet<>();
		for(int i=0;i<10;i++) {
			set.add(i);
		}
		for(int t:d)set.remove(t);
		min = Integer.MAX_VALUE/2;
		dfs(0);
		System.out.println(min);
		
	}
	
	static void dfs(int t) {
		if(t>=n) {
			min = Math.min(min,t);
			return;
		}
		t *= 10;
		for(int s:set) {
			if(t+s==0)continue;
			dfs(t+s);
		}
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