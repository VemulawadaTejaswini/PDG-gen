import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Main {
	public static class UnionFind{
		int[] par;
		UnionFind(int n){
			par=new int[n];
			for(int i=0;i<n;i++)par[i]=i;
		}
		public int find(int x){
			if(par[x]==x)return x;
			return par[x]=find(par[x]);
		}
		public boolean same(int x,int y){
			return find(x)==find(y);
		}
		public boolean unite(int x,int y){
			if(find(x)==find(y)) return false;
			par[find(x)]=find(y);
			return true;
		}
	}

	public static void main(String[] args) {
		FS r = new FS();
		int N = r.nextInt();
		int M = r.nextInt();
		UnionFind uf = new UnionFind(N);
		ArrayList<ArrayList<Integer>> lang = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<M; i++) {
			lang.add(new ArrayList<Integer>());
		}
		for(int i=0; i<N; i++) {
			int k = r.nextInt();
			for(int j=0; j<k; j++) {
				lang.get(r.nextInt()-1).add(i);
			}
		}
		int counter = 0;
		for(int i=0; i<M; i++) {
			ArrayList<Integer> lst = lang.get(i);
			for(int j=0; j<lst.size()-1; j++) {
				if(uf.unite(lst.get(j), lst.get(j+1))) counter++;
			}
		}
		if(counter+1==N) System.out.println("YES");
		else System.out.println("NO");
	}
	
	public static void solver() {
		// write logic
	}
	
	// Read Class
	static class FS {
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}