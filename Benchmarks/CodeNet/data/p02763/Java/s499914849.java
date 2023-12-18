import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		String s = fs.next();
		char c[] = s.toCharArray();
		int q = fs.nextInt();
		
		TreeSet<Integer> set[] = new TreeSet[26];
		for(int i=0;i<26;i++) set[i] = new TreeSet<Integer>();
		for(int i=0;i<s.length();i++) {
			int t = s.charAt(i)-'a';
			set[t].add(i);
		}
		for(int i=0;i<q;i++) {
			int a = fs.nextInt();
			if(a==1) {
				int x = fs.nextInt()-1; char ch = fs.next().charAt(0); 
				int t = c[x] - 'a';
				
				set[t].remove(x);
				c[x] = ch;
				int nt = ch - 'a';
				set[nt].add(x);
			}
			else if(a==2) {
				int l = fs.nextInt()-1, r = fs.nextInt()-1;
				int cnt = 0;
				for(int j=0;j<26;j++) {
					if(set[j].ceiling(l)==null)continue;
					int m = set[j].ceiling(l);
					if(m<=r)cnt++;
				}
				System.out.println(cnt);
			}
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