import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		int[] c=sc.nextIntArray(N);
		ArrayList<Pair2> arrayList=new ArrayList<>();
		segTreesum seg=new segTreesum(N);
		int[] l=new int[Q];
		for (int i = 0; i < Q; i++) {
			l[i]=sc.nextInt()-1;
			int r=sc.nextInt()-1;
			arrayList.add(new Pair2(i, 1, r));
		}
		for (int i = 0; i < c.length; i++) {
			arrayList.add(new Pair2(c[i], 0, i));
		}
		int[] visit=new int[N];
		Arrays.fill(visit, -1);
		Collections.sort(arrayList);
		long[] ans=new long[Q];
		for (Pair2 pair2: arrayList) {
			int x=pair2.x;
			int y=pair2.y;
			int z=pair2.z;
			if (y==0) {
				seg.add(z, 1);
				if (visit[x-1]!=-1) {
					seg.add(visit[x-1], -1);
				}
				visit[x-1]=z;
			}else {
				ans[x]=seg.getsum(l[x], z+1, 0, 0, seg.size);
			}
		}
		for (long m : ans) {
			out.println(m);
		}
		out.flush();
 	}
	static class segTreesum{
		int size;
		long[] dat;
		public segTreesum(int n) {
			int n_=1;
			while (n_<n) {
				n_*=2;
			}
			size=n_;
			dat=new long[2*n_-1];
		}
		void add(int k,long a) {
			k += size-1;
			dat[k]+=a;
			while (k>0) {
				k=(k-1)/2;//親
				dat[k]+=a;
			}
		}
		long getsum(int a,int b,int k,int l,int r) {//kが節点番号,l rがその節点番号の範囲
			if (r<=a||b<=l) {
				return 0;
			}
			if (a<=l&&r<=b) {
				return dat[k];
			}
			else {
				long vl=this.getsum(a, b, k*2+1,l,(l+r)/2);
				long vr=this.getsum(a, b, k*2+2, (l+r)/2, r);
				return (vl+vr);
			}
		}//getsum(x, y, 0, 0, size)で呼ぶ
	}
	static class Pair2 implements Comparable<Pair2>{
    	public int x;
    	public int y;
    	public int z;
    	public Pair2(int x,int y,int z) {
    		this.x=x;
    		this.y=y;
    		this.z=z;
    	}
    	@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Pair2) {
    			Pair2 other = (Pair2) obj;
    			return other.x==this.x && other.y==this.y&& other.z==this.z;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.x,this.y,this.z);
    	}//これ書かないと正しく動作しない（要　勉強）
    	@Override
    	public int compareTo( Pair2 p2 ){
    		if (this.z>p2.z) {
    			return 1;
    		}
    		else if (this.z<p2.z) {
    			return -1;
    		}
    		else {
    			if (this.y>p2.y) {
        			return 1;
        		}
        		else if (this.y<p2.y) {
        			return -1;
        		}else {
					return 0;
				}
    		}
    	}
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
