import java.util.*;
import java.io.*;

public class Main {


	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int Q = fs.nextInt();
		int query[][] = new int[Q][2]; 
		for(int i=0;i<Q;i++) {
			int a = fs.nextInt(), b = fs.nextInt();
			if(a > b) {
				int t = a;
				a = b;
				b = t;
			}
			query[i][0] = a;
			query[i][1] = b;
		}
		long ans = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<Q;i++) {
			long a = query[i][0];
			long b = query[i][1];
			long INF = a * b; //これで十分
			//a <= b
			if(a == b) {
				ans = 2 * (a - 1);
			}else {
				long l = -1;
				long r = INF;
				while(l+1<r) {
					long c = (l + r)/2;//cは人数　//lがok, rがout
					if(check(c, a, b)) l = c;
					else r = c;
				}
				ans = l;
			}
			sb.append(ans + "\n");
		}
		System.out.println(sb.toString());
	}
	// 構築できるならtrueを返す。
	static boolean check(double c, double x, double y) {
		// x <= yで考えて良い
		double max = 0;
		double n = c+1;
		if(n%2==0) {
			if(n/2<=x-1 || y+1 <= n/2) {
				double lrmax = n*n/2;
				double center_max = Math.max((x+1)*(n-x), y*(n-(y-1))); 
				max = Math.max(lrmax, center_max);
			}else {
				double lrmax = Math.max((x-1)*(n-(x-1)), (y+1)*(n-(y+1)));
				double center_max = Math.max(((n-1)/2 + 1)*(n-(n-1)/2), ((n-1)/2 + 2)*((n-(n-1)+1)/2));
				max = Math.max(lrmax, center_max);
			}
		}
		else {
			if((n-1)/2<=x-1 || y+1 <= (n+1)/2) {
				double lrmax = (n-1)*(n+1)/2;
				double center_max = Math.max((x+1)*(n-x), y*(n-(y-1))); 
				max = Math.max(lrmax, center_max);
			}else {
				double lrmax = Math.max((x-1)*(n-(x-1)), (y+1)*(n-(y+1)));
				double center_max = (n-1)*(n-1)/4 + n;
				max = Math.max(lrmax, center_max);
			}
			
		}
		return max < x * y;
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