import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {

		FastScanner sc = new FastScanner();
		int H=sc.nextInt();
		int W=sc.nextInt();
		char[][] field=sc.nextCharsHW(H, W);
		int[][] table=new int[H][W];
		int INF=100000;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				table[i][j]=INF;
			}
		}
		int[][] dwdh= {{1,0},{0,1},{-1,0},{0,-1}};
		table[0][0]=0;
		Deque<int[]> queue=new ArrayDeque<int[]>();
		queue.add(new int[] {0,0});
		int[] nextpoint=queue.poll();
		
		while(nextpoint!=null) {
			
			for(int i=0;i<4;i++) {
				int hdh=nextpoint[0]+dwdh[i][0];
				int wdw=nextpoint[1]+dwdh[i][1];
				if(!(hdh>=0 && hdh<H && wdw>=0 && wdw<W)) {
					continue;
				}
				if(field[hdh][wdw]=='#') {
					continue;
				}
				if(table[hdh][wdw]>table[nextpoint[0]][nextpoint[1]]+1) {
					table[hdh][wdw]=table[nextpoint[0]][nextpoint[1]]+1;
					queue.offer(new int[] {hdh,wdw});
				}
				
			}
			nextpoint=queue.poll();
		}
		
		if(table[H-1][W-1]==INF) {
			System.out.println(-1);
		}
		int sum=0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(field[i][j]=='.') {
					sum++;
				}
			}
		}
		System.out.println(sum-table[H-1][W-1]-1);
		
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
	
	public char[][] nextCharsHW(int H,int W){
		char[][] chars=new char[H][W];
		for(int i=0;i<H;i++) {
			String str=next();
			for(int j=0;j<W;j++) {
				chars[i][j]=str.charAt(j);
			}
		}
		return chars;
	}
}
