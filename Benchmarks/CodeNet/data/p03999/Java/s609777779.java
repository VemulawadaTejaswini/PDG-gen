import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		String s = fs.next();
		int len = s.length();

		long res = 0;
		for(int i=0;i<(1<<(len-1));i++) {
			List<Integer> l = new ArrayList<>();
			for(int j=0;j<len-1;j++) {
				if((i>>(len-2-j)&1)==1)l.add(j);
			}
			List<String> ss = new ArrayList<>();
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<len;j++) {
				if(l.contains(j)) {
					sb.append(s.charAt(j));
					ss.add(sb.toString());
					sb.setLength(0);
				}
				else sb.append(s.charAt(j));
			}
			if(sb.length()!=0)ss.add(sb.toString());
			for(String ts:ss) {
				long t = Long.parseLong(ts);
				res += t;
			}
		}
		System.out.println(res);
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