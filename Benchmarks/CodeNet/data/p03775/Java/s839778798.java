import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	static ArrayList<long[]> list;
	
	public static void main(String[] args) throws IOException {
		//FastScanner sc = new FastScanner(new FileInputStream("input.txt"));
		FastScanner sc = new FastScanner(System.in);
		
		long N = sc.nextLong();
		long n = N;
		list = new ArrayList<long[]>();
		Long A = (long)1, B = A;
		
		for(int i = 2; i * i <= N; i++){
			if(N % i == 0){
				long count = 0;
				while(N % i == 0){
					N /= i;
					count++;
				}
				long[] p = {i, count};
				list.add(p);
			}
		}
		if(N > 1){
			long[] p = {N, 1};
			list.add(p);
		}
		
		/*
		for(long[] p : list) System.out.println(p[0] + " " + p[1]);
		System.out.println();
		*/
		
		int min = Integer.MAX_VALUE;
		ArrayList<P> queue = new ArrayList<>();
		queue.add(new P(0, 1));
		
		while(queue.size() != 0){
			P q = queue.remove(0);
			if(q.index == list.size()){
				//System.out.println("A = " + q.A + " B = " + n/q.A);
				min = Math.min(min, F(q.A, n/q.A));
			}else{
				long[] li = list.get(q.index);
				long p = li[0];
				long count = li[1];
				long nextA = q.A;
				for(int i = 0; i <= count; i++){
					queue.add(new P(q.index+1, nextA));
					nextA *= p;
				}
			}
		}
		
		System.out.println(min);
	}
	
	public static int F(long A, long B){
		String sA = String.valueOf(A);
		String sB = String.valueOf(B);
		return Math.max(sA.length(), sB.length());
	}
}

class P{
	int index;
	long A;
	public P(int index, long A){
		this.index = index;
		this.A = A;
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
