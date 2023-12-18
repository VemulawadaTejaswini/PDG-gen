import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//static String S;
	static int n;
	static int m;
	static int count;
	//static LinkedList <Integer> adj []; 
	static boolean visited [];
	//static TreeMap <Integer, Integer> map;
	//static PriorityQueue <Integer> q;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		long k = sc.nextLong();
		
		Graph f = new Graph(n);
		
		for (int i=1; i<=m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			f.addEdge(a, b);
			f.addEdge(b, a);
		}
		
		Graph b = new Graph(n);
		
		for (int i=1; i<=k; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			b.addEdge(c, d);
			b.addEdge(d, c);
		}
		
		
		for (int i=1; i<=n; i++) {
			visited = new boolean [n+1];
			count=0;
			f.DFS(i);
			int ans=count;
			//out.println(ans);
		
			for (int j: f.adj[i])
				if (visited[j])
					ans--;
			
			for (int j: b.adj[i])
				if (visited[j])
					ans--;
				
			out.print(ans-1+" ");
		}
		
		
		out.flush();
	}
	
	static class Graph { 
		private  LinkedList <Integer> adj []; 
	    @SuppressWarnings("unchecked")
		Graph (int v) {
	        adj = new LinkedList[v+1]; 
	        for (int i=1; i<=v; ++i) 
	            adj[i] = new LinkedList<Integer>(); 
	    } 
	    
	    void addEdge(int v, int w) { 
	        adj[v].add(w);    
	    } 
	    
	    void DFS (int now) { 
	        for (int next: adj[now]) {
	            if (!visited[next]) {
	            	visited[next] = true;
	            	count++;
	            	DFS(next);
	            }
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



