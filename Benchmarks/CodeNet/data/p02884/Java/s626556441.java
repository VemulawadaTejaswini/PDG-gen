import java.util.*;
import java.io.*;

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int dx[] = { -1, 0, 1, 0 }, dy[] = { 0, -1, 0, 1 };
	static final int[] dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int inf = Integer.MAX_VALUE / 3;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE /3;
	static final String nextLine = "\n";
	static StringBuilder sb = new StringBuilder();

	static int n, m;
	static List<Integer> graph[];
	static double dp[] = new double[610];
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		n = fs.nextInt(); m = fs.nextInt();
		graph = new ArrayList[n];
		for(int i=0;i<n;i++)graph[i] = new ArrayList<>();
		for(int i=0;i<m;i++) {
			int s = fs.nextInt()-1, t = fs.nextInt()-1;
			graph[s].add(t);
		}
		double ans = dinf;
		//青木くんが通路を塞ぐノードを全探索
		for(int i=0;i<n;i++) {
			fill(dp,0.0);
			ans = min(ans, dfs(0,i));			
		}
		System.out.println(ans);
	}
	//method
	static double dfs(int v, int block) {
		if(v == n-1) {
			return 0.0;
		}
		if(dp[v] != 0) return dp[v];
		double ret = 0;
		int sz = graph[v].size();
		if(sz == 1) {
			ret = dfs(graph[v].get(0),block)+1;
		}
		else {
			double sum = 0;
			double max = 0;
			for(int to:graph[v]) {
				double tmp = dfs(to, block);
				max = max(max,tmp);					
				sum += tmp;
			}
			if(v == block)ret = (sum - max)/(sz - 1) + 1;
			else ret = sum/sz + 1;
		}
		return dp[v] = ret;
	}
	
	//libraries
	static int[] concat(int x, int arr[]) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr,0,ret, 1,ret.length-1);
		ret[0] = x;
		return ret;		
	}
	static int[] concat(int arr[], int x) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr,0,ret, 0,ret.length-1);
		ret[ret.length-1] = x;
		return ret;
	}
	static long[] concat(long x, long arr[]) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr,0,ret, 1,ret.length-1);
		ret[0] = x;
		return ret;		
	}
	static long[] concat(long arr[], long x) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr,0,ret, 0,ret.length-1);
		ret[ret.length-1] = x;
		return ret;
	}
	
	static long max(long x, long y) {
		return Math.max(x, y);
	}
	static long min(long x, long y) {
		return Math.min(x, y);
	}
	static long max(long x, long y, long z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static long min(long x, long y, long z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static double max(double x, double y) {
		return Math.max(x, y);
	}
	static double min(double x, double y) {
		return Math.min(x, y);
	}
	static double max(double x, double y, double z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static double min(double x, double y, double z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
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
	static void fill(int arr[], int x) {
		Arrays.fill(arr,x);
	}
	static void fill(long arr[], long x) {
		Arrays.fill(arr,x);
	}
	static void fill(double arr[], double x) {
		Arrays.fill(arr,x);
	}
	static void fill(int arr[][] , int x) {
		for(int i=0;i<arr.length;i++)Arrays.fill(arr[i], x);
	}
	static void fill(long arr[][] , long x) {
		for(int i=0;i<arr.length;i++)Arrays.fill(arr[i], x);
	}
	static void fill(double arr[][] , double x) {
		for(int i=0;i<arr.length;i++)Arrays.fill(arr[i], x);
	}

	//MOD culc
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
}

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