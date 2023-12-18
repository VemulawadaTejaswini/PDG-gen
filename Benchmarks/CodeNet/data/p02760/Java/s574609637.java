import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String args[]) throws IOException {
		FastScanner fs = new FastScanner();
		List<Integer> masu = new ArrayList<>();
		List<Integer> indexList = new ArrayList<>();
		boolean bingoflg = false;
		for(int i = 0; i < 9; i++) {
			masu.add(fs.nextInt());
		}
		int n = fs.nextInt();
		int b;
		for(int j = 0; j < n; j++) {
			b = fs.nextInt();
			if(masu.contains(b)) {
				indexList.add(masu.indexOf(b));
			}
		}
		for(int v : indexList) {
			switch(v) {
				case 0:
					if(indexList.contains(1) && indexList.contains(2) || indexList.contains(3) && indexList.contains(6)) {
						bingoflg = true;
					}
					break;
				case 4:
					if(indexList.contains(1) && indexList.contains(7) || indexList.contains(3) && indexList.contains(5) || indexList.contains(2) && indexList.contains(6) || indexList.contains(0) && indexList.contains(8)) {
						bingoflg = true;
					}
					break;
				case 8:
					if(indexList.contains(6) && indexList.contains(7) || indexList.contains(2) && indexList.contains(5) ) {
						bingoflg = true;
					}
					break;
			}
		}
		if(bingoflg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
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

