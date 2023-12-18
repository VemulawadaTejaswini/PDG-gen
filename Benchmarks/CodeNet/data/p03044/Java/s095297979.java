import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static int V;
	static int w [];
	static LinkedList <Integer> adj[]; 
	static Queue <Integer> Q;
	static boolean used [];
	static int v_color [];
	static HashMap <Long, Integer> map;
	final static long p = 99929;
	
	public static void main(String[] args) {
		
		Edge();
		bfs();
		for (int i=1; i<=V; i++){
			out.println(v_color[i]);
		}
		
		out.flush();
	}
	
	
	static void Edge () {
		V = sc.nextInt();
		map = new HashMap <Long, Integer>();
		
		adj = new LinkedList[V+1]; 
		w = new int [V+1];
		
	    for (int i=1; i<=V; ++i)
	    	adj[i] = new LinkedList<Integer>(); 
	        
		for (int i=1; i<V; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			adj[a].add(b);
			adj[b].add(a);
			
			map.put((a*p+b), i);
			
			w[i] = sc.nextInt()%2;
		}
	}
	
	static void bfs () {
		Q = new ArrayDeque <Integer>();
		Q.add(1);
		
		used = new boolean [V+1];
		v_color = new int [V+1];
		
		v_color[0] = 0;
		used [1] = true;
		
		int cur = 0; 
		
		while (!Q.isEmpty()){
			cur = Q.poll();
			
			for (int dest: adj[cur]) {
				if (used[dest])
					continue;
				
				if (cur<dest) {
					int index = map.get(cur*p+dest);
					
					if (w[index]==0)
						v_color[dest] = v_color[cur];
					
					else
						v_color[dest] = Math.abs(v_color[cur]-1);
				}
					
				else {
					int index = map.get(dest*p+cur);
					
					if (w[index]==0)
						v_color[dest] = v_color[cur];
					
					else
						v_color[dest] = Math.abs(v_color[cur]-1);
				}
				
				used [dest] = true;
				Q.add(dest);
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



