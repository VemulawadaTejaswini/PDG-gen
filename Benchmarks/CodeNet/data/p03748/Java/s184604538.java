import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main{
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		long MOD=1000000007;
		long ans=1;
		long keisan=2;
		
		
		if(n==1){
			for(int i=0;i<m+1;i++){
				ans*=2;
				if(ans>MOD) ans%=MOD;
			}
			System.out.println(ans);
			return;
		}else if(n>=m){
			for(int i=0;i<m;i++){
				ans*=4;
				if(ans>MOD) ans%=MOD;
			}
			System.out.println(ans);
			return;
		}
		
		long[][] baai = new long[2][n];
		for(int i=0; i<n; i++){
			baai[0][i] = 1;
		}
		
		for(int i=0; i<m-1; i++){
			for(int j=0; j<n; j++){
				if(j==0 || j==n-1){
					baai[1][j] = 2*baai[0][j]+1;
				}else if(j==n-1){
					baai[1][j] = 2*baai[0][j]+1;
				}else{
					baai[1][j] = 2*baai[0][j]+2;
				}
			}
			for(int j=0; j<n; j++){
				baai[0][j]=baai[1][j];
				if(baai[0][j]>MOD) baai[0][j] -= MOD;
			}
		}
		
		ans=0;
		for(int i=0; i<n; i++){
			ans+=baai[0][i];
			if(ans>MOD) ans -= MOD;
		}
		System.out.println(ans*4%MOD);
		return;
		
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