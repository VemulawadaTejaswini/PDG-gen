import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {
	static int h;
	static int w;
	static int[] map;
	static int n;
	static int[][][] piece;
	static int[][]   hp;
	static int[][]   wp;
	

	
	static HashMap<Integer,Boolean> MAP = new HashMap<Integer,Boolean>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			h = sc.nextInt();
			w = sc.nextInt();
			if(h == 0 && w == 0) break;
			MAP.clear();
			map = new int[h];
			for(int i = 0; i < h; i++) {
				String in = sc.next();
				int ix = 0;
				for(int j = 0; j < w; j++) {
					if(in.charAt(j) == '#') {
						ix |= 1 << (w - j - 1);
					}
				}
				map[i] = ix;
			}
			
			n = sc.nextInt();
			piece = new int[n][4][];
			hp = new int[n][4];
			wp = new int[n][4];
			
			for(int i = 0; i < n; i++) {
				int hpx = sc.nextInt();
				int wpx = sc.nextInt();
				
				hp[i][0] = hp[i][2] = wp[i][1] = wp[i][3] = hpx;
				wp[i][0] = wp[i][2] = hp[i][1] = hp[i][3] = wpx;
				
				
				char[][] ps = new char[hpx][wpx];
				for(int j = 0; j < hpx; j++) {
					ps[j] = sc.next().toCharArray();
				}
				for(int j = 0; j < 4; j++) {
					piece[i][j] = new int[hp[i][j]];
					for(int k = 0; k < hp[i][j]; k++) {
						int tmp = 0;
						for(int l = 0; l < wp[i][j]; l++) {
							if(ps[k][l] == '#') {
								tmp |= 1 << (wp[i][j] - l - 1);
							}
						}
						piece[i][j][k] = tmp;
					}
					char[][] pstmp = new char[hp[i][(j+1)%4]][wp[i][(j+1)%4]];
					for(int k = 0; k < hp[i][(j+1)%4]; k++) {
						for(int l = 0; l < wp[i][(j+1)%4]; l++) {
							pstmp[k][l] = ps[l][hp[i][(j+1)%4] - k - 1];
						}
					}
					ps = pstmp;
				}
				
				
			}
			
			
			
			dfs(0,0,0,map);
			int np = sc.nextInt();
			for(int i = 0; i < np; i++) {
				int k1 = sc.nextInt();
				int tmp = 0;
				for(int j = 0; j < k1; j++) {
					int ckk = sc.nextInt();
					tmp |= (1 << ckk-1);
				}
				if(MAP.containsKey(tmp)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			
			
			
		}
		
		
	}
	
	static void dfs(int y, int x,int use, int[] c) {
		
		while((c[y] & (1 << (w - x - 1))) != 0) {
			x++;
			if(x == w) {
				x = 0;
				y++;
			}
			if(y == h) {
				MAP.put(use, true);
				return;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if((use & (1 << i)) == 0) {
				for(int j = 0; j < 4; j++) {
					CON:for(int k = wp[i][j]; k <= w; k++) {
						for(int l = 0; l < hp[i][j]; l++) {
							if((c[y + l] & piece[i][j][l] << (k - wp[i][j])) != 0) continue CON;
						}
						int[] nex = new int[c.length];
						nex = Arrays.copyOf(c, c.length);
						for(int l = 0; l < hp[i][j]; l++) {
							nex[y + l] |=  piece[i][j][l] << (k - wp[i][j]);
						}
						
						dfs(y,x,use | (1 << i),nex);
					}
				}
				
				
				
				
			}
		}

		
		
	}
	
	static void turn(int a) {
		
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
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}