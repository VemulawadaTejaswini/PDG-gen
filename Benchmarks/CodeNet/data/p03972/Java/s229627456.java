import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintStream out = System.out;
	static long sumX[];
	static long sumY[];

	public static void main(String args[]) {
		int W = ni();
		int H = ni();
		int p[] = na(W);
		int q[] = na(H);
		sumX = new long[W+1];
		sumY = new long[H+1];
		for (int x=0;x<W;x++) {
			sumX[x+1] = sumX[x] + p[x];
		}
		for (int y=0;y<H;y++) {
			sumY[y+1] = sumY[y] + q[y];
		}

		System.out.println(f(0, 0, W, H, p, q));
	}

	private static long f(int x0, int y0, int x1, int y1, int p[], int q[]) {
		if (x0 == x1) {
			long ret = 0;
			/*
			for (int y=y0;y<y1;y++) {
				ret += q[y];
			}
			*/
			ret = sumY[y1] - sumY[y0];
			return ret;
		} else if (y0 == y1) {
			long ret = 0;
			/*
			for (int x=x0;x<x1;x++) {
				ret += p[x];
			}
			*/
			ret = sumX[x1] - sumX[x0];
			return ret;
		}

		int maxX = 0;
		int maxY = 0;
		int maxXidx = 0;
		int maxYidx = 0;
		for (int x=x0;x<x1;x++) {
			if (maxX < p[x]) {
				maxX = p[x];
				maxXidx = x;
			}
		}
		for (int y=y0;y<y1;y++) {
			if (maxY < q[y]) {
				maxY = q[y];
				maxYidx = y;
			}
		}

		if (maxX > maxY) {
			long ret = f(x0, y0, maxXidx, y1, p, q) + f(maxXidx+1, y0, x1, y1, p, q) + maxX;
			/*
			System.out.printf("f(%d,%d,%d,%d) = %2d (f(%d,%d,%d,%d) + f(%d,%d,%d,%d), %d)\n", x0, y0, x1, y1, ret,
					x0, y0, maxXidx, y1,
					maxXidx+1, y0, x1, y1,
					maxX);
					*/
			return ret;
		} else {
			long ret = f(x0, y0, x1, maxYidx, p, q) + f(x0, maxYidx+1, x1, y1, p, q) + maxY;
			/*
			System.out.printf("f(%d,%d,%d,%d) = %2d (f(%d,%d,%d,%d) + f(%d,%d,%d,%d): %d)\n", x0, y0, x1, y1, ret,
					x0, y0, x1, maxYidx,
					x0, maxYidx+1, x1, y1,
					maxY);
					*/
			return ret;
		}
	}

	private static String next() {
		return sc.next();
	}

	private static int ni() {
		return sc.nextInt();
	}

	private static long nl() {
		return sc.nextLong();
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

	private static long[] nal(int n) {
		long[] a = new long[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

    private static double nd() {
        return Double.parseDouble( next() );
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
}
