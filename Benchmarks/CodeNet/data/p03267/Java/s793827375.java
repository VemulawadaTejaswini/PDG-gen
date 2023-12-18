import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int L = sc.nextInt();
		int r=0;
		List<Pair> resList = new ArrayList<>();
		for(int i=19;i>0;i--){
			if(Math.pow(2, i)<=L){
				r = i;
				break;
			}
		}
		int N = r+1;
		for(int i=1;i<N;i++){
			resList.add(new Pair(i,i+1,0));
			resList.add(new Pair(i, i+1, (int)Math.pow(2, i-1)));
		}
		for(int i=r;i>0;i--){
			int tmp = (int) Math.pow(2, i-1);
			if((L-tmp)>=Math.pow(2, r)){
				resList.add(new Pair(i, N, (int) tmp));
				L -= tmp;
			}
		}
		out.println(N+" "+resList.size());
		for(Pair tmp: resList){
			out.println(tmp.u+" "+tmp.v+" "+tmp.w);
		}
		out.flush();
	}
}

class Pair{
	final int u;
	final int v;
	final int w;
	public Pair(int u, int v, int w){
		this.u=u;
		this.v=v;
		this.w=w;
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