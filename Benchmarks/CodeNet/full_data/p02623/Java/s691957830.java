import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static int n;
	static int m;
	static long a [];
	static long b [];
	static String s;
	static String t;
	//static HashMap <Integer, Integer> map;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		long k = sc.nextLong();
		
		a = sc.nextLongArray(n, false);
		b = sc.nextLongArray(m, false);
		
		int ans = 0;
		long now = 0;
		long ai=0;
		long bi=0;
		
		while (now<=k && ans<n+m) {
			long A = 0;
			long B = 0;
			if (ai<n) {
				A = a[(int) ai];
			}
			if (bi<m) {
				B = b[(int) bi];
			}
			
			long s = Math.min(A, B);
			
			if (A>B)
				ai++;
			
			else
				bi++;
			
			if (now+s<=k) {
				now+=s;
				ans++;
			}
			
			else
				break;
		}
		
		out.println(ans);
		
		out.flush();
		
	}
	
	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;

	    private boolean hasNextByte() {
	      if (ptr < buflen) {
	        return true;
	      } else {
	        ptr = 0;
	        try {
	          buflen = in.read(buffer);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	        if (buflen <= 0) {
	          return false;
	        }
	      }
	      return true;
	    }

	    private int readByte() {
	      if (hasNextByte()) return buffer[ptr++];
	      else return -1;
	    }

	    private static boolean isPrintableChar(int c) {
	      return 33 <= c && c <= 126;
	    }

	    private void skipUnprintable() {
	      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	    }

	    public boolean hasNext() {
	      skipUnprintable();
	      return hasNextByte();
	    }

	    public String next() {
	      if (!hasNext()) throw new NoSuchElementException();
	      StringBuilder sb = new StringBuilder();
	      int b = readByte();
	      while (isPrintableChar(b)) {
	        sb.appendCodePoint(b);
	        b = readByte();
	      }
	      return sb.toString();
	    }
	    
	    public double nextDouble () {
	    	return Double.parseDouble(next());
	    }

	    public long nextLong() {
	      if (!hasNext()) throw new NoSuchElementException();
	      long n = 0;
	      boolean minus = false;
	      int b = readByte();
	      if (b == '-') {
	        minus = true;
	        b = readByte();
	      }
	      if (b < '0' || '9' < b) {
	        throw new NumberFormatException();
	      }
	      while (true) {
	        if ('0' <= b && b <= '9') {
	          n *= 10;
	          n += b - '0';
	        } else if (b == -1 || !isPrintableChar(b)) {
	          return minus ? -n : n;
	        } else {
	          throw new NumberFormatException();
	        }
	        b = readByte();
	      }
	    }

	    public int nextInt() {
	      return (int) nextLong();
	    }

	    public int[] nextIntArray(int N, boolean oneBased) {
	      if (oneBased) {
	        int[] array = new int[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      } else {
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      }
	    }

	    public long[] nextLongArray(int N, boolean oneBased) {
	      if (oneBased) {
	        long[] array = new long[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      } else {
	        long[] array = new long[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      }
	    }
	    
	    public double [] nextDoubleArray(int N, boolean oneBased) {
		      if (oneBased) {
		        double [] array = new double[N + 1];
		        for (int i = 1; i <= N; i++) {
		          array[i] = sc.nextDouble();
		        }
		        return array;
		      } else {
		        double[] array = new double[N];
		        for (int i = 0; i < N; i++) {
		          array[i] = sc.nextDouble();
		        }
		        return array;
		      }
		    }
		  
	  }
	
	
}
