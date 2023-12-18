import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	static final long MOD = 998244353L;
	static final long INF = 1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	//static long[] factorial;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int H = sc.ni();
		int W = sc.ni();
		int B = 0;
		char[][] grid = new char[H][W];
		int[][] dist = new int[H][W];
		for (int i = 0; i < H; i++) {
			String row = sc.next();
			for (int j = 0; j < W; j++) {
				grid[i][j] = row.charAt(j);
				dist[i][j] = Integer.MAX_VALUE;
				if (grid[i][j]=='#')
					B++;
			}
		}
		dist[0][0] = 0;
		ArrayDeque<Point> bfs = new ArrayDeque<Point>();
		bfs.add(new Point(0,0));
		int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
		while (!bfs.isEmpty()) {
			Point p = bfs.poll();
			for (int[] dir: dirs) {
				int r = p.x+dir[0];
				int c = p.y+dir[1];
				if (r >= 0 && c >= 0 && r < H && c < W && grid[r][c]=='.' && dist[r][c]==Integer.MAX_VALUE) {
					dist[r][c] = dist[p.x][p.y]+1;
					bfs.add(new Point(r,c));
				}
			}
		}
		if (dist[H-1][W-1]==Integer.MAX_VALUE) {
			pw.println(-1);
		} else {
			int tot = H*W-dist[H-1][W-1];
			pw.println(tot-B-1);
		}
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
	
	public static int[][] shuffle(int[][] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
 
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] a, int[] b) {
				  //return a[0]-b[0]; //ascending order
				  if (a[1] != b[1]) {
					  return (a[1]-b[1]);
				  } else {
					  return (a[0]-b[0]);
				  }
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
				  else if (a[0] > b[0])
					  return 1;
				  else
					  return 0;
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