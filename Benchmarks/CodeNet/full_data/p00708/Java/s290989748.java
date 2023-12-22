import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;



public class Main {
	static final int INF = 2 << 28;
	static final long INF_L = 2L << 60;
	static final int  MOD = 1000000007;
	static final long MOD_L = 1000000007L;
	static final int[] vx_4 = {1,0,-1,0};
	static final int[] vy_4 = {0,-1,0,1};
	static final int[] vx_5 = {1,0,-1,0,0};
	static final int[] vy_5 = {0,1,0,-1,0};
	static final int[] vx_8 = {1,1,1,0,0,-1,-1,-1};
	static final int[] vy_8 = {1,0,-1,1,-1,1,0,-1};
	static final int[] vx_9 = {1,1,1,0,0,0,-1,-1,-1};
	static final int[] vy_9 = {1,0,-1,1,0,-1,1,0,-1};

	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Cell[] cell = new Cell[n];
			Edge[] edges = new Edge[(n * (n-1)) / 2];
			for(int i = 0; i < n; i++) {
				cell[i] = new Cell(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
			}
			int idx = 0;
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					double distC = dist(cell[i],cell[j]);
					double distF = distC - cell[i].r - cell[j].r;
					edges[idx++] = new Edge(i,j,Math.max(distF,0));
				}
			}
			PriorityQueue<Edge> q = new PriorityQueue<Edge>();
			for(int i = 0; i < edges.length; i++) {
				q.add(edges[i]);
			}
			UnionFind uf = new UnionFind(n);
			double cost = 0;
			while(!q.isEmpty()) {
				Edge e = q.poll();
				if(!uf.findSet(e.v1, e.v2)) {
					uf.unionSet(e.v1, e.v2);
					cost += e.cost;
				}
			}
			System.out.printf("%.3f\n",cost);
			
		}
	}
	static class UnionFind {
		int[] data;
		UnionFind(int size) {
			data = new int[size];
			Arrays.fill(data, -1);
		}
		boolean unionSet(int x, int y) {
			x = root(x); 
			y = root(y);
			if (x != y) {
				if (data[y] < data[x]) {
					int tmp = x;
					x = y;
					y = tmp;
				}
				data[x] += data[y]; 
				data[y] = x;
			}
			return x != y;
		}
		boolean findSet(int x, int y) {
			return root(x) == root(y);
		}
		int root(int x) {
			return data[x] < 0 ? x : (data[x] = root(data[x]));
		}
		int size(int x) {
			return -data[root(x)];
		}
	}
	
	static double dist(Cell a, Cell b) {
		return Math.sqrt((Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2) + Math.pow(a.z - b.z, 2)));
	}
	
	static class Edge implements Comparable<Edge> {
		int v1;
		int v2;
		double cost;
		Edge(int a, int b, double c) {
			v1 = a;
			v2 = b;
			cost = c;
		}
		@Override
		public int compareTo(Edge o) {
			if(o.cost < this.cost) return 1;
			else if(o.cost > this.cost) return -1;
			return 0;
		}
		
	}
	static class Cell {
		double x;
		double y;
		double z;
		double r;
		Cell(double a, double b, double c, double d) {
			x = a;
			y = b;
			z = c;
			r = d;
		}
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
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
    	if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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
}