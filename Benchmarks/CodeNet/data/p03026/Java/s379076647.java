import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();

        int[] from = new int[n-1];
        int[] to = new int[n-1];
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Node> list = new ArrayList<>();
        Node.dig = new int[n];
        int[] allo = new int[n];

        for(int i=0;i<n-1;i++){
        	from[i] = sc.nextInt()-1;
        	to[i] = sc.nextInt()-1;
        	Node.dig[from[i]] ++;
        	Node.dig[to[i]] ++;
        }
        
        for(int i=0;i<n;i++){
        	list.add(new Node(i));
        	c.add(sc.nextInt());
        }
        
        Collections.sort(list);
        Collections.sort(c);
        
        for(int i=0;i<n;i++){
        	allo[list.get(i).idx] = c.get(i);
        }
        
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum += Math.min(allo[from[i]], allo[to[i]]);
        }
        
        
        System.out.println(sum);
        
        for(int i=0;i<n;i++){
            System.out.println(allo[i]);
        }
    }

}

class Node implements Comparable<Node>{
	int idx;
	static int[] dig;

	public Node(int idx){
		this.idx = idx;
	}
	
	@Override
	public int compareTo(Node o){
		return Integer.compare(dig[this.idx], dig[o.idx]);
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
		} else {
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
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}