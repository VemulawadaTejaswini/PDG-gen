import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(),m = sc.nextInt();
		int[] a = new int[m], b = new int[m];
		int[] ca = new int[h+1], cb = new int[w+1];
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[i] = x;
			b[i] = y;
			ca[x]++;
			cb[y]++;
		}
		int ma = 0, mb = 0;
		for(int i = 0; i <= h; i++) {
			if(ca[i] > ma) {
				ma = ca[i];
			}
		}
		for(int i = 0; i <= w; i++) {
			if(cb[i] > mb) {
				mb = cb[i];
			}
		}
		int mpa = 0, mpb = 0;
		for(int i = 0; i <= h; i++) {
			if(ca[i] == ma) {
				mpa++;
			}
		}
		for(int i = 0; i <= w; i++) {
			if(cb[i] == mb) {
				mpb++;
			}
		}
		long mc = mpa*mpb;
		for(int i = 0; i < m; i++) {
			if(ca[a[i]] == ma && cb[b[i]] == mb) {
				mc--;
			}
		}
		if(mc != 0) {
			System.out.println(ma + mb);
		}else {
			System.out.println(ma + mb - 1);
		}
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
