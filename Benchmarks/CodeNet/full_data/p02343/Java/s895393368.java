import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Arrays;

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

	public static void main(String[] args) {
		FS r = new FS();
		int n = r.nextInt();
		int q = r.nextInt();
		UnionFind uf = new UnionFind(n);
		for(int i=0; i<q; i++) {
			int c = r.nextInt();
			int x = r.nextInt();
			int y = r.nextInt();
			if(c == 0) {
				uf.union(x, y);
			} else {
				if(uf.isSame(x, y)) System.out.println(1);
				else System.out.println(0);
			}
		}
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