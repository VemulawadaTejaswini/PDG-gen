import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] a = new int[n];
		int f = 1, b = 1;
		boolean c = false;
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x != 1 && !c) {
				f++;
			}else if(x == 1) {
				c = true;
			}else {
				b++;
			}
		}
		if(n == k) {
			ans = 1;
		}else if(f <= k || b <= k) {
			ans = num(n,k);
		}else {
			ans = num(f,k)+num(b,k);
		}
		int check = num(n,k);
		if(ans > check) {
			ans = check;
		}
		System.out.println(ans);
	}

	static int num(int n, int k) {
		int ans = (n-1)/(k-1);
		if((n-1)%(k-1) != 0) {
			ans++;
		}
		return ans;
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
