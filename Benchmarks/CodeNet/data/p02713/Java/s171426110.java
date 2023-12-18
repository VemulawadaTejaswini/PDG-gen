import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CN {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int k = sc.nextInt();
		long ans = 0l;
		ArrayList<Integer> li = new ArrayList<>();
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= k; j++) {
				for(int l = 1; l <= k; l++) {
					int x = gcd3(i, j ,l);
					li.add(x);
					ans += x;
				}
			}
		}
		System.out.println(ans);
	}

	public static int gcd2(int num1, int num2) {
		if(num1 < num2) return gcd2(num2, num1);
		if(num2 == 0) return num1;
		else return gcd2(num2, num1%num2);
	}

	public static int gcd3(int num1, int num2,int num3) {
		int num12 = gcd2(num1, num2);
		return gcd2(num12, num3);
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
