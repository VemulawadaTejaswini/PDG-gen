import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		if (n==1)
			out.println (0);
		
		else if (n==2)
			out.println (1);
		
		else {
			int s1=-1;
			int sn=-1;
			
			for (int i=0; i<n-1; i++){
				if (s.charAt(i)=='R' && s.charAt(i+1)=='L') {
					s1=i;
					break;
				}
			}
			for (int i=n-1; i>0; i--){
				if (s.charAt(i)=='L' && s.charAt(i-1)=='R') {
					sn=i-1;
					break;
				}
			}
			if (s1==sn && s1!=-1) {
				s1=0;
				sn=1;
				//out.println("same");
			}
			else if (s1==-1 && sn==-1) {
				s1=0;
				sn=0;
				//out.println("case1");
			}
			else if (s.charAt(0)=='L') {
				s1=0;
				sn=1;
			}
				
			else {
				s1=1;
				sn=1;
				//out.println("case2");
			}
					
			int cnt = 0;
			int rl=0;
			
			for (int i=0; i<n-1; i++){
				if (s.charAt(i)==s.charAt(i+1))
					cnt++;
				
				if (s.charAt(i)=='R' && s.charAt(i+1)=='L')
					rl++;
			}
			
			if (rl==0) {
				if (cnt!=n-1)
					cnt++;			
			}
			
			else {
				int x = rl-s1-sn;
				
				while (x>0 && k>0 && cnt<n-1) {
					cnt+=2;
					k--;
				}
				
				if (k>0 && cnt<n-1) {
					cnt+=sn;
					k--;
				}
				
				if (k>0 && cnt<n-1) {
					cnt+=s1;	
					k--;
				}
				
			}
			
			out.println(cnt);	
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




		
