import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int a=ir.nextInt();
		int b=ir.nextInt();
		int[][] d=new int[a][];
		for(int i=0;i<a;i++)
			d[i]=ir.nextIntArray(b);
		boolean[][] f=new boolean[a][b];
		int ct=0;
		int tot=2;
		int r=0;
		ArrayList<int[]> list=new ArrayList<>();
		for(int i=0;i<=100;i++){
			for(int j=0;j<=100;j++){
				outer:
				for(int k=0;k<=100;k++){
					boolean u=false;
					for(int l=0;l<a;l++){
						for(int m=0;m<b;m++){
							if(d[l][m]>i*(l+1)+j*(m+1)+k)
								continue outer;
							if(d[l][m]==i*(l+1)+j*(m+1)+k)
								u=true;
						}
					}
					if(!u)
						break outer;
					tot+=i+j;
					r+=i+j+1;
					list.add(new int[]{i,j,k});
					for(int l=0;l<a;l++){
						for(int m=0;m<b;m++){
							if(d[l][m]==i*(l+1)+j*(m+1)+k){
								if(!f[l][m])
									ct++;
								f[l][m]=true;
							}
						}
					}
					break outer;
				}
			}
		}
		if(ct!=a*b){
			out.println("Impossible");
			return;
		}
		out.println(tot+" "+r);
		int cur=2;
		for(int i=0;i<list.size();i++){
			int[] t=list.get(i);
			if(t[0]==0&&t[1]==0){
				out.println(1+" "+tot+" "+t[2]);
				continue;
			}
			for(int j=0;j<t[0];j++){
				if(j==0){
					out.println(1+" "+cur+" X");
				}
				else{
					out.println(cur+" "+Integer.toString(cur+1)+" X");
					cur++;
				}
			}
			for(int j=0;j<t[1];j++){
				if(j==0){
					out.println(1+" "+cur+" Y");
				}
				else{
					out.println(cur+" "+Integer.toString(cur+1)+" Y");
					cur++;
				}
			}
			out.println(cur+" "+tot+" "+t[2]);
			cur++;
		}
		out.println(1+" "+tot);
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