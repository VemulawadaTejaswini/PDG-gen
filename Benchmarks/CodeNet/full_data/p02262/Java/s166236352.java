import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main{
	static int cnt = 0;
	static List<Integer> G;
	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		int n = scan.nextInt();
		int[]A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		//scan.close();
		shellSort(A, n);
		System.out.println(G.size());
		for(int i = G.size() - 1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(G.get(i));
			}else {
				System.out.print(G.get(i) + " ");
			}
		}
		System.out.println(cnt);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(A[i]).append("\n");
			//System.out.println(A[i]);
		}
		System.out.println(sb.toString());
	}
	static void insertionSort(int[]A, int n, int g) {
		for(int i = g; i < n; i++) {
			int v = A[i];
			int j = i - g;
			while(j >= 0 && A[j] > v) {
				A[j + g] = A[j];
				j = j - g;
				cnt ++;
			}
			A[j + g] = v;
		}
	}
	static void shellSort(int[]A, int n) {
		cnt = 0;
		G = new ArrayList<Integer>();
		int h = 1;
		while(true) {
			if(h > n) {
				break;
			}
			G.add(h);
			h = 3 * h + 1;
		}
		for(int i = G.size() - 1; i >= 0; i--) {
			insertionSort(A, n, G.get(i));
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
