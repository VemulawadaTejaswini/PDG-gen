import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

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

public class Main {
	static int N;
	static int M;
	static int[] H;
	static int A[][];

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FastScanner fs = new FastScanner();
		N = fs.nextInt();
		M = fs.nextInt();
		H = new int[N+1];

		for(int i = 1; i < N+1; i++) {
			H[i] = fs.nextInt();
		}

		A = new int[M+1][3];
		for(int i = 1; i < M+1; i++) {
			A[i][1] = fs.nextInt();
			A[i][2] = fs.nextInt();
		}

		int count = 0;
		boolean[] b = new boolean[N+1];
		for(int i = 1; i < N+1; i++) {
			b[i] = true;
		}
		int max = Arrays.stream(H).max().getAsInt();
		int min = Arrays.stream(H).min().getAsInt();

		for(int i = 1; i < N+1; i++) {
			boolean flag = true;
			if(H[i] == max) {
				count++;
				continue;
			}
			if(H[i] == min) {
				continue;
			}
			if(!b[i]) {
				flag = false;
				continue;
			}
			for(int j = 1; j < M+1; j++) {
				if(A[j][1] == i) {
					if(H[i] <= H[A[j][2]]) {
						flag = false;
						break;
					}else {
						b[A[j][2]] = false;
						continue;
					}
				}
				if(A[j][2] == i) {
					if(H[i] <= H[A[j][1]]) {
						flag = false;
						break;
					}else {
						b[A[j][1]] = false;
						continue;
					}
				}

			}
			if(flag) count++;

		}
		System.out.println(count);

	}




}
