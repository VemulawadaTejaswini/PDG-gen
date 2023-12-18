import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main{
	
	public static void main(String[] args) {
		new Main().solve();
	}

	void solve() {
		FastScanner sc=new FastScanner();
		int N=sc.nextInt();
		char[][] cs=new char[N][];
		int tot=0;
		PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (Math.signum(o1[0])!=Math.signum(o2[0])) {
					return -Integer.compare((int)Math.signum(o1[0]), (int)Math.signum(o2[0]));
				} else if ((int)Math.signum(o1[0])>=0){
					return -Integer.compare(o1[1], o2[1]);
				} else {
					return -Integer.compare(-o1[1]+o1[0], -o2[1]+o2[0]);
				}
			}
		});
		for (int i=0;i<N;++i) {
			cs[i]=sc.next().toCharArray();
			int sum=0;
			int min=0;
			for (char c:cs[i]) {
				if (c=='(') ++sum;
				else --sum;
				min=Math.min(min, sum);
			}
			tot+=sum;
			pq.add(new int[] {sum,min});
		}
		if (tot!=0) {
			System.out.println("No");
			return;
		}
		int cur=0;
		while (!pq.isEmpty()) {
			int[] query=pq.poll();
			if (cur+query[1]<0) {
				System.out.println("No");
				return;
			}
			cur+=query[0];
			if (cur<0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
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
