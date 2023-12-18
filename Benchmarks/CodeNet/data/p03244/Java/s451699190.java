import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] odd = new int[100000 + 10]; //奇数番目
		int[] even = new int[100000 + 10]; //偶数番目
		for(int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				even[sc.nextInt()]++;
			} else {
				odd[sc.nextInt()]++;
			}
		}
		int oddFir = -1, oddSec = -1, evenFir = -1, evenSec = -1;
		for(int i = 1; i < odd.length; i++) {
			if ( odd[i] > oddFir) {
				oddSec = oddFir;
				oddFir = i;
			} else if (odd[i] > oddSec){
				oddSec = i;
			}
			if ( even[i] > evenFir) {
				evenSec = evenFir;
				evenFir = i;
			} else if (even[i] > evenSec){
				evenSec = i;
			}			
		}
		int cnt = 0;
		if (oddFir != evenFir) {
			cnt =( n / 2 - odd[oddFir]) + (n / 2 - even[evenFir]);
		} else if (odd[oddFir] < even[evenFir]){
			cnt = (n / 2 - odd[oddSec]) + (n / 2 - even[evenFir]);
		} else {
			cnt = (n / 2 - odd[oddFir]) + (n / 2 - even[evenSec]);
		}
			
		out.println(cnt);

		out.close();
	}

static class FastScanner {
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
}