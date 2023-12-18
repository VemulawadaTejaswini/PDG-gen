import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	static int N;
	static int K;
	static int[] P;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		N = sc.nextInt();
		K = sc.nextInt();

		P = new int[N];
		for(int i = 0;i <= N - 1;i++) {
			P[i] = sc.nextInt();
		}

		boolean[] isUp = new boolean[N];
		Arrays.fill(isUp, true);
		int nextFill = 0;
		for(int i = 0;i <= N - 2;i++) {
			if(P[i] > P[i + 1]) {
				for(int j = Math.max(nextFill, i - K + 2);j <= Math.min(i, N - K);j++) {
					isUp[j] = false;
				}
				nextFill = i + 1;
			}
		}


		int count = 1;
		boolean isUpFlag = isUp[0];

		int Max = myMaxMin(0, K - 1, true);
		int Min = myMaxMin(0, K - 1, false);

		for(int first = 1;first <= N - K;first++) {

			int last = first + K - 1;

//			for(int i = first;i <= last;i++) {
//				System.out.print(P[i] + ",");
//			}
//			System.out.println();

			if(isUp[first]) {
				if(isUpFlag) {
//					System.out.println("a");
				} else {
					count++;
					isUpFlag = true;
				}
			}else if(P[last] > Max && P[first - 1] == Min) {
//				System.out.println("b");
			}else {
				count++;
			}

			if(P[last] > Max) {
				Max = P[last];
			}
			if(P[last] < Min) {
				Min = P[last];
			}
			if(P[first - 1] == Max) {
				Max = myMaxMin(first, last, true);
			}
			if(P[first - 1] == Min) {
				Min = myMaxMin(first, last, false);
			}
		}

		System.out.println(count);

	}

	static int myMaxMin(int f, int l, boolean b) {
		int M = P[f];
		if(b) {
			for(int i = f + 1;i <= l;i++) {
				if(M < P[i]) M = P[i];
			}
		}else {
			for(int i = f + 1;i <= l;i++) {
				if(M > P[i]) M = P[i];
			}
		}
		return M;
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