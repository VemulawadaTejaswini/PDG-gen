import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		int sum = 0;
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		int ans = 1;
		for (int i = 1; i <= sum; ++i) {
			if (sum % i != 0)
				continue;
			int[] B = new int[N];
			for (int j = 0; j < N; ++j)
				B[j] = A[j] % i;
			Arrays.sort(B);
			int s = 0;
			while (s < B.length && B[s] == 0)
				++s;
			if (s == B.length) {
				ans = Math.max(ans, i);
				continue;
			}
			int t = B.length - 1;
			int cnt = 0;
			while (s < t && cnt <= K) {
				int sub = Math.min(i - B[t] % i, B[s]);
				B[t] += sub;
				B[s] -= sub;
				cnt += sub;
				B[t] %= i;
				B[s] %= i;
				if (B[t] == 0)
					--t;
				if (B[s] == 0)
					++s;
			}
			if (cnt <= K)
				ans = Math.max(ans, i);
		}
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(ans);
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}


class Scanner {
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