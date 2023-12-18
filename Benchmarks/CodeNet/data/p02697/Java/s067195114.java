import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class Main {
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int M=sc.nextInt();
		solve(N,M);
	}
	void solve(int N,int M) {
		int s0=0,t0=1;
		int s1=N/2,t1=(N/2+2)%N;
		ArrayList<int[]> ans=new ArrayList<>();
		boolean[] vis=new boolean[N];
		for (int i=0;i<M;++i) {
			if (!vis[s0]&&!vis[t0]) {
				vis[s0]=true;vis[t0]=true;
				ans.add(new int[] {s0,t0});
			}
			if (!vis[s1]&&!vis[t1]) {
				vis[s1]=true;vis[t1]=true;
				ans.add(new int[] {s1,t1});
			}
			s0=(s0+N-1)%N;
			t0=(t0+1)%N;
			s1=(s1+N-1)%N;
			t1=(t1+1)%N;
		}
		PrintWriter pw=new PrintWriter(System.out);
		for (int i=0;i<M;++i) {
			pw.println(ans.get(i)[0]+1+" "+(ans.get(i)[1]+1));
		}
		pw.close();
	}
	
	// 1 2
	// 3 5
	// 4 
	// 1+2+3+...+M/2=N/2*
	
	
	
	// 1 4
	// 2 5
	// 3 6
	
	// 
	
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