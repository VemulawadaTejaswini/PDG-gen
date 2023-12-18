import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int l = sc.nextInt();
		String val = String.valueOf(l);
		BigDecimal bd = new BigDecimal(val);
		BigDecimal three = new BigDecimal("3");
		BigDecimal bd1 = bd.divide(three, 3, BigDecimal.ROUND_DOWN);
		BigDecimal bd2 = bd.divide(three, 3 ,BigDecimal.ROUND_UP);
		
		BigDecimal ans = new BigDecimal("0");
		
		if(l%3 == 0) {
			ans = (bd1.multiply(bd1)).multiply(bd1);
		}else if(l%3 == 1) {
			ans = (bd1.multiply(bd1)).multiply(bd2);
		}else {
			ans = (bd1.multiply(bd2)).multiply(bd2);
		}
		
		System.out.println(ans);
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