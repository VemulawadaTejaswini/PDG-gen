import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int H = sc.ni();
		int W = sc.ni();
		char[][] maze = new char[H][W];
		for (int i = 0; i < H; i++) {
			String row = sc.next();
			for (int j = 0; j < W; j++) {
				maze[i][j] = row.charAt(j);
			}
		}
		int dist = 0;
		int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (maze[i][j] == '.') {
					int[][] travel = new int[H][W];
					int d = 0;
					for (int a = 0; a < H; a++) {
						for (int b = 0; b < W; b++) {
							travel[a][b] = Integer.MAX_VALUE/2;
						}
					}
					travel[i][j] = 0;
					ArrayDeque<int[]> bfs = new ArrayDeque<int[]>();
					int[] root = {i,j};
					bfs.add(root);
					while (!bfs.isEmpty()) {
						int[] node = bfs.poll();
						for (int[] dir: dirs) {
							int newR = node[0]+dir[0];
							int newC = node[1]+dir[1];
							if (newR>=0&&newR<H&&newC>=0&&newC<W&& travel[newR][newC]==Integer.MAX_VALUE/2&&maze[newR][newC]=='.') {
								int[] newPos = {newR,newC};
								travel[newR][newC] = travel[node[0]][node[1]]+1;
								d = Math.max(d, travel[newR][newC]);
								bfs.add(newPos);
							}
						}
					}
					
					dist = Math.max(dist, d);
				}
			}
		}
		pw.println(dist);
		pw.close();
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
        	  public int compare(int[] arr1, int[] arr2) {
				  //return arr1[1]-arr2[1]; //ascending order
				  for (int i = 0; i < arr1.length; i++) {
					  if (arr1[i] != arr2[i]) {
						  return arr1[i]-arr2[i];
					  }
				  }
				  return 0;
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
        	  public int compare(long[] arr1, long[] arr2) {
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