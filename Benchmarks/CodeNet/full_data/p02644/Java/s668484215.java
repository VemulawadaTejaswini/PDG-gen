import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	static String letters = "abcdefghijklmnopqrstuvwxyz";
	//static final long MOD = 1000000007L;
	static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int H = sc.ni();
		int W = sc.ni();
		int K = sc.ni();
		int[] beg = new int[]{sc.ni()-1,sc.ni()-1};
		int[] end = new int[]{sc.ni()-1,sc.ni()-1};
		boolean[][] leaf = new boolean[H][W];
		//SNEW
		int[][][] maxMove = new int[H][W][4];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				Arrays.fill(maxMove[i][j],INF);
				if (s.charAt(j)=='@')
					leaf[i][j] = true;
			}
		}
		
		if (leaf[beg[0]][beg[1]]||leaf[end[0]][end[1]]) {
			pw.println(-1);
			pw.close();
			return;
		}
		
		for (int i = 0; i < H; i++) {
			ArrayList<Integer> occ = new ArrayList<Integer>();
			occ.add(-1);
			for (int j = 0; j < W; j++) {
				if (leaf[i][j])
					occ.add(j);
			}
			occ.add(W);
			for (int r = 1; r < occ.size(); r++) {
				for (int pos = occ.get(r-1)+1; pos < occ.get(r); pos++)
					maxMove[i][pos][2] = Math.min(K,occ.get(r)-pos-1);
			}
			
			for (int r = occ.size()-1; r >= 1; r--) {
				for (int pos = occ.get(r)-1; pos > occ.get(r-1); pos--)
					maxMove[i][pos][3] = Math.min(K,pos-occ.get(r-1)-1);
			}
		}
		for (int j = 0; j < W; j++) {
			ArrayList<Integer> occ = new ArrayList<Integer>();
			occ.add(-1);
			for (int i = 0; i < H; i++) {
				if (leaf[i][j])
					occ.add(i);
			}
			occ.add(H);
			for (int r = 1; r < occ.size(); r++) {
				for (int pos = occ.get(r-1)+1; pos < occ.get(r); pos++)
					maxMove[pos][j][0] = Math.min(K,occ.get(r)-pos-1);
			}
			
			for (int r = occ.size()-1; r >= 1; r--) {
				for (int pos = occ.get(r)-1; pos > occ.get(r-1); pos--)
					maxMove[pos][j][1] = Math.min(K,pos-occ.get(r-1)-1);
			}
		}
		
		int[][] dist = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++)
				dist[i][j] = INF;
		}
		dist[beg[0]][beg[1]] = 0;
		ArrayDeque<int[]> bfs = new ArrayDeque<int[]>();
		bfs.add(beg);
		int ans = -1;
		int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
		long t1 = System.currentTimeMillis();
		while (!bfs.isEmpty()) {
			int[] cell = bfs.poll();
			if (cell[0]==end[0]&&cell[1]==end[1]) {
				ans = dist[end[0]][end[1]];
				break;
			}
			
			for (int d = 0; d < 4; d++) {
				if (System.currentTimeMillis()-t1 >= 1000) {
					for (int m = 1; m <= maxMove[cell[0]][cell[1]][d]; m++) {
						int newR = cell[0]+dirs[d][0]*m;
						int newC = cell[1]+dirs[d][1]*m;
						if (dist[newR][newC]==INF) {
							dist[newR][newC] = dist[cell[0]][cell[1]]+1;
							bfs.add(new int[]{newR,newC});
						}
					}
				} else {
					for (int m = maxMove[cell[0]][cell[1]][d]; m >= 1; m--) {
						int newR = cell[0]+dirs[d][0]*m;
						int newC = cell[1]+dirs[d][1]*m;
						if (dist[newR][newC]==INF) {
							dist[newR][newC] = dist[cell[0]][cell[1]]+1;
							bfs.add(new int[]{newR,newC});
						}
					}
				}

			}
		}
		
		pw.println(ans);
		
		pw.close();
	}
	
	public static long dist(long[] p1, long[] p2) {
		return (Math.abs(p2[0]-p1[0])+Math.abs(p2[1]-p1[1]));
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
		if (a < b) return gcd(b,a);
		if (b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	//Fast exponentiation (x^y mod m)
	public static long power(long x, long y, long m) { 
		if (y < 0) return 0L;
		long ans = 1;
		x %= m;
		while (y > 0) { 
			if(y % 2 == 1) 
				ans = (ans * x) % m; 
			y /= 2;  
			x = (x * x) % m;
		} 
		return ans; 
	}
	
	public static int[] shuffle(int[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
	public static long[] shuffle(long[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] a, int[] b) {
				  return a[0]-b[0]; //ascending order
	          }
		});
		return array;
	}
    
    public static long[][] sort(long[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<long[]>() {
			  @Override
        	  public int compare(long[] a, long[] b) {
				  if (a[0] < b[0])
					  return -1;
				  else
					  return 1;
	          }
		});
		return array;
	}
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        }
        
        int ni() { 
            return Integer.parseInt(next()); 
        }
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() {
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}