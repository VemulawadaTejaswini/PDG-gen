import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args){
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        Long[] X = new Long[N];
        Long[] L = new Long[N];
        TreeMap<Long,Long> interval = new TreeMap<Long,Long>();
        for(int i=0;i<N;i++){
            X[i] = sc.nextLong();
            L[i] = sc.nextLong();
            interval.put(X[i]+L[i],X[i]-L[i]);
        }
        int result = 1;
        long now = interval.firstKey();
        for(long right : interval.keySet()){
            if(now<=interval.get(right)){
                now = right;
                result++;
            }
        }


        out.println(result);

        out.flush();
    }
        
}

class Pair<A, B> {
	public final A car;
	public final B cdr;
	public Pair(A car_, B cdr_) {car = car_; cdr = cdr_;}

	private static boolean eq(Object o1, Object o2) {return o1 == null ? o2 == null : o1.equals(o2);}
	private static int hc(Object o) {return o == null ? 0 : o.hashCode();}

	@Override public boolean equals(Object o) {
		if (! (o instanceof Pair)) return false;
		Pair<?, ?> rhs = (Pair<?, ?>) o;
		return eq(car, rhs.car) && eq(cdr, rhs.cdr);
	}
	@Override public int hashCode() {return hc(car) ^ hc(cdr);}
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