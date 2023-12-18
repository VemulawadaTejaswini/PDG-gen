import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int Q = sc.nextInt();
		int[] s = new int[100010];
		for(int i = 3; i < 100000; i = i + 2) {
			boolean flag1 = prime(i);
			boolean flag2 = prime((i + 1) / 2);
			if (flag1 && flag2) {
				s[i] += s[i - 2] + 1;
			} else {
				s[i] = s[i - 2];
			}
		}
		for(int i = 0; i < Q; i++) {
			int left = sc.nextInt() - 2;
			if (left < 0) left = 0;
			int right = sc.nextInt();
			//out.println("right" + s[right] + " left" + s[left - 1]);
			out.println(s[right] - s[left ]);
		}		
		
		out.close();
	}

	static boolean prime(int n) {
		boolean flag = true;
		int max = (int)Math.sqrt(n);
		for (int i = 2; i <= max; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (n == 1) flag = false;
		return flag;
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

