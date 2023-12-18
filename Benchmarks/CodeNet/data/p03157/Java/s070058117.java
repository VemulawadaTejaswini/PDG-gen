import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] board = new char[H][W];
		ArrayList<Pair> list = new ArrayList<Pair>();
		for(int i = 0; i < H; i++){
			board[i] = sc.next().toCharArray();
			for(int j = 0; j < W; j++)
				if(board[i][j] == '#') list.add(new Pair(i, j));
		}
		
		int ans = 0;
		for(Pair p : list){
			//System.out.println();
			boolean[][] visited = new boolean[H][W];
			int count = 0;
			LinkedList<Pair> queue = new LinkedList<Pair>();
			queue.addFirst(p);
			
			while(queue.size() != 0){
				
				Pair q = queue.removeFirst();
				visited[q.y][q.x] = true;
				//System.out.println(q.y + " " + q.x);
				int[] dy = {0, -1, 0, 1};
				int[] dx = {1, 0, -1, 0};
				for(int i = 0; i < 4; i++){
					if(q.y + dy[i] >= H || q.y + dy[i] < 0) continue;
					if(q.x + dx[i] >= W || q.x + dx[i] < 0) continue;
					if(visited[q.y+dy[i]][q.x+dx[i]]) continue;
					char now = board[q.y][q.x];
					char next = board[q.y+dy[i]][q.x+dx[i]];
					if(now == next) continue;
					
					if(next == '.'){
						count++;
						//System.out.println("ok : " + (q.y+dy[i]) + " " + (q.x+dx[i]));
					}
					visited[q.y+dy[i]][q.x+dx[i]] = true;
					queue.addLast(new Pair(q.y+dy[i], q.x+dx[i]));
				}
			}
			
			//System.out.println(count);
			ans += count;
		}
		
		System.out.println(ans);
	}//end main
	
}//end Main

class Pair{
	int y; int x;
	public Pair(int y, int x){
		this.x = x;
		this.y = y;
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}
