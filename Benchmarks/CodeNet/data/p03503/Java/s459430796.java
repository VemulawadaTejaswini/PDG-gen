import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
//import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//static String S;
	static int n;
	//static int w;
	static PriorityQueue <Integer> q;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		
		int [] f = new int [n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<10; j++) 
				f[i] += sc.nextInt();
		}
		
		int check;
		int store;
		int min_ind=0;
		int s1_min=1_000_000_000;
		int [] p = new int [n];
		
		for (int i=0; i<n; i++) {
			store = f[i];
			p[i] = sc.nextInt();
			
			for (int j=1; j<11; j++) {
				check = sc.nextInt();
				
				if (store>=j) {
					if (check>=p[i]) {
						p[i]=check;
						min_ind = Math.max(min_ind, j);
					}
				}
				
				if (j==1)
					s1_min = Math.min(s1_min, check);
			}
		}
			
		if (min_ind!=0) {
			q = new PriorityQueue <Integer>();
			q.add(p[0]);
			int cur = 0;
			for (int i=1; i<n; i++) {
				cur = q.peek();
				check = p[i];
				
				if (cur>0) {
					if (check>=0)
						q.add(check);
					
					else {
						if (cur<=check) {
							q.poll();
							q.add(check);
						}
					}
				}
			}
			cur = 0;
			for (int k:q) 
				cur+=k;
			
			out.println(Math.max(cur, s1_min));
		}
		
		else 
			out.println(s1_min);
		
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



