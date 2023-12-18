import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int h=scanner.nextInt();
		int w=scanner.nextInt();
		board=new String[h][w];
		for(int i=0;i<h;i++) {
			board[i]=scanner.next().split("");
		}
		xq=new ArrayDeque<>();
		yq=new ArrayDeque<>();
		set=new HashSet<>();
		long ans=0;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				Point p=new Point(j,i);
				if(set.contains(p))continue;
				xq.add(j);
				yq.add(i);
				set.add(p);
				long black=0;
				long white=0;
				while(!xq.isEmpty()) {
					int x=xq.poll();
					int y=yq.poll();
					if(board[y][x].equals("#"))black++;
					else white++;
					check4Neighborhood(board, x, y);
				}
				ans+=black*white;
			}
		}
		System.out.println(ans);
	}
	
	static String[][] board;
	static Deque<Integer>xq;
	static Deque<Integer>yq;
	static Set<Point>set;
	private static void check4Neighborhood(String[][] s, int x, int y) {
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if ((i == 0 && j != 0) || (i != 0 && j == 0)) {
					int tarX = j + x;
					int tarY = i + y;
					if (0 <= tarX && tarX <= s[0].length - 1 && 0 <= tarY && tarY <= s.length - 1) {
						if (!s[tarY][tarX].equals(s[y][x])) {
							Point p=new Point(tarX,tarY);
							if(set.contains(p))continue;
							xq.add(tarX);
							yq.add(tarY);
							set.add(p);
						}
					}
				}
			}
		}
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
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
