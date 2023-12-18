import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static long[][] memo;
    static ArrayList<Infant> infants;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		N =sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) 
			A[i] = sc.nextLong();
	    memo = new long[N + 1][N + 1];
	    for(int i = 0; i < N + 1; i++) {
	    	Arrays.fill(memo[i], -1);
	    }
	    infants = new ArrayList<>();
	    for(int i = 0; i < N; i++) {
	    	infants.add(new Infant(i, A[i]));
	    }
	    Collections.sort(infants);
	   long ans = Rec(0,0);
	   out.println(ans);
		
		out.close();
	}
	//幼児の元の位置のインデックスと活発度を記録するクラス
	static class Infant implements Comparable<Infant>{
		int index;
		Long param;
		
		Infant(int n, long m){
			this.index = n;
			this.param = m;
		}

		@Override
		public int compareTo(Infant o) {
			// 活発度の大きい順に取り出す
			return - this.param.compareTo(o.param);
		}		
	}
	static long Rec(int n, int l) {
		if (n == N) return 0;
		
		if (memo[n][l] >= 0) return memo[n][l];
		
		int r = N - (n - l);
		Infant infant = infants.get(n);
		long u = (r - infant.index - 1) * infant.param;
		long res1 = Rec(n + 1, l) + u;
		
		long v = (infant.index - l) * infant.param;
		long res2 = Rec(n + 1, l + 1) + v;
		
		long res = Math.max(res1, res2);
		memo[n][l] = res;
		return res;
		
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


