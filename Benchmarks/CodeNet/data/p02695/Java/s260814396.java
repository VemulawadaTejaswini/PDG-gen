import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Random;


public class Main {
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	void dfs(int[] a,int[] b,int[] c,int[] d,int M,int[] A,int cur) {
		for (int i=(cur==0)?1:A[cur-1];i<=M;++i) {
			A[cur]=i;
			if (cur+1<A.length) dfs(a,b,c,d,M,A,cur+1);
		}
		if (cur==A.length-1) {
			long sum=0;
			for (int i=0;i<a.length;++i) {
				if (A[b[i]]-A[a[i]]==c[i]) sum+=d[i]; 
			}
			ans=Math.max(ans, sum);
		}
	}
	
	long ans=0;
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int M=sc.nextInt();
		int Q=sc.nextInt();
		int[] a=new int[Q];
		int[] b=new int[Q];
		int[] c=new int[Q];
		int[] d=new int[Q];
		for (int q=0;q<Q;++q) {
			a[q]=sc.nextInt()-1;
			b[q]=sc.nextInt()-1;
			c[q]=sc.nextInt();
			d[q]=sc.nextInt();
			if (b[q]<a[q]) {
				b[q]^=a[q];a[q]^=b[q];b[q]^=a[q];
				c[q]*=-1;
			}
		}
		int[] A=new int[N];
		Arrays.fill(A, -1);
		dfs(a,b,c,d,M,A,0);
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
    	return (int)nextLong();
    }
}