import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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
	public static void main(String[] args) {
		int N=stdIn.nextInt();
		int u=stdIn.nextInt()-1;
		int v=stdIn.nextInt()-1;
		boolean taka[]=new boolean[N];
		boolean aoki[]=new boolean[N];
		ArrayList<ArrayList<Integer>> tree=new ArrayList<ArrayList<Integer>>();
		Deque<Integer> T=new ArrayDeque<Integer>();
		Deque<Integer> A=new ArrayDeque<Integer>();
		int cout=0,ans=0;
		for(int i=0;i<N;i++){
			tree.add(new ArrayList<Integer>());
		}
		for(int i=0;i<N-1;i++){
			int a=stdIn.nextInt()-1;
			int b=stdIn.nextInt()-1;
			ArrayList<Integer> c=new ArrayList<Integer>();
			c=tree.get(a);c.add(b);tree.set(a,c);
			c=tree.get(b);c.add(a);tree.set(b,c);
		}
		T.add(u);A.add(v);aoki[v]=true;
		while(T.size()>0){
			int t=T.size();
			int a=A.size();
			for(int i=0;i<t;i++){
				int k=T.poll();
				for(int j=0;j<tree.get(k).size();j++){
					if(taka[tree.get(k).get(j)]==false&&aoki[tree.get(k).get(j)]==false){
						T.add(tree.get(k).get(j));
						taka[tree.get(k).get(j)]=true;
						cout++;
					}
				}
			}
			if(T.size()==0)
				break;
			for(int i=0;i<a;i++){
				int k=A.poll();
				for(int j=0;j<tree.get(k).size();j++){
					if(aoki[tree.get(k).get(j)]==false){
						if(taka[tree.get(k).get(j)]){
							cout--;
							taka[tree.get(k).get(j)]=false;
						}
						A.add(tree.get(k).get(j));
						aoki[tree.get(k).get(j)]=true;
					}
				}
			}
			ans++;
			if(cout==0)
				break;
			cout=0;
			taka=new boolean[N];
		}
		if(u==v)
			System.out.println(0);
		else
			System.out.println(ans);
	}
}
