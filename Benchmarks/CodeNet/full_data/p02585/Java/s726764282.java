import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] p = new int[n];
		long[] c = new long[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextLong();
		}
		long ans = Long.MIN_VALUE;
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			long s = score(i, p, c, k);
			a[i] = s;
		}
		Arrays.sort(a);
		System.out.println(a[n-1]);
	}

	static Long score(int start, int[] p, long[] c, int k) {
		long s = 0, max = Long.MIN_VALUE;
		int x = p[start]-1;
		int pl = start;
		long[] a = new long[k];
		for(int i = 0; i < k; i++) {
			x = p[(int)pl]-1;
			s += c[x];
			pl = p[pl] - 1;
			a[i] = s;
		}
		Arrays.sort(a);
		return a[k-1];
	}

	static class FastScanner {
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
}
