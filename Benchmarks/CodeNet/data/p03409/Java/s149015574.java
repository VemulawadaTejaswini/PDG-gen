import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int red[][] = new int[n][2];
		int blue[][] = new int[n][2];
		for(int i=0;i<n;i++) {
			red[i][0] = fs.nextInt();
			red[i][1] = fs.nextInt();
		}
		for(int i=0;i<n;i++) {
			blue[i][0] = fs.nextInt();
			blue[i][1] = fs.nextInt();
		}
		
		Arrays.sort(blue, (b1,b2)->b1[0] - b2[0]);
		Arrays.sort(red, (b1,b2)->b1[0] - b2[0]);
		TreeSet<Integer> ts = new TreeSet<>();
		
		int ans = 0;
		int redp = 0;
		for(int i=0;i<n;i++) {
			int x = blue[i][0];
			int y = blue[i][1];
			while(redp<n&&red[redp][0]<x) {
				ts.add(red[redp][1]);
				redp++;
			}
			if(ts.lower(y)==null)continue;
			ts.remove(ts.lower(y));
			ans++;
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