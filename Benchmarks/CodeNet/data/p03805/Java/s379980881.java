import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
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
public class Main {
	static FastScanner stdIn=new FastScanner();
	static int N=stdIn.nextInt();
	static int M=stdIn.nextInt();
	static ArrayList<ArrayList<Integer>>G=new ArrayList<ArrayList<Integer>>();
	static boolean visited[]=new boolean[N];
	static int ans=0,num=0;
	public static void main(String[] args) {
		for(int i=0;i<N;i++){
			G.add(new ArrayList<Integer>());
		}
		for(int i=0;i<M;i++){
			int a=stdIn.nextInt()-1;
			int b=stdIn.nextInt()-1;
			ArrayList<Integer> c=new ArrayList<Integer>();
			c=G.get(a);c.add(b);G.set(a,c);
			c=G.get(b);c.add(a);G.set(b,c);
		}
		dfs(0);
		System.out.println(ans);
	}
	static void dfs(int now){
		visited[now]=true;
		num++;
		if(num==N)
			ans++;
		for(int i=0;i<G.get(now).size();i++){
			if(visited[G.get(now).get(i)]==false)
				dfs(G.get(now).get(i));
		}
		visited[now]=false;
		num--;
	}
}
