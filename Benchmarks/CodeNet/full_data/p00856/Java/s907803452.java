import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main{

	static PrintWriter out;
    	static InputReader ir;
        static final int INF=(int)1e9;

	static void solve() {
	    while(true){
		int n=ir.nextInt();
		int t=ir.nextInt();
		int ll=ir.nextInt();
		int b=ir.nextInt();
		if(n==0)
		    return;
		int[] map=new int[n+1];
		int[] L=ir.nextIntArray(ll);
		int[] B=ir.nextIntArray(b);
		for(int i=0;i<ll;i++)
		    map[L[i]]=1;
		for(int j=0;j<b;j++)
		    map[B[j]]=2;
	        double[][][] dp=new double[t+1][n+1][2];
	        for(int i=t-1;i>=0;i--){
		    dp[i+1][n][0]=dp[i+1][n][1]=1.0;
		    for(int j=0;j<n;j++){
			for(int k=0;k<2;k++){
			    if(k==0){
				for(int l=1;l<=6;l++){
				    int pos=j+l>n?2*n-(j+l):j+l;
				    if(map[pos]==0){
					dp[i][j][k]+=dp[i+1][pos][0]/6.0;
				    }
				    else if(map[pos]==1){
					dp[i][j][k]+=dp[i+1][pos][1]/6.0;
				    }
				    else{
					dp[i][j][k]+=dp[i+1][0][0]/6.0;
				    }
				}
			    }
			    else{
				dp[i][j][k]=dp[i+1][j][0];
			    }
			}
		    }
		}
		out.println(dp[0][0][0]);
	    }
	}

	public static void main(String[] args) throws Exception {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}

