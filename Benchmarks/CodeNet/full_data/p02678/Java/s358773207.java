import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;




public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static int n;
	static String s;
	static int [][] dist;
	static LinkedList<Integer> adj[]; 
	//static final int mod = 1_000_000_007;
	
	
	public static void main(String[] args) {
		n = sc.nextInt();
		int m = sc.nextInt();
		
		adj  = new LinkedList[n+1];
		
		for (int i=1; i<=n; i++) 
			 adj[i] = new LinkedList<Integer>(); 
		
		
		for (int i=1; i<=m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			adj[a].add(b);
			adj[b].add(a);
		}
		
		dist = new int [n+1][n+1];
		
		for (int i=1; i<=n; i++) 
			Arrays.fill(dist[i], -1);
		
		dist[1][1] = 0;
		
		BFS(1);
		
		boolean ok = true;
		for (int i=2; i<=n; i++) {
			if (dist[1][i]==-1)
				ok = false;
		}
		
		if (ok) {
			out.println("Yes");
			
			for (int i=2; i<=n; i++) {
				int d = dist[1][i];
				
				for (int j: adj[i]) {
					if (dist[1][j]==d-1) {
						out.println(j);
						break;
					}
				}
			}
		}
		
		else
			out.println("No");
		
		
		
		out.flush();
		
	}
	
	static void BFS(int i) { 
		
		Queue <Integer> q = new ArrayDeque<>();
		q.offer(i);

		while (!q.isEmpty()) { 
			int v = q.poll();
			dist[v][v]=0;

			for (int next: adj[v]) {
				if (dist[i][next]==-1) {
					dist[i][next]=dist[i][v]+1;
					q.offer(next);
				}
				
				else 
					dist[i][next]=Math.min(dist[i][next], dist[i][v]+1);
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
