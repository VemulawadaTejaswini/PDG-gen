import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		
		TreeMap <Integer, Integer> red = new TreeMap <Integer, Integer> ();
		TreeMap <Integer, Integer> blue = new TreeMap <Integer, Integer> ();
		
		for (int i=0; i<N; i++) {
			int ai = sc.nextInt();
			int bi = sc.nextInt();
			red.put(ai, bi);
		}
		
		for (int i=0; i<N; i++) {
			int ci = sc.nextInt();
			int di = sc.nextInt();
			blue.put(ci, di);
		}
		
		for (int i=0; i<N; i++) {
			int ai = blue.firstKey();
			int bi = blue.get(ai);
			
			
			int max_di = -1;
			int max_ci = -1;
			
			SortedMap <Integer,Integer> red_temp = red.headMap(ai);
			
			Collection<Integer> x = red_temp.keySet();
			List<Integer> val_x = new ArrayList<Integer>(x);
			
			
			Collection<Integer> y = red_temp.values();
			List <Integer> val_y = new ArrayList<Integer>(y);
			
			int size = red_temp.size();
			
			for (int j=0; j<size; j++) {
				
				int temp_ci = val_x.get(j);
				int temp_di = val_y.get(j);
				
				if (temp_di>max_di) {
					max_di = temp_di;
					max_ci = temp_ci;
				}
			}
			red.remove(max_ci, max_di);
			blue.remove(ai,bi);				
			
		}
		
		out.println(N-red.size());
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



