import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Djset{
		int[] a;
		
		public Djset(int n) {
			a=new int[n];
			Arrays.fill(a, -1);
		}
		
		boolean equiv(int x,int y) {
			return root(x)==root(y);
		}
		
		int root(int x) {
			return a[x]<0?x:(a[x]=root(a[x]));
		}
		
		int sz(int x) {
			return -a[root(x)];
		}
		
		void unite(int x,int y) {
			x=root(x);y=root(y);
			if(x==y)return;
			if(a[x]<a[y]) {
				x^=y;y^=x;x^=y;
			}
			a[y]+=a[x];
			a[x]=y;
		}
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		int[] A=new int[M];
		int[] B=new int[M];
		int[] C=new int[K];
		int[] D=new int[K];
		Djset ds=new Djset(N); 
		int[] ans=new int[N];
		tr(N,M,K);
		for(int i=0;i<M;++i) {
			A[i]=sc.nextInt()-1;
			B[i]=sc.nextInt()-1;
			ds.unite(A[i], B[i]);
		}
		for(int i=0;i<N;++i) {
			ans[i]=ds.sz(i)-1;
		}
		for(int i=0;i<M;++i) {
			ans[A[i]]--;ans[B[i]]--;
		}
		for(int i=0;i<K;++i) {
			C[i]=sc.nextInt()-1;
			D[i]=sc.nextInt()-1;
			if(ds.equiv(C[i], D[i])) {
				ans[C[i]]--;ans[D[i]]--;
			}
		}
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0;i<ans.length;++i) {
			pw.print(ans[i]+(i==ans.length-1?"\n":" "));
		}
		pw.close();
	}
	
	static void tr(Object... objects) {
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