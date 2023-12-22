import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);

	
	static int n;
	static int m;
	static int a;
	static int b;
	
	static String s;
	static String t;
	//static Queue <Long> q = new ArrayDeque <Long>();
	//static List<ArrayList<Integer>> e;
	//static LinkedList<Integer> adj[]; 
	static HashMap <Integer, Integer> map;
	
	
	public static void main(String[] args) {
		n = sc.nextInt();
		
		map = new HashMap <Integer, Integer> ();
		
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			
			map.put(a, 1);
		}
		
		if (map.size()==1)
			out.println(0);
		
		else {
			int size = map.size();
			long a [] = new long [size];
			int cnt = 0;
			for (int i: map.keySet()) {
				a[cnt] = (long)i;
				cnt++;
			}
			
			Arrays.sort(a);
			
			long max = a[n-1];
			
			HashMap <Long, Integer> map2 = new HashMap <Long, Integer> ();
			for (int i=2; i*i<=max; i++) {
				for (int j=n-1; j>=0; j--) {
					if (a[j-1]%i==0) {
						map2.put(a[j-1],1);
						break;
					}
				}
			}
			out.println(n-map2.size());
		}
		
		out.flush();
		
	}
	
	static long gcd (long a, long b) { 
        if (a==0)  
            return b; 
        return gcd(b%a,a); 
    } 
	
	static long lcm(long a, long b){
		return (a/gcd(a,b))*b;
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
	  }
}
