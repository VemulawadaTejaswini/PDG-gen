import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
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
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		char A[][]=new char[H][W];
		boolean key[][]=new boolean[H][W];
		boolean black[][]=new boolean[H][W];
		int bla[][]=new int[H][W];
		Deque<Integer> q=new ArrayDeque<Integer>();
		Deque<Integer> b=new ArrayDeque<Integer>();
		int cout=0,ans=0,ans2=0;
		for(int i=0;i<H;i++){
			String S=stdIn.next();
			for(int j=0;j<W;j++){
				A[i][j]=S.charAt(j);
				if(A[i][j]=='#'){
					b.add(i);
					b.add(j);
				}
			}
		}
		for(int i=0;i<b.size();){
			int x=b.poll();
			int y=b.poll();
			int bl=1;
			if(black[x][y]==false){
				black[x][y]=true;
				key[x][y]=true;
				q.add(x);q.add(y);
				while(q.size()!=0){
					x=q.poll();y=q.poll();
					char k;
					if(A[x][y]=='#')
						k='.';
					else
						k='#';
					if(y!=W-1&&key[x][y+1]==false&&A[x][y+1]==k){
						q.add(x);q.add(y+1);
						if(k=='.')
							ans++;
						else
							if(black[x][y+1]==false){
								black[x][y+1]=true;
								bl++;
							}
						key[x][y+1]=true;
					}
					if(x!=0&&key[x-1][y]==false&&A[x-1][y]==k){
						q.add(x-1);q.add(y);
						if(k=='.')
							ans++;
						else
							if(black[x-1][y]==false){
								black[x-1][y]=true;
								bl++;
							}
						key[x-1][y]=true;
					}
					if(y!=0&&key[x][y-1]==false&&A[x][y-1]==k){
						q.add(x);q.add(y-1);
						if(k=='.')
							ans++;
						else
							if(black[x][y-1]==false){
								black[x][y-1]=true;
								bl++;
							}
						key[x][y-1]=true;
					}
					if(x!=H-1&&key[x+1][y]==false&&A[x+1][y]==k){
						q.add(x+1);q.add(y);
						if(k=='.')
							ans++;
						else
							if(black[x+1][y]==false){
								black[x+1][y]=true;
								bl++;
							}
						key[x+1][y]=true;
					}
				}
			}
			ans2+=ans*bl;
			bl=1;ans=0;
			key=new boolean[H][W];
			cout=0;
		}
		System.out.println(ans2);
	}
}
