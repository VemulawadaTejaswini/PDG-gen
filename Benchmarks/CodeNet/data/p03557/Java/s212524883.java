import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		int b[] = fs.nextIntArray(n);
		int c[] = fs.nextIntArray(n);
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
				
		int sumB[] = new int[n];
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(a[i]<b[cnt]) {
				sumB[cnt]++;
			}else {
				if(cnt+1>=n)break;
				sumB[cnt+1] = sumB[cnt];
				cnt++;
				i--;
			}			
		}
		for(int i=cnt+1;i<n;i++) {
			sumB[i]=sumB[i-1];
		}

		
		long sumC[] = new long[n];
		cnt = 0;
		for(int i=0;i<n;i++) {
			if(b[i]<c[cnt]) {
				sumC[cnt]+=sumB[i];
			}else {
				if(cnt+1>=n)break;
				sumC[cnt+1] = sumC[cnt];
				cnt++;
				i--;
			}			
		}
		for(int i=cnt+1;i<n;i++) {
			sumC[i]=sumC[i-1];
		}
		
		long ans = 0;
		for(int i=0;i<n;i++)ans+=sumC[i];
		System.out.println(ans);
	}
}

class UnionFind{
	int parent[];
	UnionFind(int N){
		parent = new int[N];
		Arrays.fill(parent, -1);
	}
	
	boolean same(int x, int y){
		return root(x)==root(y);
	}
	int root(int x) {
		if(parent[x]<0)return x;
		return parent[x] = root(parent[x]);
	}
	int size(int x) {
		return -parent[root(x)];
	}
	void unite(int x, int y) {
		if(size(x)<size(y)) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		int rx = root(x);
		int ry = root(y);
		if(rx==ry)return;
		parent[rx] += parent[ry];
		parent[ry] = rx;
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