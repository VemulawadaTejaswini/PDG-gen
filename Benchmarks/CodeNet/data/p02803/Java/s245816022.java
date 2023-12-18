import java.util.*;
import java.io.*;

public class Main {
	static int h, w;
	static char[][] maze;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		h = sc.nextInt();
		w = sc.nextInt();
		maze = new char[h][w];
		for(int i = 0; i < h; i++)
			maze[i] = sc.next().toCharArray();
		
		int max = -1;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				Queue<Direction> que = new ArrayDeque<>();
				boolean[][] visited = new boolean[h][w];
				int[][] costs = new int[h][w];	
				que.offer(new Direction(j, i));
				visited[i][j] = true;
				
				while(que.size() > 0) {
					Direction direction = que.poll();
					int x = direction.x; int y = direction.y;
					int cost = costs[y][x];
					if (max < cost) max = cost;
					//北
					if(y != 0 && maze[y-1][x]  == '.' && !visited[y-1][x]) {
						visited[y-1][x] = true;
						costs[y-1][x] = cost + 1;
						que.offer(new Direction(x, y-1));
					}
					//西
					if(x != 0 && maze[y][x-1] == '.' && !visited[y][x-1]) {
						visited[y][x-1] = true;
						costs[y][x-1] = cost + 1;
						que.offer(new Direction(x-1, y));
					}
					//南
					if(y != h - 1 && maze[y+1][x] == '.' && !visited[y+1][x]) {
						visited[y+1][x] = true;
						costs[y+1][x] = cost + 1;
						que.offer(new Direction(x, y+1));
					}
					//東
					if(x != w - 1 && maze[y][x+1] == '.' && !visited[y][x+1]) {
						visited[y][x+1] = true;
						costs[y][x+1] = cost + 1;
						que.offer(new Direction(x+1, y));
					}		
				}						
			}
		}
		out.println(max);

		out.close();
	}
	static class Direction{
		int x;
		int y;
		int cost;
		Direction(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

static class FastScanner {
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
}