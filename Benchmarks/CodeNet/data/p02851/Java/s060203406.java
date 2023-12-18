import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), k = fs.nextInt();
		int a[] = fs.nextIntArray(n);
		int sum[] = new int[n+1];
		for(int i=0;i<n;i++)sum[i+1] = ( sum[i] + a[i] )% k;
		for(int i=0;i<n+1;i++) {
			sum[i] = (sum[i] - i)%k;
			if(sum[i]<0)sum[i]+=k;
		}
		Map<Integer,Integer> map = new HashMap<>();
		Queue<Integer> q = new ArrayDeque<>();
		long ans = 0;
		for(int i=0;i<n+1;i++) {
			int now = sum[i];
			int num = map.getOrDefault(now,0);
			ans += num;
			map.put(now, num+1);
			q.offer(now);
			while(q.size()>=k) {
				int rm = q.poll();
				map.put(rm, map.get(rm)-1);
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