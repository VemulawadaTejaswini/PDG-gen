import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int h = ir.nextInt();
		int w = ir.nextInt();
		char[][] map = new char[h][];
		String[] s = new String[h];
		for (int i = 0; i < h; i++)
			map[i] = ir.next().toCharArray();
		for (int i = 0; i < h; i++) {
			char[] c = map[i].clone();
			Arrays.sort(c);
			s[i]=c.toString();
		}
		int[] u=new int[h];
		Arrays.fill(u, -1);
		int p=0;
		int m=0;
		int r=-1;
		for(int i=0;i<h;i++){
			if(u[i]>=0)
				continue;
			m=0;
			int ct=1;
			for(int j=0;j<h;j++){
				if(i==j||u[j]>=0)
					continue;
				if(s[i].equals(s[j])){
					ct++;
				}
			}
			p++;
			m+=ct%2;
			if(ct%2==0)
				r=i;
		}
		if(m!=h%2){
			out.println("NO");
			return;
		}
		if(h==1){
			int[] cc=new int[26];
			for(int i=0;i<w;i++)
				cc[map[0][i]-'a']++;
			m=0;
			for(int i=0;i<26;i++)
				m+=cc[i]%2;
			out.println(m%2==w%2?"YES":"NO");
			return;
		}
		char[][] mmap=new char[w][h];
		String[] ss=new String[w];
		for(int i=0;i<h;i++)
			for(int j=0;j<w;j++)
				mmap[j][i]=map[i][j];
		for (int i = 0; i < w; i++) {
			char[] c = mmap[i].clone();
			Arrays.sort(c);
			ss[i]=c.toString();
		}
		p=0;
		int[] uu=new int[w];
		Arrays.fill(uu, -1);
		for(int i=0;i<h;i++){
			if(uu[i]>=0)
				continue;
			m=0;
			int ct=1;
			for(int j=0;j<h;j++){
				if(i==j||uu[j]>=0)
					continue;
				if(ss[i].equals(ss[j])){
					ct++;
				}
			}
			p++;
			m+=ct%2;
			if(ct%2==0)
				r=i;
		}
		if(m!=w%2){
			out.println("NO");
			return;
		}
		if(w==1){
			int[] cc=new int[26];
			for(int i=0;i<w;i++)
				cc[mmap[i][0]-'a']++;
			m=0;
			for(int i=0;i<26;i++)
				m+=cc[i]%2;
			out.println(m%2==h%2?"YES":"NO");
			return;
		}
		out.println("YES");
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
