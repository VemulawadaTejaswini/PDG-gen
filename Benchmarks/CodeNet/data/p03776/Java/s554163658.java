import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), a = fs.nextInt(), b = fs.nextInt();
		long v[] = fs.nextLongArray(n);
		rsort(v);
		double ave = 0;
		for(int i=0;i<a;i++) {
			ave += v[i];
		}
		ave /= a;
		long t = v[a-1];
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(v[i]==t)cnt++;
		}
		int cnt1 = 0;
		for(int i=0;i<a;i++) {
			if(v[i]==t)cnt1++;
		}
		
		//パスカルの三角形により求める
		long c[][] = new long[62][62];
		c[0][0]=1;
		for(int i=0;i<60;i++) {
			for(int j=0;j<60;j++) {
				c[i+1][j] += c[i][j];
				c[i+1][j+1] += c[i][j];
			}
		}
		
		long pat = 0;
		
		if(v[0]==v[a-1]) {
			int max = Math.min(b, cnt);
			for(int i=a;i<=max;i++) {
				pat += c[cnt][i];
			}
		}
		else {
			pat = c[cnt][cnt1];
		}
		
		System.out.println(ave);
		System.out.println(pat);
	}
	
	
	
	//reverseOrderSort : O(NlogN)
	static void rsort(int[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}

	static void rsort(long[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
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