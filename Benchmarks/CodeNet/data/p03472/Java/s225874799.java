import java.io.*;
import java.util.*;

public class Main {
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		int H = sc.nextInt();
		int maxA = 0, withB = 1000000001, maxIndex = -1;
		int[][] ab = new int[N][2];
		for(int i = 0; i < N; i++){
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
			if(ab[i][0] > maxA || (ab[i][0] == maxA && ab[i][1] < withB)){
				maxA = ab[i][0];
				withB = ab[i][1];
				maxIndex = i;
			}
		}
		Arrays.sort(ab, (e1, e2)->e2[1]-e1[1]);
		
		int num = 0;
		for(int i = 0; i < N; i++){
			if(H < 0) break;
			if(ab[i][1] >= maxA){
				if(maxIndex != i){
					H -= ab[i][1];
					num++;
				}
			}else{
				break;
			}				
		}
		
		if(H < 0){
			System.out.println(num);
			return;
		}
		
		if(maxA >= ab[maxIndex][1]){
			num += (int)Math.ceil(1.0 * H / maxA);
		}else{
			H -= ab[maxIndex][1];
			num++;
			if(H > 0)
				num += (int)Math.ceil(1.0 * H / maxA);
		}
		System.out.println(num);		
		
	}//end main
	
}//end Main

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
