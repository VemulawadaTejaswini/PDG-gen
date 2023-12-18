import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		int a[] = fs.nextIntArray(3*n);
		
		Queue<Integer> pql = new PriorityQueue<>(); 
		Queue<Integer> pqr = new PriorityQueue<>((i1,i2)->i2-i1);//大きいものから出してくれる
		
		long suml[] = new long[n+1];
		long sumr[] = new long[n+1];
		
		for(int i=0;i<n;i++) {
			suml[0] += a[i];
			pql.offer(a[i]);
		}
		for(int i=2*n;i<3*n;i++) {
			sumr[0] += a[i];
			pqr.offer(a[i]);
		}
		
		for(int i=n;i<2*n;i++) {
			if(pql.peek()<a[i]) {
				int rm = pql.poll();
				pql.offer(a[i]);
				suml[i-n+1]=suml[i-n] + a[i] - rm;
			}
			else {
				suml[i-n+1]=suml[i-n];
			}
		}
		for(int i=2*n-1;i>=n;i--) {
			if(pqr.peek()>a[i]) {
				int rm = pqr.poll();
				pqr.offer(a[i]);
				sumr[2*n - i] = sumr[2*n-i-1] + a[i] - rm;
			}
			else {
				sumr[2*n-i]=sumr[2*n-i-1];
			}
		}
		long INF = Long.MAX_VALUE/2;
		long ans = -INF;
		for(int i=0;i<n+1;i++) {
			long sum = suml[i] - sumr[n-i];
			ans = Math.max(ans,sum);
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