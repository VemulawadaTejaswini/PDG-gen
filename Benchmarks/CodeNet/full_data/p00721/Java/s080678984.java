import java.io.*;
import java.math.*;
import java.util.*;


class Main {
	static int[] vy = {1,0,-1,0};
	static int[] vx = {0,1,0,-1};
	static long mod = 1000000007;
	static int[] px;
	static int[] py;
	static char[][] map;
	static int w;
	static int h;
	static int[][] dp;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		//Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;
			map = new char[h][];
			for(int i = 0; i < h; i++) {
				map[i] = sc.next().toCharArray();
			}
			int pi = 0;
			int sx = 0;
			int sy = 0;
			px = new int[11];
			py = new int[11];
			
			IN:for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(map[i][j] == 'o') {
						px[pi] = j;
						py[pi++] = i;
						break IN;
					}
				}
			}
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(map[i][j] == '*') {
						px[pi] = j;
						py[pi++] = i;
					}
				}
			}
			dp = new int[pi][pi];
			for(int i = 0; i < pi; i++) {
				Arrays.fill(dp[i], -1);
			}
			boolean check = true;
			for(int i = 0; i < pi; i++) {
				check &= cal(i,pi);
			}
			int ret = 0;
			if(!check) ret = -1;
			else ret = dfs(0,new boolean[pi],1,0);
			System.out.println(ret);
		}
	}
	static int dfs(int now, boolean[] al, int c, int d) {
		if(c == al.length) return d;
		int ret = 2 << 28;
		for(int i = 1; i < al.length; i++) {
			if(al[i]) continue;
			al[i] = true;
			ret = Math.min(ret, dfs(i,al,c+1,d + dp[now][i]));
			al[i] = false;
		}
		return ret;
	}
	static boolean cal(int id, int pi) {
		ArrayDeque<Data> q = new ArrayDeque<Data>();
		int[][] cc = new int[h][w];
		for(int i = 0; i < h; i++) {
			Arrays.fill(cc[i], 2 << 27);
		}
		q.add(new Data(py[id],px[id],0));
		while(!q.isEmpty()) {
			Data p = q.poll();
			if(cc[p.y][p.x] <= p.c) continue;
			cc[p.y][p.x] = p.c;
			for(int i = 0; i < 4; i++) {
				int tx = p.x + vx[i];
				int ty = p.y + vy[i];
				if(tx < 0 || ty < 0 || tx >= w || ty >= h || cc[ty][tx] <= p.c+1 || map[ty][tx] == 'x') continue;
				q.add(new Data(ty,tx,p.c+1)); 
			}
		}
		for(int i = 0; i < pi; i++) {
			if(cc[py[i]][px[i]] == 2 << 27) return false;
			dp[id][i] = cc[py[i]][px[i]];
		}
		return true;
		
	}
	static class Data {
		int x;
		int y;
		int c;
		Data(int a, int b, int c) {
			x = b;
			y = a;
			this.c = c;
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
	        if (!hasNext()) throw new NoSuchElementException();
	        int n = 0;
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
	}
}