import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static String S;
	static int n;
	static int l;
	//static boolean seen [][];
	//static int field [][];
	static int r [];
	static int g [];
	static int b [];
	final static int mod = 1_000_000_007;
	//static LinkedList <Integer> adj []; 
	//static boolean visited [][];
	//static TreeMap <Long, Integer> map;
	//static HashMap <Long, Integer> map;
	//static Queue <Long> q;
	//static Deque<Long> deque;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		S = sc.next();
		
		r = new int [n+2];
		g = new int [n+2];
		b = new int [n+2];
		
		for (int i=n; i>0; i--) {
			r[i]=r[i+1];
			g[i]=g[i+1];
			b[i]=b[i+1];
			
			if (S.charAt(i-1)=='R')
				r[i]++;
			
			else if (S.charAt(i-1)=='G')
				g[i]++;
			
			else
				b[i]++;
			
			
		}
		
		long ans = 0;
		char one='a';
		char two='a';
		
		for (int i=1; i<=n-2; i++) {
			one = S.charAt(i-1);
			
			for (int j=i+1; j<=n-1; j++) {
				two = S.charAt(j-1);
				if (two==one)
					continue;
				
				ans+=calc (one, two, i, j);
			}
		}
		
		out.println(ans);
		
		out.flush();
	}
	
	static int calc (char one, char two, int i, int j) {
		int num = 0;
		if (one=='R') {
			if (two=='G') {
				if (j+j-i-1<n && S.charAt(j+j-i-1)=='B')
					num--;
				
				return (num+b[j+1]);
			}
			
			else {
				if (j+j-i-1<n && S.charAt(j+j-i-1)=='G')
					num--;
				
				return (num+g[j+1]);
			}	
		}
		
		else if (one=='G') {
			if (two=='B') {
				if (j+j-i-1<n && S.charAt(j+j-i-1)=='R')
					num--;
				
				return (num+r[j+1]);
			}
			
			else {
				if (j+j-i-1<n && S.charAt(j+j-i-1)=='B')
					num--;
				
				return (num+b[j+1]);
			}	
		}
		
		else {
			if (two=='G') {
				if (j+j-i-1<n && S.charAt(j+j-i-1)=='R')
					num--;
				
				return (num+r[j+1]);
			}
			
			else {
				if (j+j-i-1<n && S.charAt(j+j-i-1)=='G')
					num--;
				
				return (num+g[j+1]);
			}	
		}	
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
		    
		    public double nextDouble(){
		    	return Double.parseDouble(next());
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



