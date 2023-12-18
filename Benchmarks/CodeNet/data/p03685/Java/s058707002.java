import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main{
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		long R = sc.nextLong();
		long C = sc.nextLong();
		int N = sc.nextInt();
		
		ArrayList<Long> al_index = new ArrayList<>();
		ArrayList<Long> al_point = new ArrayList<>();
		for(long i=0; i<N; ++i){
			long x1 = sc.nextLong();
			long y1 = sc.nextLong();
			long x2 = sc.nextLong();
			long y2 = sc.nextLong();
			if( (x1==0||x1==R||y1==0||y1==C)&&(x2==0||x2==R||y2==0||y2==C) ){
				al_index.add(i);
				al_index.add(i);
				al_point.add( dist(x1,y1,R,C) );
				al_point.add( dist(x2,y2,R,C) );
			}
		}
		
		int p = al_index.size();
		if(p==0){
			System.out.println("YES");
			return;
		}
		
		long[][] xs = new long[p][2];
		for(int i=0; i<p; ++i){
			xs[i][0] = al_index.get(i);
			xs[i][1] = al_point.get(i);
		}
		quickSort(xs,0,p);
		
		ArrayDeque<Integer> deq = new ArrayDeque<>(); 
		deq.add((int)xs[0][0]);
		for(int i=1; i<p; i++){
			if(deq.getLast() == (int)xs[i][0]){
				int sute = deq.pollLast();
			}else{
				deq.offerLast((int)xs[i][0]);
			}
		}
		if(deq.isEmpty()){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		return;
	}
	
	public static long dist(long x, long y, long r, long c){
		if(y==0) return x;
		else if(x==r) return y+r;
		else if(y==c) return 2L*r+c-x;
		else return 2L*r+2L*c-y;
	}
	
	public static void quickSort(long[][] a, int from, int to) {
		if (to - from <= 1) {
			return;
		}
		int i = from;
		int j = to - 1;
		long x = a[from + (new Random()).nextInt(to - from)][1];
		while (i <= j) {
			while (a[i][1] < x) {
				i++;
			}
			while (a[j][1] > x) {
				j--;
			}
			if (i <= j) {
				long t = a[i][0];
				a[i][0] = a[j][0];
				a[j][0] = t;
				t = a[i][1];
				a[i][1] = a[j][1];
				a[j][1] = t;
				i++;
				j--;
			}
		}
		quickSort(a, from, j + 1);
		quickSort(a, j + 1, to);
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