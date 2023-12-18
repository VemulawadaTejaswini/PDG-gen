import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int n = sc.nextInt();
		long ans = 0;
		for(int i = 0; i <= 262144; i++){//19682; i++){
			int a = i;
			StringBuilder S = new StringBuilder();
			int num0 = 0;
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			while(true){
				if(a%4 == 1){
					num1++;
					S.append(3);
				}else if(a%4 == 2){
					num2++;
					S.append(5);
				}
				else if(a%4 == 3){
					num3++;
					S.append(7);
				}else{
					num0++;
					S.append(0);
				}
				if(a / 4 == 0) break;
				a /= 4;
			}
			
			if(num0 >= 1) continue;
			if(num1 == 0 || num2 == 0 || num3 == 0) continue;
			S.reverse();
			//System.out.println(i + " " + S + " " + num1 + " " + num2 + " " + num3);
			if(Integer.parseInt(S.toString()) > n) continue;
			ans++;
		}
		System.out.println(ans);
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}
