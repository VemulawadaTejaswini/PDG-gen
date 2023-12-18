import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		Pair[] ABC = new Pair[N];
		long diffP = 0;
		long diffM = 0;
		for(int i = 0; i < N; i++){
			ABC[i] = new Pair(sc.nextInt(), 0, 0);
		}
		
		for(int i = 0; i < N; i++){
			ABC[i].b = sc.nextInt();
			long diff = (long)ABC[i].a - ABC[i].b;
			ABC[i].c = diff;
			if(diff >= 0) diffP += diff;
			else diffM += diff;
		}
		
		if(diffP + diffM < 0){
			System.out.println(-1);
			return;
		}
		
		Arrays.sort(ABC, (e1, e2)->(e2.a-e2.b)-(e1.a-e1.b));
		/*
		for(int i = 0; i < N; i++){
			System.out.println(ABC[i].a + " " + ABC[i].b + " " + ABC[i].c);
		}
		*/
		long[] rec = new long[N];
		for(int i = 0; i < N; i++) rec[i] = ABC[i].c;
		
		
		int indexP = 0;
		int indexM = N-1;
		
		while(true){
			if(indexP > indexM) break;
			if(ABC[indexP].c < 0 || ABC[indexM].c >= 0) break;
			
			if(ABC[indexP].c + ABC[indexM].c >= 0){
				ABC[indexP].c += ABC[indexM].c;
				ABC[indexM].c = 0;
				indexM--;
			}else{
				ABC[indexM].c += ABC[indexP].c;
				ABC[indexP].c = 0;
				indexP++;
			}
		}
		
		int num = 0;
		//System.out.println();
		for(int i = 0; i < N; i++){
			//System.out.println(ABC[i].a + " " + ABC[i].b + " " + ABC[i].c);
			if(rec[i] != ABC[i].c) num++;
		}
		
		System.out.println(num);
		
	}//end main
	
}//end Main

class Pair{
	int a; int b; long c;
	public Pair(int a, int b, long c){
		this.a = a;
		this.b = b;
		this.c = c;
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
