import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static String S;
	//static String T;
	//static int n;
	//static long dp [][];
	//static boolean flag [][];
	//static long a [];
	//static long sum [];
	static long ans;
	//static final int mod = 1_000_000_007;
	//static LinkedList <Integer> adj []; 
	
	public static void main(String[] args) {
		S = sc.next();
		
		ans = 0;
		
		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i)=='<') 
				i = R(i);
			
			else
				i = L(i);
		}
		
		out.println(ans);
		
		out.flush();
	}
	
	static int R (int i) {
		long right=1;
		long left = 0;
		
		while (i+1<S.length() && S.charAt(i+1)=='<') {
			i++;
			right++;
		}
		
		while (i+1<S.length() && S.charAt(i+1)=='>') {
			i++;
			left++;
		}
		if (left<right) {
			ans += right*(right+1)/2 + (left-1)*left/2;
		}
		
		else
			ans += left*(left+1)/2 + (right-1)*right/2;
		
		return i;
	}
	
	static int L (int i) {
		long left=1;
		long right = 0;
		
		while (i+1<S.length() && S.charAt(i+1)=='>') {
			i++;
			left++;
		}
		
		while (i+1<S.length() && S.charAt(i+1)=='<') {
			i++;
			right++;
		}
		
		if (left<right) {
			ans += right*(right+1)/2 + (left-1)*left/2;
		}
		
		else
			ans += left*(left+1)/2 + (right-1)*right/2;
		
		return i;
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



