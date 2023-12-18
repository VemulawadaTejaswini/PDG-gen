import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main{
	
	public static void main(String[] args) {
		new Main().solve();
	}

	void solve() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		int[][] s=new int[N][2];
		ArrayList<Integer>[] list=new ArrayList[(int)1e6+1];
		for (int i=0;i<list.length;++i) list[i]=new ArrayList<Integer>();
		int height=0;
		int cnt=0;
		for (int i=0;i<N;++i) {
			char[] cs=sc.next().toCharArray();
			int cur=0;
			for (char c:cs) {
				if (c=='(') {
					++s[i][0];
					++cur;
				} else {
					--s[i][0];
					--cur;
				}
				s[i][1]=Math.min(s[i][1], cur);
			}
			if (s[i][1]>=0) {
				height+=s[i][0];
			} else {
				list[-s[i][1]].add(s[i][0]);
				++cnt;
			}
		}
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int p=0;
		while (cnt>0 || !pq.isEmpty()) {
			while (p<=height) {
				for (int v:list[p]) {
					pq.add(-v);
					--cnt;
				}
				++p;
			}
			if (pq.isEmpty()) {
				System.out.println("No");
				return;
			}
			int add=-pq.poll();
			height+=add;
			if (height<0) {
				System.out.println("No");
				return;
			}
		}
		if (height!=0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
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
