import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {

		FastScanner sc = new FastScanner();
		int n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n - 1];

		for (int j = 0; j < n; j++) {
			a[j] = sc.nextInt();
		}

		for (int j = 0; j < n; j++) {
			b[j] = sc.nextInt();
		}

		for (int j = 0; j < n - 1; j++) {
			c[j] = sc.nextInt();
		}

		int result = Arrays.stream(b).sum();
		for (int i = 0; i < n - 1; i++) {
			result += (a[i] + 1 == a[i + 1] ? c[a[i] - 1] : 0);
		}

		System.out.println(result);
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
		if (!hasNext())
			throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }
            b = readByte();
        }
    }
    public int nextInt() {
		return (int) nextLong();
    }
    public double nextDouble() { return Double.parseDouble(next());}
}