import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<ID> list = new ArrayList<ID>();
		for (int i = 0; i < M; i++) {
			list.add(new ID(i, sc.nextInt(), sc.nextInt()));
		}
		Comparator<ID> comp = Comparator.comparing(ID::getP).thenComparing(Comparator.comparing(ID::getY));
		list.sort(comp);
		String[] ans = new String[M];
		int c = 1;
		int pre = 0;
		for (ID temp : list) {
			if (pre != temp.P) {
				pre = temp.P;
				c = 1;
			}
			ans[temp.i] = padding(String.valueOf(temp.P), String.valueOf(c));
			c++;
		}
		for (String a : ans) {
			System.out.println(a);
		}
	}
	static class ID {
		int i;
		int P;
		int Y;
		
		int getI() {
			return i;
		}
		int getP() {
			return P;
		}
		int getY() {
			return Y;
		}
		ID (int i, int P, int Y) {
			this.i = i;
			this.P = P;
			this.Y = Y;
		}
	}
	static String padding(String P, String Y) {
		return P.format("%6s", P).replace(" ", "0")+Y.format("%6s", Y).replace(" ", "0") ;
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

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}