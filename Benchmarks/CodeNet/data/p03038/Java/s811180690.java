import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		
		int N = FastScanner.nextInt();
		int M = FastScanner.nextInt();
		
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = FastScanner.nextInt();
		}
		
		Arrays.sort(A);
		
		int[][] BC = new int[M][2];
		for(int i=0;i<M;i++){
			BC[i][0] = FastScanner.nextInt();
			BC[i][1] = FastScanner.nextInt();
			
		}
		Arrays.sort(BC,(a,b) -> Integer.compare(b[1], a[1]));
		
		int fetch=0;
		
		for(int i=0;i<M;i++){
			if(fetch>=N)break;
			int B = BC[i][0];
			int C = BC[i][1];
			for(int j=0;j<B;j++){
				if(fetch>=N)break;
				
				if(A[fetch]>=C){
					break;
				}else{
					A[fetch] = C;
					fetch++;
				}
				
			}
			
		}
		
		long ans = 0L;
		
		for(int q : A){
			ans += q;
		}
		
		System.out.println(ans);
			
		
		
		
		
	}
	
	
	
}
class FastScanner {
    private final static InputStream in = System.in;
    private final static byte[] buffer = new byte[1024];
    private static int ptr = 0;
    private static int buflen = 0;
    private static boolean hasNextByte() {
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
    private static int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public static boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
    public static long nextLong() {
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
    public static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}