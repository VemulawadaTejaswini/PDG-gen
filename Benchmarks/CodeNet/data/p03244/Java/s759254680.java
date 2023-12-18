import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int[] evenc = new int[1000000];
		int[] oddc = new int[1000000];
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (i % 2 == 0) {
				evenc[num]++;
			} else {
				oddc[num]++;
			}
		}
		int evenm = 0;
		int evens = 0;
		int oddm = 0;
		int odds = 0;
		for (int i = 0; i < 1000000; i++) {
			if (evenc[i] > evenc[evenm]) {
				evens = evenm;
				evenm = i;
			} else if (evenc[i] > evenc[evens]) {
				evens = i;
			}
			
			if (oddc[i] > oddc[oddm]) {
				odds = oddm;
				oddm = i;
			} else if (oddc[i] > oddc[odds]) {
				odds = i;
			}
		}
		int ans = 0;
		if (evenm != oddm) {
			ans = evenc[evenm] + oddc[oddm];
		} else {
			ans = Math.max(evenc[evenm]+oddc[odds], evenc[evens]+oddc[odds]);
		}
		System.out.println(N-ans);
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