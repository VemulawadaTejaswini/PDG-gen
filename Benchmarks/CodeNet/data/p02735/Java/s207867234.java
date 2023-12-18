import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;


public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static String S;
	static int h;
	static int w;
	static char field [][];
	final static int dx []= {0, 1};
	final static int dy []= {1, 0};
	static boolean seen[][];
	//static LinkedList <Integer> adj []; 
	//static boolean visited [][];
	//static TreeMap <Integer, Long> map;
	//static HashMap <Integer, Integer> map;
	//static PriorityQueue <Integer> q;
	
	public static void main(String[] args) {
		h = sc.nextInt();
		w = sc.nextInt();
		field = new char [h][w];
		
		for (int i=0; i<h; i++) {
			field[i] = sc.next().toCharArray();
		}
		
		int ans [][] = new int [h][w];
		
		for (int i=0; i<h; i++) {
			Arrays.fill(ans[i], 1_000_000_000);
		}
		
		if (field[0][0]=='#')
			ans[0][0]=1;
		else
			ans[0][0]=0;
		
		Point start = new Point (0,0);
		//seen = new boolean [h][w];
		search(ans,start);
		
		out.println(ans[h-1][w-1]);
		out.flush();
	}
	
	static void search (int ans[][], Point s) { 
		Queue <Point> q = new ArrayDeque<>();
		q.offer(s);
		
		while (!q.isEmpty()) { 
			Point p = q.poll();

			for (int i=0; i<2; i++) { 
				int ny = p.y + dy[i]; 
				int nx = p.x + dx[i]; 
				
				if (!isValid(ny,nx))
					continue;
				
				if (field[p.y][p.x]=='#' || field[ny][nx]=='.') {
					ans[ny][nx] = Math.min(ans[p.y][p.x], ans[ny][nx]);
					q.offer(new Point (nx,ny));
					continue;
				}
	
				else 
					ans[ny][nx] = Math.min(ans[ny][nx], ans[p.y][p.x]+1);
				
				q.offer(new Point (nx,ny));
			}		
		}
	}
	
	static boolean isValid(int y, int x) { 
		return (y >= 0) && (y < h) && 
			(x >= 0) && (x < w); 
	} 
	
	static class Point { 
		int x; 
		int y; 

		public Point(int x, int y) { 
			this.x = x; 
			this.y = y; 
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



