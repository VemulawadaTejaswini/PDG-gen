import java.io.*;
import java.util.*;
public class Main {
	static long MOD = 2 << 29;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		char[] str = sc.next().toCharArray();
		int id = 0;
		for(int i = 0; i < str.length; i++) {
			if(str[i] == '?') {
				id = i;
				break;
			}
		}
		int ans = check(str,id);
		if(ans == -1) System.out.println("MULTIPLE");
		else System.out.println(ans);
	}
	
	static int check(char[] str, int id) {
		int ans = -1;
		for(int i = 0; i < 10; i++) {
			str[id] = (char)('0' + i);
			if(ok(str) && ans == -1) {
				ans = i;
			}
			else if(ok(str))  {
				return -1;
			}
		}
		return ans;
	}
	static boolean ok(char[] str) {
		int sum = 0;
		for(int i = 1; i < str.length; i++) {
			int check = 12 - i;
			if(check >= 7) {
				sum += (str[i-1] - '0') * (check - 5);
			}
			else {
				sum += (str[i-1] - '0') * (check + 1);
			}
		}
		sum %= 11;
		int checksum = 0;
		if(sum <= 1) {
			checksum = 0;
		}
		else {
			checksum = 11 - sum;
		}
		return str[str.length-1] == (char)('0' + checksum);
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
    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
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
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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