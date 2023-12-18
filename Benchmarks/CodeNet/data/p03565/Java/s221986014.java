import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
//import java.util.Arrays;
//import java.util.Arrays;
import java.util.NoSuchElementException;
//import java.util.PriorityQueue;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static String S;
	static String T;
	static int n;
	//static int w;
	//static PriorityQueue <Integer> q;
	
	public static void main(String[] args) {
		S = sc.next();
		T = sc.next();
		
		int a = S.length();
		int b = T.length();
		
		if (a<b)
			out.println("UNRESTORABLE");
		
		else {
			char ss [] = S.toCharArray();
			char tt [] = T.toCharArray();

			int ind = 0;
			boolean flag = false;
			for (int i=0; i<a-b+1; i++) {
				ind = 0;
				
				for (int j=i; j<i+b; j++) {
					if (ss[j]=='?' || ss[j]==tt[ind])
						ind++;
					
					else 
						break;
				}		
				
				if (ind==b) {
					ind = i;
					flag = true;
				}
			}	
			if (!flag)
				out.println("UNRESTORABLE");
			
			else {
				for (int i=0; i<ind; i++) {
					if (ss[i]=='?')
						out.print('a');
					else
						out.print(ss[i]);
				}
				
				out.print(T);
				
				for (int i=ind+b; i<a; i++) {
					if (ss[i]=='?')
						out.print('a');
					else
						out.print(ss[i]);
				}	
			}
		}
		
		
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



