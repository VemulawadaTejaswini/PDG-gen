import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	static final long MOD = 1000000007L;
	static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		int[] S = new int[N];
		for (int i = 0; i < N; i++)
			S[i] = sc.ni();
		int[] T = new int[N];
		for (int i = 0; i < N; i++)
			T[i] = sc.ni();
		long[] U = new long[N];
		for (int i = 0; i < N; i++)
			U[i] = sc.nl();
		long[] V = new long[N];
		for (int i = 0; i < N; i++)
			V[i] = sc.nl();
		long[][] grid = new long[N][N];
		for (int i = 0; i < N; i++) {
			int[] r =  new int[64];
			for (int b = 0; b < 64; b++) {
				if ((U[i]&(1L<<b)) > 0)
					r[b] = 1;
			}
			int[][] vals = new int[N][64];
			for (int j = 0; j < N; j++) {
				for (int b = 0; b < 64; b++) {
					if ((V[j]&(1L<<b)) > 0)
						vals[j][b] = 1;
				}
			}
			if (S[i] == 0) {
				//AND-row
				for (int j = 0; j < N; j++) {
					if (T[j] == 0) {
						//AND col
						for (int b = 0; b < 64; b++) {
							vals[j][b] |= r[b];
						}
					} else {
						//OR col
						for (int b = 0; b < 64; b++) {
							if (r[b] == 1 && vals[j][b] == 0) {
								pw.println(-1);
								pw.close();
								return;
							}
						}
					}
				}
			} else {
				//OR-row
				for (int j = 0; j < N; j++) {
					if (T[j] == 0) {
						//AND col
						for (int b = 0; b < 64; b++) {
							if (r[b] == 0 && vals[j][b] == 1) {
								pw.println(-1);
								pw.close();
								return;
							}
						}
					} else {
						//OR col
						for (int b = 0; b < 64; b++)
							vals[j][b] &= r[b];
					}
				}
			}
			
			for (int j = 0; j < N; j++) {
				for (int b = 0; b < 64; b++) {
					if (vals[j][b] == 1)
						grid[i][j] += (1L<<b);
				}
			}
		}
		for (int i = 0; i < N; i++) {
			long num =grid[i][0];
			for (int j = 0; j < N; j++) {
				if (S[i] == 0)
					num &= grid[i][j];
				else
					num |= grid[i][j];
			}
			if (num != U[i]) {
				pw.println(-1);
				pw.close();
				return;
			}
		}
		for (int j = 0; j < N; j++) {
			long num = grid[0][j];
			for (int i = 0; i < N; i++) {
				if (T[i] == 0)
					num &= grid[i][j];
				else
					num |= grid[i][j];
			}
			if (num != V[j]) {
				pw.println(-1);
				pw.close();
				return;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				pw.print(grid[i][j] + " ");
			pw.println();
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