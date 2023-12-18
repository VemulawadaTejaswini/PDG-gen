import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		h=scanner.nextInt();
		w=scanner.nextInt();
		String[][] board=new String[h][w];
		Map<Integer,Boolean>map=new HashMap<>();
		for(int i=0;i<h;i++) {
			board[i]=scanner.next().split("");
		}
		UnionFind uf=new UnionFind(h*w);
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				int id=i*w+j;
				String tarS=board[i][j];
				check4Neighborhood(board, j, i, uf, tarS);
				if(tarS.equals("#")) {
					map.put(id, true);
				}else {
					map.put(id, false);
				}
			}
		}
		Set<Integer>set=new HashSet<>();
		int[] parent=uf.parent;
		int ans=0;
		for(int i=0;i<parent.length;i++) {
			int black=0;
			int white=0;
			if(set.contains(parent[i]))continue;
			for(int j=0;j<parent.length;j++) {
				if(uf.same(i, j)) {
					if(map.get(j)) {
						black++;
					}else {
						white++;
					}
				}
			}
			ans+=black*white;
			set.add(parent[i]);
		}
		System.out.println(ans);
	}
	
	static int h;
	static int w;
	private static boolean check4Neighborhood(String[][] s, int x, int y, UnionFind uf, String tarS) {
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if ((i == 0 && j != 0) || (i != 0 && j == 0)) {
					int tarX = j + x;
					int tarY = i + y;
					if (0 <= tarX && tarX <= s[0].length - 1 && 0 <= tarY && tarY <= s.length - 1) {
						if (!s[tarY][tarX].equals(tarS)) {
							uf.union(tarY*w+tarX, y*w+x);
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}

class UnionFind {
	int parent[];
	int rank[];

	public UnionFind(int n) {
		parent = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}

	public boolean same(int x, int y) {
		return root(x) == root(y);
	}

	public int root(int x) {
		if (parent[x] == x) {
			return x;
		} else {
			return parent[x] = root(parent[x]);
		}
	}

	public void union(int x, int y) {
		x = root(x);
		y = root(y);
		if (x != y) {
			if (rank[x] > rank[y]) {
				parent[y] = x;
			} else {
				parent[x] = y;
				if (rank[x] == rank[y]) {
					rank[y]++;
				}
			}
		}
		return;
	}

	public int count(int n) {
		int ret = 0;
		for (int i = 0; i < n; i++) {
			if (i == root(i)) {
				ret++;
			}
		}
		return ret;
	}

}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
