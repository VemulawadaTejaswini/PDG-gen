import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	static int h;
	static int w;
	static int[][] s;
	static int[][] os;
	static final int[] dx = {0, 1, 0, -1};
	static final int[] dy = {1, 0, -1, 0};
	static int[][] v;
	static int[][] ov;

	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		h = scan.nextInt();
		w = scan.nextInt();

		os = new int[h][w];
		ov = new int[h][w];
		s = new int[h][w];
		v = new int[h][w];

		int i,j,k,l,m;
		String temp;
		for(i = 0; i < h; i++) {
			temp = scan.next();
			for(j = 0; j < w; j++) {
				if(temp.substring(j, j + 1).equals("."))
					os[i][j] = Integer.MAX_VALUE;
				else {
					os[i][j] = Integer.MAX_VALUE;
					ov[i][j] = 2;
				}
			}
		}

		int ans = Integer.MIN_VALUE;
		for(i = 0; i < h; i++) {
			for(j = 0; j < w; j++) {
				if(ov[i][j] == 2)
					continue;

				for(k = 0; k < h; k++) {
					System.arraycopy(os[k], 0, s[k], 0, w);
					System.arraycopy(ov[k], 0, v[k], 0, w);
				}

				v[i][j] = 2;
				s[i][j] = 0;
				dij(i, j);

				for(l = 0; l < h; l++) {
					for(m = 0; m < w; m++) {
						if(ov[l][m] == 2)
							continue;
						ans = Math.max(ans, s[l][m]);
					}
				}
			}
		}

		out.print(ans);
		out.close();
	}
	static void dij(int x, int y) {

		int i,j,tempX,tempY;
		while(true) {

			for(i = 0; i < 4; i++) {
				tempX = x + dx[i];
				tempY = y + dy[i];

				if(!(0 <= tempX && tempX < h && 0 <= tempY && tempY < w))
					continue;
				if(v[tempX][tempY] == 2)
					continue;

				v[tempX][tempY] = 1;
				s[tempX][tempY] = Math.min(s[tempX][tempY], s[x][y] + 1);
			}

			int min = Integer.MAX_VALUE;
			for(i = 0; i < h; i++) {
				for(j = 0; j < w; j++) {
					if(v[i][j] != 1)
						continue;
					if(s[i][j] < min) {
						min = s[i][j];
						x = i;
						y = j;
					}
				}
			}
			v[x][y] = 2;

			boolean f = true;
			for(i = 0; i < h; i++) {
				for(j = 0; j < w; j++) {
					if(v[i][j] != 2) {
						f = false;
						break;
					}
				}
				if(!f)
					break;
			}

			if(f) {
				break;
			}
		}
	}
}
class cal{
	long mod;

	cal(long x){
		this.mod = x;
	}
	long mpow(long x, long n) {
		if(n == 0)
			return 1;
		if(n % 2 == 0) {
			long root = mpow(x, n / 2);
			return root * root % mod;
		}else {
			return x * mpow(x, n - 1) % mod;
		}
	}

	long mcomb(long a, long b) {
		if(b > a - b)
			return mcomb(a, a - b);
		long m = 1;
		long d = 1;
		long i;
		for(i = 0; i < b; i++) {
			m *= (a - i);
			m %= mod;
			d *= (i + 1);
			d %= mod;
		}
		long ans = m * mpow(d, mod - 2) % mod;

		return ans;
	}
}
class unionFind{
	int[] par;
	int[] size;

	unionFind(int x){
		this.par = new int[x + 1];
		this.size = new int[x + 1];

		int i;
		for(i = 0; i <= x; i++)
			this.par[i] = i;
		Arrays.fill(this.size, 1);
	}

	int root(int x) {
		int r = x;
		while (r != this.par[r]) {
	        r = this.par[r];
	      }

		return r;
	}

	void union(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		if(rx == ry)
			return;

		if(this.size[rx] < this.size[ry]) {
			this.size[ry] += this.size[rx];
			this.par[rx] = ry;
		}else {
			this.size[rx] += this.size[ry];
			this.par[ry] = rx;
		}
	}

	int size(int x) {
		return this.size[root(x)];
	}

	boolean same(int x, int y) {
		int rx = root(x);
		int ry = root(y);

		return rx == ry;
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
