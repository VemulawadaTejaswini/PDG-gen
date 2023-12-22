import java.awt.geom.Point2D;
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Map.*;



class Main {
	static int[][][][][] memo;
	static int INF = 2 << 28;
	static int w;
	static int h;
	static char[][] map;
	public static void main(String[] args) {	
		FastScanner sc = new FastScanner();
		//Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		memo = new int[60][30][60][30][2];
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			
			if(w == 0 && h == 0) break;
			
			
			map = new char[h][w];
			
			for(int i = 0; i < h; i++) {
				
				for(int j = 0; j < w; j++) {
					String in = sc.next();
					map[i][j] = in.charAt(0);
				} 
			}
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					for(int k = 0; k < h; k++) {
						for(int l = 0; l < w; l++) {
							memo[i][j][k][l][0] =  INF;
							memo[i][j][k][l][1] =  INF;
						}
					}
				}
			}
			int ans = INF;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(map[i][j] == 'S') {
						int ret = start(i,j);
						ans = Math.min(ans, ret);
					}
				}
			}
			
			if(ans == INF) {
				System.out.println(-1);
			}
			else {
				System.out.println(ans);
			}
		}
		
	}
	
	static int start(int y, int x) {
		PriorityQueue<Data> q = new PriorityQueue<Data>();
		q.add(new Data(y,x,-1,-1,0,false));
		int ret = solv(q);
		q.clear();
		q.add(new Data(-1,-1,y,x,0,true));
		ret = Math.min(solv(q),ret);
		q.clear();
		return ret;
	}
	static int[] vx = {1,1,2,1,2,3, 1, 2, 1};
	static int[] vy = {2,1,1,0,0,0,-1,-1,-2};
	static int solv(PriorityQueue<Data> q) {
		int ret = INF;
		while(!q.isEmpty()) {
			Data p = q.poll();
			
			if(p.ly == -1 || p.ry == -1) {
				for(int i = 0; i < vx.length; i++) {
					if(p.nextL) {
						int tx = p.rx - vx[i];
						int ty = p.ry + vy[i];
						if(!check(ty,tx,p.ry,p.rx)) continue;
						int time = p.time;
						if(map[ty][tx] != 'T' && map[ty][tx] != 'S') {
							time += map[ty][tx] - '0';
						}
						q.add(new Data(ty,tx,p.ry,p.rx,time,!p.nextL));
						
						
					}
					if(!p.nextL) {
						int tx = p.lx + vx[i];
						int ty = p.ly + vy[i];
						if(!check(p.ly, p.lx, ty,tx)) continue;
						int time = p.time;
						if(map[ty][tx] != 'T' && map[ty][tx] != 'S') {
							time += map[ty][tx] - '0';
						}
						q.add(new Data(p.ly,p.lx,ty,tx,time,!p.nextL));
					}
				}
				continue;
			}
			
			if(memo[p.ly][p.lx][p.ry][p.rx][p.nextL?0:1] <= p.time) continue;
			memo[p.ly][p.lx][p.ry][p.rx][p.nextL?0:1] = p.time;
			if(map[p.ly][p.lx] == 'T') {
				return p.time;
			}
			if(map[p.ry][p.rx] == 'T') {
				return p.time;
			}
			
			for(int i = 0; i < vx.length; i++) {
				if(p.nextL) {
					int tx = p.rx - vx[i];
					int ty = p.ry + vy[i];
					if(!rcheck(ty,tx) || map[ty][tx] == 'X') continue;
					int time = p.time;
					if(map[ty][tx] != 'T' && map[ty][tx] != 'S') {
						time += map[ty][tx] - '0';
					}
					if(memo[ty][tx][p.ry][p.rx][(!p.nextL)?0:1] <= time) continue;
					q.add(new Data(ty,tx,p.ry,p.rx,time,!p.nextL));
					
					
				}
				if(!p.nextL) {
					int tx = p.lx + vx[i];
					int ty = p.ly + vy[i];
					if(!rcheck(ty,tx) || map[ty][tx] == 'X') continue;
					int time = p.time;
					if(map[ty][tx] != 'T' && map[ty][tx] != 'S') {
						time += map[ty][tx] - '0';
					}
					if(memo[p.ly][p.lx][ty][tx][(!p.nextL)?0:1] <= time) continue;
					q.add(new Data(p.ly,p.lx,ty,tx,time,!p.nextL));
				}
			}
			
			
		}
		return ret;
		
		
	}
	static boolean check(int ly, int lx, int ry, int rx) {
		if(!rcheck(ly,lx)) return false;
		if(!rcheck(ry,rx)) return false;
		if(map[ly][lx] == 'X') return false;
		if(map[ry][rx] == 'X') return false;
		return true;
		
	}
	static boolean rcheck(int ty, int tx) {
		if(tx < 0 || ty < 0 || ty >= map.length || tx >= map[ty].length) return false;
		return true;
	}
	static class Data implements Comparable<Data>{
		int ly;
		int lx;
		int ry;
		int rx;
		int time;
		boolean nextL;
		Data(int a, int b, int c, int d, int e, boolean f) {
			ly = a;
			lx = b;
			ry = c;
			rx = d;
			time = e;
			nextL = f;
		}
		@Override
		public int compareTo(Data o) {
			return this.time - o.time;
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