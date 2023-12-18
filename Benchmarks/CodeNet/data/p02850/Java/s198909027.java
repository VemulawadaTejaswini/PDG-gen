=import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static int V;
	static int E [][];
	static int root;
	static Queue <Integer> Q;
	static int D [];
	static int Field [];
	static int k;
	
	public static void main(String[] args) {
		Edge();
		bfs();
		
		for (int i=1; i<V; i++){
			out.println(Field[i]);
		}
		out.flush();
	}
	
	static void Edge () {
		V = sc.nextInt();
		E = new int [V+1][V+1];
		root = V;
		for (int i=1; i<=V; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			E [a][b] = i;
			root = Math.min(a, root);
		}
	}
	
	static void bfs () {
		Q = new ArrayDeque <Integer>();
		Q.add(root);
		
		D = new int [V+1];
		Arrays.fill(D, -1);
		D[root]=0;
		
		Field = new int [V+1];
		k = -1;
		
		while (Q.size()>0){
			int cur = Q.poll();
			int color_e = 1;
			int color_up = D[cur];
			
			for (int dst=cur+1; dst<=V; dst++){
				int i = E[cur][dst];
				if (i!=0){
					if (color_up==color_e)
						color_e++;
					
					Q.add(dst);
					D [dst] = color_e;
				
					Field [i] = color_e;
					color_e++;
				}
			}	
			k = Math.max(k, color_e);
		}
		out.println(k-1);
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




		