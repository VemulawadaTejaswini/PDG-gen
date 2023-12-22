import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
	public static class UnionFind {
		int[] parent;
		public UnionFind(int n) {
			this.parent = new int[n];
			Arrays.fill(parent, -1);
		}

		public boolean union(int a, int b) {
			if(isSame(a, b)) return false;
			parent[find(a)] = find(b);
			return true;
		}

		public int find(int a) {
			if(parent[a] < 0) return a;
			else {
				parent[a] = find(parent[a]);
				return parent[a];
			}
		}

		public boolean isSame(int a, int b) {
			return find(a) == find(b);
		}
	}

	public static class Vector {
		int s,t,w;
		public Vector(int s, int t, int w) {
			this.s = s;
			this.t = t;
			this.w = w;
		}
	}

	public static Comparator<Vector> vectorComparator = new Comparator<Vector>() {
		@Override
		public int compare(Vector v1, Vector v2) {
			return v1.w-v2.w;
		}
	};

	public static void main(String[] args) {
		FS r = new FS();
		int v = r.nextInt();
		int e = r.nextInt();
		UnionFind uf = new UnionFind(v);
		Queue<Vector> q = new PriorityQueue<Vector>(1, vectorComparator);
		for(int i=0; i<e; i++) {
			int s = r.nextInt();
			int t = r.nextInt();
			int w = r.nextInt();
			q.add(new Vector(s, t, w));
		}
		int c = 0;
		int sumW = 0;
		while(!q.isEmpty()) {
			if(c == v-1) break;
			Vector ve = q.poll();
			if(uf.union(ve.s, ve.t)) {
				c++;
				sumW += ve.w;
			}
		}
		System.out.println(sumW);
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