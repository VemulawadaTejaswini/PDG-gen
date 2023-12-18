import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//static String S;
	static int n;
	//static int a;
	//static LinkedList <Integer> adj[]; 
	//static PriorityQueue <Integer> q;
	//static boolean g [][];
	//static boolean visited [];
	
	public static void main(String[] args) {
		n = sc.nextInt();
		int W = sc.nextInt();
		int w[] = new int [n+1];
		int v[] = new int [n+1];
		
		
		int max_v = -1;
		for (int i=0; i<n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();	
			max_v = Math.max(max_v, v[i]);
		}
		
		long dp [][] = new long [n+1][n*max_v+1];
		for (int i=0; i<=n; i++) {
			Arrays.fill(dp[i], 1_000_000_000_000L);
		}
		
		dp[0][0] = 0;
		
		int val = 0;
		int cur = 0;
		
		for (int i=0; i<n; i++) {
			val = v[i];
			cur = w[i];
			
			for (int sum=0; sum<=n*max_v; sum++) {
				if (sum-val>=0)
					dp[i+1][sum] = Math.min((dp[i][sum-val]+cur), dp[i][sum]);
					
				else 
					dp[i+1][sum] = Math.min(dp[i][sum], dp[i+1][sum]);
			}	
		}
		
		long ans = -1;
		for (int i=0; i<=n*max_v; i++) {
			if (dp[n][i]<=W)
				ans = i;
		}
		
		out.println(ans);
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



